package net.xdclass.demoproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

@Configuration
/*
使用这个注解需要引入pom依赖：
       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
 */
@ConfigurationProperties(prefix = "pay")
@PropertySource({"classpath:pay.properties"})
public class WxConfig implements Serializable {
    @Value("${wxpay.appid}")
    private String wxPayAppid;

    @Value("${wxpay.secret}")
    private String paySecret;

    @Value("${wxpay.mechid}")
    private String wxPayMechid;

    public String getWxPayAppid() {
        return wxPayAppid;
    }

    public void setWxPayAppid(String wxPayAppid) {
        this.wxPayAppid = wxPayAppid;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getWxPayMechid() {
        return wxPayMechid;
    }

    public void setWxPayMechid(String wxPayMechid) {
        this.wxPayMechid = wxPayMechid;
    }
}
