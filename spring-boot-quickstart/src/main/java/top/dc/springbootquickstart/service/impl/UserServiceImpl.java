package top.dc.springbootquickstart.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.entity.User;
import top.dc.springbootquickstart.service.UserService;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final List<User> users = new ArrayList<>();

    public UserServiceImpl() {
        // 初始化用户数据
        users.add(new User(1L, "张伟", 22));
        users.add(new User(2L, "李强", 17));
        users.add(new User(3L, "王刚", 19));
        users.add(new User(4L, "赵丽", 30));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAdultUsers() {
        return users.stream().filter(user -> user.getAge() > 18).toList();
    }

    @Override
    public List<String> getAdultUserNames() {
        return getAdultUsers().stream().map(User::getName).toList();
    }

    @Override
    public User findUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
