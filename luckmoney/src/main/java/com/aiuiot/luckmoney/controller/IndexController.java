package com.aiuiot.luckmoney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author aiuiot
 * @Date 2019-04-22 01:21
 **/

@RestController
public class IndexController {

    @GetMapping("/index1")
    public String index(){
        return "about";
    }

}
