package priv.wwy.springboot.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangweiye
 * @date 2021-06-28 17:23
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
            registry. addViewController("/").setViewName("redirect:/login-view");
            registry. addViewController("/login-view"). setViewName("login");
}
}