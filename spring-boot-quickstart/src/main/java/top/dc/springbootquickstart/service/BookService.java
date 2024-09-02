package top.dc.springbootquickstart.service;

import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.dto.BookDTO;

import java.util.List;

@Service
public class BookService {
    public List<BookDTO> getAllBooks() {
        return List.of(
                new BookDTO(1L, "Java ", "ab1", 29.99),
                new BookDTO(2L, "Spring ", "dcc", 34.99)
        );
    }
}
