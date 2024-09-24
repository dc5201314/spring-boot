package top.dc.springbootquickstart.contraller;

import org.springframework.web.bind.annotation.*;
import top.dc.springbootquickstart.entity.User;
import top.dc.springbootquickstart.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 获取所有年龄大于18的用户姓名
    @GetMapping("/adults")
    public List<String> getAdultUserNames() {
        return userService.getAdultUserNames();
    }

    // 根据首字母查询用户姓名
    @GetMapping("/userNamesByInitial")
    public List<String> getUserNamesByInitial(@RequestParam char initial) {
        return userService.getAdultUsers().stream()
                .filter(user -> user.getName().charAt(0) == initial)  // 根据首字母过滤用户
                .map(User::getName)  // 提取用户的姓名
                .toList();
    }

    // 根据 ID 显示用户
    @GetMapping("/{id}")
    public String displayUserById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        if (user != null) {
            return String.format("找到用户 - 名称: %s, 年龄: %d", user.getName(), user.getAge());
        } else {
            return "用户未找到";
        }
    }

    // 添加用户
    @PostMapping
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return String.format("新用户添加成功 - 名称: %s, 年龄: %d", user.getName(), user.getAge());
    }

}

