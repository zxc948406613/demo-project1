package net.xdclass.demoproject.dao;

import net.xdclass.demoproject.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

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

    /**
     * 批量插入视频记录
     * @param videoList 视频列表
     * @return
     */
    int batchAdd(List<Video> videoList);

    /**
     * 全量更新视频（如果有空字段也会更新上去)
     * @param video 需要更新的视频实体
     * @return
     */
    int updateVideo(Video video);

    /**
     * 动态更新视频(会判断是否有空字段，有的话不更新上去）
     * @param video 需要更新的视频实体
     * @return
     */
    int updateVideoSelective(Video video);

    /**
     * 按条件删除视频实体
     * @param map
     * @return
     */
    int deleteByCreateTimeAndPrice(Map<String, Object> map);

    /**
     * 使用映射map，通过id来查询基础字段
     * @param id id
     * @return video实体类
     */
    Video selectBaseFieldByIdWithResultMap(@Param("video_id")int id);
}
