package com.xa.api.v1;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admin")
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String getuser(){
        String user= restTemplate.getForObject("http://127.0.0.1:8010//user/v1/user/one", String.class);
        return user;
    }

}
