package net.xdclass.demoproject;

import java.sql.*;

public class JdbcApp {
    public static void main(String[] args) throws Exception {
        /**
         * 加载JDBC驱动
         * 创建数据库连接
         * 创建preparedStatement
         * 执行SQL语句
         * 处理结果集
         * 关闭JDBC连接
         */
        Long beginTime = System.currentTimeMillis();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://101.200.139.223:3306/zxc?useUnicode=true;characterEncoding=utf-8;useSSL=false";
        String username = "zxc";
        String password = "4321210Xcwm@";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from video");
        while(resultSet.next()) {
            System.out.println("视频标题:" + resultSet.getString("title"));
        }
        statement.close();
        connection.close();
        System.out.println(System.currentTimeMillis() - beginTime);
    }
}

