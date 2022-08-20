package com.QH.crm.workbench.web.controller;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.commons.domain.ReturnObject;
import com.QH.crm.commons.utils.DateUtils;
import com.QH.crm.commons.utils.UUIDUtils;
import com.QH.crm.settings.model.User;
import com.QH.crm.settings.service.UserService;
import com.QH.crm.workbench.model.Customer;
import com.QH.crm.workbench.model.CustomerRemark;
import com.QH.crm.workbench.service.CustomerRemarkService;
import com.QH.crm.workbench.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.web.controller
 * @date 2022/8/15 11:40
 */
@Controller
public class CustomerController {
    @Autowired
    private UserService userService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRemarkService customerRemarkService;

    /**
     * 跳转到客户界面
     *
     * @param request 请求
     * @return 前端界面
     */
    @RequestMapping("/workbench/customer/index.do")
    private String index(HttpServletRequest request) {
        //查询页面基本信息
        List<User> userList = userService.queryAllUsers();
        //将查询信息存放到request域中
        request.setAttribute("userList", userList);
        return "workbench/customer/index";
    }

    @RequestMapping("/workbench/customer/queryCustomerByConditionForPage.do")
    @ResponseBody
    private Object queryCustomerByConditionForPage(String name, String owner, String phone, String website,
                                                   int pageNo, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        // 封装条件参数
        map.put("name", name);
        map.put("owner", owner);
        map.put("phone", phone);
        map.put("website", website);
        map.put("beginNo", (pageNo - 1) * pageSize);
        map.put("pageSize", pageSize);
        // 由参数查询数据
        List<Customer> customerList = customerService.queryCustomerByConditionForPage(map);
        int totalRows = customerService.queryCountOfCustomerByCondition(map);
        // 封装查询参数，传给前端操作
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("customerList", customerList);
        resultMap.put("totalRows", totalRows);
        return resultMap;
    }

    @RequestMapping("/workbench/customer/saveCreateCustomer.do")
    @ResponseBody
    public Object saveCreateCustomer(Customer customer, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 补充参数
        customer.setCreateBy(user.getId());
        customer.setCreateTime(DateUtils.formatDateTime(new Date()));
        customer.setId(UUIDUtils.getUUID());
        ReturnObject returnObject = new ReturnObject();
        try {
            int ret = customerService.saveCreateCustomer(customer);
            if (ret > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
            } else {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
                returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
            }
        } catch (Exception e) {
            e.printStackTrace();
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
            returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
        }
        return returnObject;
    }

    @RequestMapping("/workbench/customer/queryCustomerById.do")
    @ResponseBody
    public Object queryCustomerById(String id) {
        return customerService.queryCustomerById(id);
    }

    @RequestMapping("/workbench/customer/saveEditCustomer.do")
    @ResponseBody
    public Object saveEditCustomer(Customer customer, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        //补充参数
        customer.setEditBy(user.getId());
        customer.setEditTime(DateUtils.formatDateTime(new Date()));
        ReturnObject returnObject = new ReturnObject();
        try {
            // 保存更新的对应id的客户
            int ret = customerService.saveEditCustomer(customer);
            if (ret > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
            } else {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
                returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
            }
        } catch (Exception e) {
            e.printStackTrace();
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
            returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
        }
        return returnObject;
    }

    @RequestMapping("/workbench/customer/deleteCustomerByIds.do")
    @ResponseBody
    private Object deleteCustomerByIds(String[] id) {
        ReturnObject returnObject = new ReturnObject();
        try {
            customerService.deleteCustomer(id);
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);

        } catch (Exception e) {
            e.printStackTrace();
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
            returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
        }
        return returnObject;
    }
    @RequestMapping("/workbench/customer/detailCustomer.do")
    private String detailCustomer(String id, HttpServletRequest request){
        // 查询对应的客户信息
        Customer customer = customerService.queryCustomerForDetailById(id);
        // 查询对应的客户备注信息
        List<CustomerRemark> customerRemarkList = customerRemarkService.queryCustomerRemarkForDetailByCustomerId(id);
        // 将参数存放到request域中
        request.setAttribute("customer", customer);
        request.setAttribute("customerRemarkList", customerRemarkList);
        return "workbench/customer/detail";
    }
}
