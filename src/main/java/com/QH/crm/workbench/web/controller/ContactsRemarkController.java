package com.QH.crm.workbench.web.controller;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.commons.domain.ReturnObject;
import com.QH.crm.commons.utils.DateUtils;
import com.QH.crm.commons.utils.UUIDUtils;
import com.QH.crm.settings.model.User;
import com.QH.crm.workbench.model.ContactsRemark;
import com.QH.crm.workbench.service.ContactsRemarkService;
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
 * @date 2022/8/15 12:45
 */

@Controller
public class ContactsRemarkController {
    @Autowired
    private ContactsRemarkService contactsRemarkService;

    @RequestMapping("/workbench/contacts/saveCreateContactsRemark.do")
    @ResponseBody
    public Object saveCreateContactsRemark(ContactsRemark contactsRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        contactsRemark.setCreateBy(user.getId());
        contactsRemark.setCreateTime(DateUtils.formatDateTime(new Date()));
        contactsRemark.setId(UUIDUtils.getUUID());
        contactsRemark.setEditFlag(Constants.REMARK_FLAG_NO_EDITED);
        ReturnObject returnObject = new ReturnObject();
        // 插入操作
        try {
            // 保存联系人备注
            int res = contactsRemarkService.saveCreateContactsRemark(contactsRemark);
            if (res > 0) { // 插入成功
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(contactsRemark); // 将备注也传到前端响应到页面
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

    @RequestMapping("/workbench/contacts/deleteContactsRemarkById.do")
    @ResponseBody
    public Object deleteContactsRemarkById(String id) {
        ReturnObject returnObject = new ReturnObject();
        // 删除操作
        try {
            // 删除联系人备注
            int res = contactsRemarkService.deleteContactsRemarkById(id);
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

    @RequestMapping("/workbench/contacts/saveEditContactsRemark.do")
    @ResponseBody
    public Object saveEditContactsRemark(ContactsRemark contactsRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        contactsRemark.setEditFlag(Constants.REMARK_FLAG_EDITED);
        contactsRemark.setEditBy(user.getId());
        contactsRemark.setEditTime(DateUtils.formatDateTime(new Date()));
        ReturnObject returnObject = new ReturnObject();
        try {
            int res = contactsRemarkService.saveEditContactsRemark(contactsRemark);
            if (res > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(contactsRemark);
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

