package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.asyncTask.AsyncTask;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api/v1/pub/test")
@PropertySource({"classpath:pay.properties"})
public class TestController {

    @Value("${wxpay.appid}")
    private String wxPayAppid;

    @Value("${wxpay.secret}")
    private String paySecret;

    @Autowired
    private WxConfig config;

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("async")
    public JsonData taskAsync() {
        long begin = System.currentTimeMillis();
//        asyncTask.task1();
//        asyncTask.task2();
//        asyncTask.task3();
        Future<String> task4 = asyncTask.task4();
        Future<String> task5 = asyncTask.task5();
        for (;;) {
            if(task4.isDone() && task5.isDone()) {
                try {
                    String task4Result = task4.get();
                    System.out.println(task4Result);
                    String task5Result = task5.get();
                    System.out.println(task5Result);
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        return JsonData.buildSuccess(end - begin);
    }

    @GetMapping("list")
    public JsonData testExt() {
        int i = 1 / 0;
        return JsonData.buildSuccess("");
    }

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
