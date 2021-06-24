package priv.wwy.springboot.security.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangweiye
 * @date 2021-06-24 15:25
 */
@RestController
public class ServiceProvider {
    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello WANGDAYE! from "+port+" !";
    }
}

