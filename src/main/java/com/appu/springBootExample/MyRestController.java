package com.appu.springBootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MyRestController {

    @Autowired
    private MyService myService;

    @PostMapping("/register")
    public void register()
    {
        System.out.println("I AM REST-CONTROLLER FOR REGISTER");
        myService.register();
    }

    @PostMapping("/login")
    public RedirectView login()
    {
        System.out.println("I AM REST-CONTROLLER FOR LOGIN");
        myService.login();
        return new RedirectView("/");
    }
}
