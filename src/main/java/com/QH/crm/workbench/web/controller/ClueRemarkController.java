package com.QH.crm.workbench.web.controller;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.commons.domain.ReturnObject;
import com.QH.crm.commons.utils.DateUtils;
import com.QH.crm.commons.utils.UUIDUtils;
import com.QH.crm.settings.model.User;
import com.QH.crm.workbench.model.ClueRemark;
import com.QH.crm.workbench.service.ClueRemarkService;
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
 * @date 2022/8/14 13:26
 */
@Controller
public class ClueRemarkController {
    @Autowired
    private ClueRemarkService clueRemarkService;

    /**
     * 保存创建的线索备注
     * @param clueRemark 前端传来的线索备注参数
     * @param session 当前页面的的session对象
     * @return 响应到前端端的信息
     */
    @RequestMapping("/workbench/clue/saveCreateClueRemark.do")
    @ResponseBody
    public Object saveCreateClueRemark(ClueRemark clueRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        clueRemark.setId(UUIDUtils.getUUID());
        clueRemark.setCreateTime(DateUtils.formatDateTime(new Date()));
        clueRemark.setCreateBy(user.getId());
        clueRemark.setEditFlag(Constants.REMARK_FLAG_NO_EDITED);
        ReturnObject returnObject = new ReturnObject();
        // 插入操作
        try {
            // 保存线索备注
            int res = clueRemarkService.saveCreateClueRemark(clueRemark);
            if (res > 0) { // 插入成功
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(clueRemark); // 将备注也传到前端响应到页面
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

    /**
     * 删除线索备注
     * @param id 线索备注的id
     * @return 响应到前端端的信息
     */
    @RequestMapping("/workbench/clue/deleteClueRemarkById.do")
    @ResponseBody
    public Object deleteClueRemarkById(String id) {
        ReturnObject returnObject = new ReturnObject();
        // 删除操作
        try {
            // 删除线索备注
            int res = clueRemarkService.deleteClueRemarkById(id);
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

    /**
     * 保存编辑的线索备注
     * @param clueRemark 线索备注
     * @param session 当前页面的session对象
     * @return 响应到前端端的信息
     */
    @RequestMapping("/workbench/clue/saveEditClueRemark.do")
    @ResponseBody
    public Object saveEditClueRemark(ClueRemark clueRemark, HttpSession session) {
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        // 封装参数
        clueRemark.setEditFlag(Constants.REMARK_FLAG_EDITED);
        clueRemark.setEditBy(user.getId());
        clueRemark.setEditTime(DateUtils.formatDateTime(new Date()));
        ReturnObject returnObject = new ReturnObject();
        try {
            int res = clueRemarkService.saveEditClueRemark(clueRemark);
            if (res > 0) {
                returnObject.setCode(Constants.RETURN_OBJECT_CODE_SUCCESS);
                returnObject.setReturnData(clueRemark);
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
