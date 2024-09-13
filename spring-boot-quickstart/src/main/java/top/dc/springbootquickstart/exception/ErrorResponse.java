package top.dc.springbootquickstart.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;  // 错误信息
    private int status;      // HTTP 状态码
    private long timestamp;  // 时间戳
}
