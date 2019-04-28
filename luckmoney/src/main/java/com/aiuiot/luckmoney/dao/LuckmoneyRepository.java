package com.aiuiot.luckmoney.dao;

import com.aiuiot.luckmoney.entity.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author aiuiot
 * @Date 2019-04-14 03:24
 * 持久层接口，需要继承jpa
 * JpaRepository第一个参数为实体类 第二个参数为主键的类型
 *
 **/
public interface  LuckmoneyRepository extends JpaRepository<Luckymoney,Integer> {

}
