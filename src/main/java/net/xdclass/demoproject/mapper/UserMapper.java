package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMapper {

    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("Jack", new User(1, "Jack", "123"));
        userMap.put("Xdclass-lw", new User(2, "Xdclass-lw", "123"));
        userMap.put("Xdclass-zxc", new User(3, "Xdclass-zxc", "123"));
    }

    public User login(String userName, String password) {
        User user = userMap.get(userName);
        if(user == null) {
            return null;
        }
        if(password.equals(user.getPassword())) {
            return user;
        }
        return null;
    }


}
