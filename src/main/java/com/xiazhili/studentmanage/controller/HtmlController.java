package com.xiazhili.studentmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/index")
    public String manageHtml() {
        return "manage";
    }
}
