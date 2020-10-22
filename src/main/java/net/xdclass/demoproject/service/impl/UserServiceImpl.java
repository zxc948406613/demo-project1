package net.xdclass.demoproject.service.impl;

import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.mapper.UserMapper;
import net.xdclass.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    /**
     * token存储
     */
    private static Map<String, User> tokenMap = new HashMap<>();

    @Autowired
    private UserMapper mapper;

    @Override
    public String login(String username, String pwd) {
        User user = mapper.login(username, pwd);
        if(user == null) {
            return null;
        }
        String token = UUID.randomUUID().toString();
        System.out.println(token);
        tokenMap.put(token, user);
        return token;
    }
}
