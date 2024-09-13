package top.entity;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Server {
    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private String port;

    @Value("${server.context-path}")
    private String contextPath;
}
