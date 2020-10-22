package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 视频controller
 */
/*
@controller不会返回json数据的,它返回的是页面，所以用restController
@RestController = @Controller + @ResponseBody
@RequestMapping = @GetMapping/@PostMapping等
*/

@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //@RequestMapping(value = "list", method = RequestMethod.GET)
    @GetMapping(value = "list")
    public JsonData list() {
        List<Video> videoList = videoService.queryAllVideoList();
        return JsonData.buildSuccess(videoList);
    }

    @PostMapping(value = "save_video")
    public JsonData saveVideo(@RequestBody Video video) {
        System.out.println(video.toString());
        return JsonData.buildSuccess("保存成功");
    }
}
