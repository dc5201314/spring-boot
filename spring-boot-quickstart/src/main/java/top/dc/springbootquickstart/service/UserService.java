package top.dc.springbootquickstart.service;

import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.entity.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final List<User> users = List.of(
            new User(1L, "张五", 22),
            new User(2L, "张六", 17),
            new User(3L, "张三", 2),
            new User(4L, "张四", 6),
            new User(5L, "张七", 5)
    );
    public List<String> getAdultUserNames() {
        return users.stream()
                // 过滤年龄⼤于18岁的⽤户
                .filter(user -> user.getAge() > 18)
                // 提取名字
                .map(User::getName)
                .collect(Collectors.toList());
    }
}

