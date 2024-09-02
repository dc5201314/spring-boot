package top.dc.springbootquickstart.entity;

import lombok.Data;

@Data

public class User {
    private Long id;
    private String name;
    private int age;
    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
