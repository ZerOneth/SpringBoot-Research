package com.aiuiot.luckmoney.controller;

import com.aiuiot.luckmoney.service.LuckymoneyService;
import com.aiuiot.luckmoney.dao.LuckmoneyRepository;
import com.aiuiot.luckmoney.entity.Luckymoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @Author aiuiot
 * @Date 2019-04-14 03:22
 **/

@RestController
public class LuckmoneyController {

    @Autowired
    private LuckmoneyRepository repository;

    @Autowired
    private LuckymoneyService service;

    /**
     * 获取红包列表
     */
    @GetMapping("/luckmoneys")
    public List<Luckymoney> list(){
        return repository.findAll();
    }

    /**
     * 创建红包
     * 需要传参数 使用注解
     */
    @PostMapping("/luckmoneys")
    public Luckymoney create(@RequestParam("producer") String producer,
                             @RequestParam("money") BigDecimal money){

        //创建 Luckymoney 对象
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);

        return repository.save(luckymoney);
    }

    /**
     * 通过id查询红包
     */
    @GetMapping("/luckmoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id){
        return repository.findById(id).orElse(null);//如果查不到，返回null
    }


    /**
     * 更新红包（领红包）
     */
    @PutMapping("/luckmoneys/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam("consumer") String consumer){
        //先查询数据
        Optional<Luckymoney> optional = this.repository.findById(id);
        //如果有内容
        if (optional.isPresent()){
            //获取数据库内中的内容
            Luckymoney luckymoney = optional.get();
            luckymoney.setConsumer(consumer);
            return this.repository.save(luckymoney);
        }
        return null;
    }

    @PostMapping("/luckmoneys/two")
    public void createTwo() {
        service.createTwo();
    }

}
