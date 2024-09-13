package top.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonTest {
    @Resource
    private Person person;

    @Test
    void test(){
        System.out.println(person);
    }

}
