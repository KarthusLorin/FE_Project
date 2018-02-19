package com.imooc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get1")
    private ResultBean get1() {
        System.out.println("TestController.get()");
        return new ResultBean("get1 ok");
    }
}
