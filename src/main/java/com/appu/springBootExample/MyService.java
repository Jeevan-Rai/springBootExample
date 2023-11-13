package com.appu.springBootExample;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void register()
    {
        System.out.println("I AM REGISTER SERVICE");
    }

    public void login()
    {
        System.out.println("I AM LOGIN SERVICE");
    }
}
