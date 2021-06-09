package com.xa.api.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1/user")
public class controller {

    @RequestMapping("/one")
    public String getOne() {
        return "我是hello";
    }
}
