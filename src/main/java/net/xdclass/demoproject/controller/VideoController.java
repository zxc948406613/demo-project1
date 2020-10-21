package net.xdclass.demoproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频controller
 */
//@controller不会返回json数据的,它返回的是页面，所以用restController
//@RestController = @Controller + @ResponseBody
//@RequestMapping = @GetMapping/@PostMapping等
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @RequestMapping("list")
    public Object list() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "面试专题");
        map.put("2", "springCloud微服务课程");
        return map;
    }
}
