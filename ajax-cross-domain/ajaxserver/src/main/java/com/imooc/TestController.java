package com.imooc;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get1")
    private ResultBean get1() {
        System.out.println("TestController.get()");
        return new ResultBean("get1 ok");
    }

    @PostMapping("/postJson")
    public ResultBean postJson(@RequestBody User user) {
        System.out.println("TestController.postJson()");

        return new ResultBean("postJson " + user.getName());
    }

    @GetMapping("/getCookie")
    public ResultBean getCookie(@CookieValue(value="cookie1") String cookie1) {
        System.out.println("TestController.getCookie()");
        return new ResultBean("getCookie " + cookie1);
    }

    @GetMapping("/getHeader")
    public ResultBean getHeader(@RequestHeader("x-header1") String header1,
        @RequestHeader("x-header2")  String header2) {
        System.out.println("TestController.getHeader()");

        return new ResultBean("getHeader" + header1 + " " + header2);
    }
}
