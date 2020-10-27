package net.xdclass.demoproject.dao;

import net.xdclass.demoproject.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    /**
     * 根据视频id查询视频对象
     * @param videoId 视频id
     * @return 视频对象
     */
    Video selectById(@Param("video_id") int videoId);

    /**
     * 查询全部视频列表
     * @return 全部视频列表
     */
    @Select("select * from video")
    List<Video> selectList();

    /**
     * 根据评分和标题模糊查询视频
     * @param point 评分
     * @param title 标题
     * @return 视频
     */
    Video selectByPointAndTitleLike(double point,  String title);

    /**
     * 新增一条视频记录
     * @return
     */
    int add(Video video);
}
