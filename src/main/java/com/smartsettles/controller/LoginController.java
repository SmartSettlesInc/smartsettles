package com.smartsettles.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SantoshKompally on 3/5/17.
 */

@RestController
public class LoginController {

    @RequestMapping("/")
    public String home(){

        return "Hello web.";
    }


}
