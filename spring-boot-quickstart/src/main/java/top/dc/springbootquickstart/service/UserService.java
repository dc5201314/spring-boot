package top.dc.springbootquickstart.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.entity.User;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

public interface UserService {
    void addUser(User user);
    List<User> getAdultUsers();
    List<String> getAdultUserNames(); // 新增方法
    User findUserById(Long id);

}

