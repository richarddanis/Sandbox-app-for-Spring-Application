package com.richard.danis.www.sandbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Swagger home controller
 */
@Controller
public class SwaggerController {

    @RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }
}
