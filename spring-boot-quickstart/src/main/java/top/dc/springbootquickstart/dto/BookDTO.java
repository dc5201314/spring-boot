package top.dc.springbootquickstart.dto;

// 定义一个名为BookDTO的记录类，用于表示图书信息
public record BookDTO(
        // 图书的唯一标识符
        Long id,
        // 图书的标题
        String title,
        // 图书的作者
        String author,
        // 图书的价格
        Double price) {

    // 构造函数，用于创建BookDTO对象
    public BookDTO(Long id, String title, String author, Double price) {
        // 判断价格是否小于0，如果是，抛出异常
        if (price < 0) {
            throw new IllegalArgumentException("价格不能为负数");
        }
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

