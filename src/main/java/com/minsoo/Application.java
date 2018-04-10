package com.minsoo;

import com.minsoo.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.RemoteSpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(){
        return helloService.getMeesage();
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
