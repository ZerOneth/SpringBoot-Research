package com.aiuiot.luckmoney.service;

import com.aiuiot.luckmoney.dao.LuckmoneyRepository;
import com.aiuiot.luckmoney.entity.Luckymoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Author aiuiot
 * @Date 2019-04-14 17:16
 **/
@Service
public class LuckymoneyService {
    @Autowired
    private LuckmoneyRepository repository;

    //创建两个红包

    /**
     * 事务 值的是数据库的事务
     *
     * 应用：
     * 买东西：
     *  扣库存 -> 创建订单
     */
    @Transactional  //加入注入事务
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("王师傅");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("王师傅");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);

    }
}
