package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.service.UserService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 表单或者url登录（过时）
     *
     * @param userName 用户名
     * @param pwd      密码
     * @return 返回结果
     */
    @PostMapping("login")
    public JsonData login(String userName, String pwd) {
        System.out.println("userName=" + userName + ",pwd=" + pwd);
        return JsonData.buildSuccess("登录成功");
    }

    /**
     * 入参json登录
     *
     * @param user 用户
     * @return 返回结果
     */
    @PostMapping("loginUser")
    public JsonData login(@RequestBody User user) {
        if (user == null) {
            return JsonData.bulldError("user is null");
        }
        String token = userService.login(user.getUserName(), user.getPassword());

        return token != null ? JsonData.buildSuccess(token) : JsonData.bulldError("账号密码错误");
    }
}
