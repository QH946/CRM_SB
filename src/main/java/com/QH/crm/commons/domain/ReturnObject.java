package com.QH.crm.commons.domain;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.commons.domain
 * @date 2022/8/6 15:59
 */
/**
 * // 返回给前端的 后端响应信息的封装类，用于发送给前端转为json字符串
 */
public class ReturnObject {
    private String code;//处理成败的标记：1--成功，0--失败
    private String message;//提示信息
    private Object returnData;//其它数据

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getReturnData() {
        return returnData;
    }

    public void setReturnData(Object returnData) {
        this.returnData = returnData;
    }
}
