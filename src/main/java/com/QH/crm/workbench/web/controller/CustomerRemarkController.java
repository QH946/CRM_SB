package com.QH.crm.workbench.web.controller;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.commons.domain.ReturnObject;
import com.QH.crm.commons.utils.DateUtils;
import com.QH.crm.commons.utils.UUIDUtils;
import com.QH.crm.settings.model.User;
import com.QH.crm.settings.service.UserService;
import com.QH.crm.workbench.model.CustomerRemark;
import com.QH.crm.workbench.service.CustomerRemarkService;
import com.QH.crm.workbench.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.web.controller
 * @date 2022/8/15 12:43
 */
@Controller
public class CustomerRemarkController {
    @Autowired
    CustomerRemarkService customerRemarkService;

    @RequestMapping("/workbench/customer/saveCreateCustomerRemark.do")
    @ResponseBody
    public Object saveCreateCustomerRemark(CustomerRemark customerRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        customerRemark.setCreateBy(user.getId());
        customerRemark.setCreateTime(DateUtils.formatDateTime(new Date()));
        customerRemark.setEditFlag(Constants.REMARK_FLAG_NO_EDITED);
        customerRemark.setId(UUIDUtils.getUUID());
        ReturnObject returnObject = new ReturnObject();
        // 插入操作
        try {
            // 保存客户备注
            int res = customerRemarkService.saveCreateCustomerRemark(customerRemark);
            if (res > 0) { // 插入成功
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(customerRemark); // 将备注也传到前端响应到页面
            } else { // 插入失败，服务器端出了问题，为了不影响顾客体验，最好不要直接说出问题
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
                returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
            }
        } catch (Exception e) { // 发生了某些异常，捕获后返回信息
            e.printStackTrace();
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
            returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
        }
        return returnObject;
    }

    @RequestMapping("/workbench/customer/deleteCustomerRemarkById.do")
    @ResponseBody
    public Object deleteCustomerRemarkById(String id) {
        ReturnObject returnObject = new ReturnObject();
        // 删除操作
        try {
            // 删除客户备注
            int res = customerRemarkService.deleteCustomerRemarkById(id);
            if (res > 0) { // 删除成功
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
            } else { // 删除失败，服务器端出了问题，为了不影响顾客体验，最好不要直接说出问题
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
                returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
            }
        } catch (Exception e) { // 发生了某些异常，捕获后返回信息
            e.printStackTrace();
            returnObject.setCode(Constants.RETURN_OBJECT_CODE_FAILURE);
            returnObject.setMessage(Constants.SYSTEM_STATE_BUSY);
        }
        return returnObject;
    }

    @RequestMapping("/workbench/customer/saveEditCustomerRemark.do")
    @ResponseBody
    public Object saveEditCustomerRemark(CustomerRemark customerRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        customerRemark.setEditFlag(Constants.REMARK_FLAG_EDITED);
        customerRemark.setEditBy(user.getId());
        customerRemark.setEditTime(DateUtils.formatDateTime(new Date()));
        ReturnObject returnObject = new ReturnObject();
        try {
            int res = customerRemarkService.saveEditCustomerRemark(customerRemark);
            if (res > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(customerRemark);
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
}

