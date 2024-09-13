package top.dc.springbootquickstart.service;

import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.dto.BookDTO;

import java.util.List;

// 定义一个名为BookService的服务类，用于提供获取所有图书信息的方法
@Service
public class BookService {

    // 获取所有图书信息的方法
    public List<BookDTO> getAllBooks() {
        // 返回一个包含两个BookDTO对象的列表
        return List.of(
                new BookDTO(1L, "Java ", "ab1", 29.99),
                new BookDTO(2L, "Spring ", "dcc", 34.99)
        );
    }
}
