package com.QH.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.web.controller
 * @date 2022/8/14 19:53
 */

@Controller
public class ErrorPageController {
    @RequestMapping("/settings/error/to404Page.do")
    public String to404Page() {
        return "settings/error/404page";
    }
}

