package com.aiuiot.luckmoney.controller;

import com.aiuiot.luckmoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author aiuiot
 * @Date 2019-04-13 21:21
 *
 * @Controller + @ResponseBody = @RestController
 *
 * @Controller
 * @ResponseBody 该注解也可以放在方法上
 * 以上两个注解加起来等于 @RestController
 *
 **/

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;    //红包最小金额 BigDecimal类型
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;


    //使用数组填写路径，可以多路径访问
    @GetMapping({"/say", "/hi"}) //新版本的注解
    //@PostMapping("/say") //post方式
    //@RequestMapping("/say")
    //@RequestMapping(value = "/hello", methos = RequestMethod.GET) //springboot 1.0版本的注解
    //@ResponseBody
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myid){

        return "说明:"+ limitConfig.getDescription()+"ID:"+myid;
    }

    @GetMapping("/index")
    public String say2(){
        return "index"; //返回一个模版文件（html）
    }
}
