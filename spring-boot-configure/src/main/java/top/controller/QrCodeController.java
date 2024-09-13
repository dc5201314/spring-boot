package top.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import top.service.QrCodeService;

@RestController
@AllArgsConstructor
public class QrCodeController {

    private final QrCodeService qrCodeService; // 注入服务

    @GetMapping("/qrcode")
    public void qrcode() {
        qrCodeService.generateQrCode();
    }
}
