package net.xdclass.demoproject.mybatis;

import net.xdclass.demoproject.dao.VideoMapper;
import net.xdclass.demoproject.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessinCacheDemo {

    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //构件Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video1 = videoMapper.selectById(44);
            System.out.println(video1.toString());
            sqlSession.commit();

            SqlSession sqlSession2 = sqlSessionFactory.openSession();
            VideoMapper videoMapper2 = sqlSession.getMapper(VideoMapper.class);
            Video video2 = videoMapper.selectById(44);
            System.out.println(video2.toString());
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
