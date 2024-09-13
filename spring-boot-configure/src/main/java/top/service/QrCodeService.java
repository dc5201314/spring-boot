package top.service;

import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Slf4j
@Service
public class QrCodeService {

    @Value("${custom.qrcode.content}")
    private String qrContent;

    public void generateQrCode() {
        // 确保 QrCodeUtil 是一个有效的类，且能够成功使用
        QrCodeUtil.generate(qrContent, 300, 300, new File("qrcode.png"));
        log.info("二维码生成成功！");
    }
}
