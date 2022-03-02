package site.fsyj.blog.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.fsyj.blog.mail.IMailService;
import site.fsyj.blog.mail.impl.IMailServiceImpl;

import javax.annotation.Resource;

/**
 * @author fsyj on 2022/3/2
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @Resource
    IMailService iMailServiceImpl;

    @Value("${email.to}")
    String to;

    public ResponseEntity<String> errorHandler(Exception e) {
        log.error("系统出现严重异常，异常信息：{}", e.getMessage());
        iMailServiceImpl.sendSimpleMail(to, "系统错误", e.getMessage());
        return ResponseEntity.status(500).body(e.getMessage());
    }
}
