package com.QH.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.web.controller
 * @date 2022/8/7 11:24
 */
@Controller
public class WorkbenchIndexController {
    /**
     * 登陆后进入的业务初始界面
     * @return 业务初始界面
     */
    @RequestMapping("/workbench/index.do")
    public String index() {
        return "workbench/index";
    }
}
