package site.fsyj.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fsyj on 2022/3/2
 */
@Api("测试")
@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> hello() {
        return  ResponseEntity.notFound().build();
    }
}
