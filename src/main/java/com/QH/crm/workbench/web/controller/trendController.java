package com.QH.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.web.controller
 * @date 2022/8/15 9:39
 */
@Controller
public class trendController {
    /**
     * 显示动态界面
     */
    @RequestMapping("/workbench/trend/index.do")
    public String index() {
        return "workbench/trend/index";
    }
}
