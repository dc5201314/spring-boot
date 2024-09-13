package top.dc.controller;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseResult<T> {
    private int code; // 状态码
    private String message; // 提示信息
    private T data; // 数据


}

