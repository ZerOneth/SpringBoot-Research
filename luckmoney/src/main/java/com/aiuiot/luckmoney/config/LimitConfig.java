package com.aiuiot.luckmoney.config;




import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 限制配置 限制最大值 和 最小值
 * @Author aiuiot
 * @Date 2019-04-14 00:06
 **/
@Component
@EnableConfigurationProperties(LimitConfig.class)   //使使用 @ConfigurationProperties 注解的类生效
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    private BigDecimal minMoney;    //最小金额

    private BigDecimal maxMoney;    //最大金额

    private String description; //描述

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
