package com.appu.springBootExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String signup(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }
}
