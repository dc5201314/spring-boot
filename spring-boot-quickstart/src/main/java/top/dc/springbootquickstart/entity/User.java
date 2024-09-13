package top.dc.springbootquickstart.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    @NotEmpty(message = "名称不能为空")
    private String name;

    @Min(value = 1, message = "年龄必须大于0")
    private int age;
}
