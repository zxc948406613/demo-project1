package net.xdclass.demoproject.service;

import net.xdclass.demoproject.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 登录
     * @param username 用户名
     * @param pwd 密码
     * @return 生成的对应token
     */
    String login(String username, String pwd);

    /**
     * 获取全量会员信息
     * @return
     */
    List<User> queryUserList();
}
