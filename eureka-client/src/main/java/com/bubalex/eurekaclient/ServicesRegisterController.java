package com.bubalex.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesRegisterController {

    @GetMapping
    public String test() {
        return "test";
    }

}
