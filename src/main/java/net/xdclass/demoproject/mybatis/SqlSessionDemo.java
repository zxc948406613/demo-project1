package net.xdclass.demoproject.mybatis;

import net.xdclass.demoproject.dao.VideoMapper;
import net.xdclass.demoproject.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class SqlSessionDemo {
    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
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
            Video video3 = new Video();
            video3.setTitle("小D课堂面试专题300道");
            video3.setCoverImg("xdclass.net/aaa.png");
            video3.setPoint(9.4);
            video3.setPrice(9900);
            video3.setCreateTime(new Date());
            video3.setSummary("这是面试专题概要");
            int rows = videoMapper.add(video3);
            System.out.println(rows);

        }
    }
}
