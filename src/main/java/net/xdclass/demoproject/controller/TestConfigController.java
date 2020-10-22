package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WxConfig;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pub/test")
@PropertySource({"classpath:pay.properties"})
public class TestConfigController {

    @Value("${wxpay.appid}")
    private String wxPayAppid;

    @Value("${wxpay.secret}")
    private String paySecret;

    @Autowired
    private WxConfig config;

    @GetMapping("get_config")
    public JsonData testConfig() {
        Map<String, String> map = new HashMap<>();
//        map.put("appid", wxPayAppid);
//        map.put("paySecret", paySecret);
//        return JsonData.buildSuccess(map);

        map.put("appid", config.getWxPayAppid());
        map.put("paySecret", config.getPaySecret());
        map.put("wxPayMechid", config.getWxPayMechid());
        return JsonData.buildSuccess(map);
    }

}
