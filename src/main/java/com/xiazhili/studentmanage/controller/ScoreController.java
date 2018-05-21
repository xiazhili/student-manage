package com.xiazhili.studentmanage.controller;

import com.xiazhili.studentmanage.service.ScoreSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreSerivce scoreSerivce;

    @GetMapping("/test")
    public Object test(Integer first, Integer last) {
        scoreSerivce.test(first, last);
        return "success";
    }

    @GetMapping("/list")
    public Object list(Integer page) {

        return scoreSerivce.list(page);
    }

}
