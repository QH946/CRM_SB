package com.QH.crm.workbench.web.controller;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.commons.domain.ReturnObject;
import com.QH.crm.commons.utils.DateUtils;
import com.QH.crm.commons.utils.UUIDUtils;
import com.QH.crm.settings.model.User;
import com.QH.crm.workbench.model.TranRemark;
import com.QH.crm.workbench.service.TranRemarkService;
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
 * @date 2022/8/15 12:44
 */
@Controller
public class TranRemarkController {
    @Autowired
    private TranRemarkService tranRemarkService;

    @RequestMapping("/workbench/tran/saveCreateTranRemark.do")
    @ResponseBody
    public Object saveCreateTranRemark(TranRemark tranRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        tranRemark.setCreateBy(user.getId());
        tranRemark.setCreateTime(DateUtils.formatDateTime(new Date()));
        tranRemark.setEditFlag(Constants.REMARK_FLAG_NO_EDITED);
        tranRemark.setId(UUIDUtils.getUUID());
        ReturnObject returnObject = new ReturnObject();
        // 插入操作
        try {
            // 保存交易备注
            int res = tranRemarkService.saveCreateTranRemark(tranRemark);
            if (res > 0) { // 插入成功
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(tranRemark); // 将备注也传到前端响应到页面
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

    @RequestMapping("/workbench/tran/deleteTranRemarkById.do")
    @ResponseBody
    public Object deleteTranRemarkById(String id) {
        ReturnObject returnObject = new ReturnObject();
        // 删除操作
        try {
            // 删除备注
            int res = tranRemarkService.deleteTranRemarkById(id);
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

    @RequestMapping("/workbench/tran/saveEditTranRemark.do")
    @ResponseBody
    public Object saveEditTranRemark(TranRemark tranRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        tranRemark.setEditFlag(Constants.REMARK_FLAG_EDITED);
        tranRemark.setEditBy(user.getId());
        tranRemark.setEditTime(DateUtils.formatDateTime(new Date()));
        ReturnObject returnObject = new ReturnObject();
        try {
            int res = tranRemarkService.saveEditTranRemark(tranRemark);
            if (res > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(tranRemark);
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
