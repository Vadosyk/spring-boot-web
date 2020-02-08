package ua.kiev.prog.productview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String root() {
        return "welcome";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }


}

