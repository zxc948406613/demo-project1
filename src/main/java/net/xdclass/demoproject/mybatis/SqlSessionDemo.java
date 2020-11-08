package net.xdclass.demoproject.mybatis;

import net.xdclass.demoproject.dao.VideoMapper;
import net.xdclass.demoproject.dao.VideoOrderMapper;
import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class SqlSessionDemo {
    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
            //查询单个Video
//            Video video = videoMapper.selectById(30);
//            System.out.println(video.toString());

            //查询视频列表
//            List<Video> videoList = videoMapper.selectList();
//            for (Video video1 : videoList) {
//                System.out.println(video1.toString());
//            }

            //根据条件模糊查询
//            Video video2 = videoMapper.selectByPointAndTitleLike(8.80, "%HTML%");
//            System.out.println(video2.toString());

            //新增一条视频记录
//            Video video3 = new Video();
//            video3.setTitle("小D课堂面试专题300道");
//            video3.setCoverImg("xdclass.net/aaa.png");
//            video3.setPoint(9.4);
//            video3.setPrice(9900);
//            video3.setCreateTime(new Date());
//            video3.setSummary("这是面试专题概要");
//            int rows = videoMapper.add(video3);

            //批量插入视频记录
//            Video video4 = new Video();
//            video4.setTitle("小D课堂数学题");
//            video4.setCoverImg("xdclass.net/aaa.png");
//            video4.setPoint(9.4);
//            video4.setPrice(9900);
//            video4.setCreateTime(new Date());
//            video4.setSummary("这是面试专题概要");
//            Video video5 = new Video();
//            video5.setTitle("小D课堂英语题");
//            video5.setCoverImg("xdclass.net/aaa.png");
//            video5.setPoint(9.4);
//            video5.setPrice(9900);
//            video5.setCreateTime(new Date());
//            video5.setSummary("这是面试专题概要");
//            List<Video> videoList = new ArrayList<>();
//            videoList.add(video4);
//            videoList.add(video5);
//            int rows = videoMapper.batchAdd(videoList);
//            System.out.println(videoList.toString());
            //全量更新
//            Video video6 = new Video();
//            video6.setId(55);
//            video6.setTitle("小D课堂德语题");
//            video6.setCoverImg("xdclass.net/bbb.png");
//            video6.setPoint(9.80);
//            video6.setPrice(9800);
//            video6.setCreateTime(new Date());
//            video6.setSummary("这是韩语专题概要");
//            int rows = videoMapper.updateVideo(video6);

            //  动态更新
//            Video video7 = new Video();
//            video7.setId(55);
//            video7.setTitle("小D课堂德语题");
//            video7.setCoverImg("xdclass.net/bbb.png");
//            video7.setPoint(9.80);
//            video7.setCreateTime(new Date());
//            video7.setSummary("这是韩语专题概要");
//            int rows = videoMapper.updateVideoSelective(video7);

            //删除操作
//            Map<String, Object> map = new HashMap<>();
//            map.put("createTime", "2021-09-01 09:33:23");
//            map.put("price", 9000);
//            int rows = videoMapper.deleteByCreateTimeAndPrice(map);

            //映射map根据id查询实体
//            Video video8 = videoMapper.selectBaseFieldByIdWithResultMap(45);
//            System.out.println(video8.toString());
            //一对一关联查询 association
//            List<VideoOrder> videoOrderList = videoOrderMapper.queryVideoOrderList();
//            System.out.println(videoOrderList.toString());
            //一对多集合查询 collection
//            List<User> userList = videoOrderMapper.queryUserOrder();
//            System.out.println(userList);
            //懒加载
            List<VideoOrder> videoOrderList = videoOrderMapper.queryVideoOrderListLazy();
            for(VideoOrder videoOrder : videoOrderList) {
//                System.out.println(videoOrder.getVideoTitle());
                System.out.println(videoOrder.getUser().getName());
            }
        }
    }
}
