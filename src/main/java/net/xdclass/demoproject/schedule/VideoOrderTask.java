package net.xdclass.demoproject.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 定时统计订单,金额
 */
@Component
public class VideoOrderTask {

    //每两秒执行一次,上次执行开始后两秒开始执行
    //@Scheduled(fixedRate = 4000)
    //每两秒执行一次,上次执行结束后两秒开始执行
    //@Scheduled(fixedDelay = 4000)
    //@Scheduled(cron = "*/1 * * * * *")
    public void sum() throws InterruptedException {
//        Thread.sleep(2000L);
        System.out.println(LocalDateTime.now() + "当前交易额=" + Math.random() * 100);
    }
}
