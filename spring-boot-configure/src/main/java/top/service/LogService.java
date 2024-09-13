package top.service;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    @Value("${custom.log.level}")
    private String logLevel;
    private final Log log = LogFactory.get();
    public void logMessage() {
        log.info("当前⽇志级别为: " + logLevel);
        if ("DEBUG".equalsIgnoreCase(logLevel)) {
            log.debug("这是调试信息");
        } else if ("INFO".equalsIgnoreCase(logLevel)) {
            log.info("这是普通信息");
        }
        // 其他级别的⽇志处理
    }
}
