package top.util;

import cn.hutool.jwt.JWTUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import top.config.JwtConfig;

import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {

    @Resource
    private JwtConfig jwtConfig; // 注入 JWT 配置

    /**
     * 生成 JWT
     *
     * @param claims JWT 的有效载荷
     * @return 签名的 JWT
     */
    public String generateToken(Map<String, Object> claims) {
        // 获取 JWT 密钥
        String secretKey = jwtConfig.getSecret();

        // 设置 JWT 的过期时间
        long expirationTime = jwtConfig.getExpiration();
        Date expiryDate = new Date(System.currentTimeMillis() + expirationTime);

        // 使用 Hutool 的 JWTUtil 创建 JWT
        return JWTUtil.createToken(claims, secretKey.getBytes());
    }

    /**
     * 验证 JWT
     *
     * @param token JWT 字符串
     * @return 验证结果
     */
    public boolean validateToken(String token) {
        String secretKey = jwtConfig.getSecret();

        // 使用 Hutool 验证 JWT
        return JWTUtil.verify(token, secretKey.getBytes());
    }

    /**
     * 获取 JWT 中的有效载荷
     *
     * @param token JWT 字符串
     * @return JWT 中的有效载荷
     */
    public Map<String, Object> getClaims(String token) {
        return (Map<String, Object>) JWTUtil.parseToken(token);
    }
}
