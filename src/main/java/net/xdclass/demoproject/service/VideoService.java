package net.xdclass.demoproject.service;

import net.xdclass.demoproject.domain.Video;

import java.util.List;

public interface VideoService {

    /**
     * 全量获取视频列表
     * @return 全量视频列表
     */
    List<Video> queryAllVideoList();

}
