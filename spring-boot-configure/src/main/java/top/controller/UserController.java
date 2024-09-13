package top.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.entity.User;

@RestController
@RequestMapping("/api/users")  // 使用复数形式
@Validated
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid User user) {
        // 处理用户创建逻辑
        System.out.println("用户信息: " + user);
        return ResponseEntity.ok("用户创建成功");
    }
}
