package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1, "Java基础课程，JDK1.8新特性"));
        videoMap.put(2, new Video(2, "Springboot2.x教程"));
        videoMap.put(3, new Video(3, "微服务SpringCloud全家桶"));
        videoMap.put(4, new Video(4, "微信Springboot实战视频"));
        videoMap.put(5, new Video(5, "小D课堂面试专题300道连环问"));
    }

    /**
     * 获取全量视频列表
     * @return 全量视频列表
     */
    public List<Video> queryAllVideoList() {
        List<Video> videoList = new ArrayList<>();
        videoList.addAll(videoMap.values());
        return videoList;
    }

}
