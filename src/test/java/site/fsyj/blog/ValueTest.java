package site.fsyj.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author fsyj on 2022/3/2
 */
@SpringBootTest
public class ValueTest {

    @Value("${email.to}")
    public String to;

    @Test
    public void valueTest() {
        System.out.println(to);
    }
}
