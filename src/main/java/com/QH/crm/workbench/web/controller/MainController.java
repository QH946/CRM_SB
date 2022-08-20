package com.QH.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.web.controller
 * @date 2022/8/8 13:55
 */
@Controller
public class MainController {
    /**
     * 显示工作台界面
     * @return 工作台界面
     */
    @RequestMapping("/workbench/main/index.do")
    public String index() {
        //跳转
        return "workbench/main/index";
    }
}
