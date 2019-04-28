package com.aiuiot.luckmoney.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 使用JPA 可以不用写sql
 * @Author aiuiot
 * @Date 2019-04-14 03:12
 **/
@Entity
public class Luckymoney {

    @Id
    @GeneratedValue
    private Integer id; //id

    private BigDecimal money;   //红包金额

    private String producer;    //发送方

    private String consumer;    //接收方

    //jpa需要一个空的构造方法
    public Luckymoney() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
