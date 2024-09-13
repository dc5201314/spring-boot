package springboot.thymeleaf.model;

public class Task {

    private Long id;
    private String name;
    private Boolean completed;

    // 默认构造函数
    public Task() {
    }

    // 带参数的构造函数
    public Task(Long id, String name, Boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;

    }

    // Getter 和 Setter 方法

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }
    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false; // 默认值
    }

}

