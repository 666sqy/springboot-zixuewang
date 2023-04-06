package com.sqy.conterllo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    public  String hello(){
        return "hello,word";
    }

    public void hellos(){
        System.out.println(99999);
    }

    public static void main(String[] args) {
        System.out.println("hell1");
    }

}
