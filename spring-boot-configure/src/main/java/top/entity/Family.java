package top.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Validated
@Component
@ConfigurationProperties(prefix = "family")
@Data
public class Family {
    @Length(min = 5, max = 10, message = "长度不符合要求")
    private String familyName;
    private String father;
    private String mother;
    private String child;
    @Range(min = 3 ,  message = "年龄不符合要求")
    private Integer age;


}

