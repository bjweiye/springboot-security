package priv.wwy.springboot.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangweiye
 * @date 2021-06-29 14:53
 */
@Controller
public class JspController {
    @RequestMapping(value = "/jsp")
    public String jsp(Model model){
        model.addAttribute("msg","SpringBoot Jsp View");
        return "index";
    }
}
