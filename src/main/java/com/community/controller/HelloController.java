package com.community.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import java.net.URI;


@Controller
public class HelloController {
    @GetMapping("/hello")
    public String greet(@RequestParam(name = "name",required = false,defaultValue = "world")String name, Model model){
        System.out.println("fsdfsfsd");
        model.addAttribute("name", name);

        return "hello";

    }

}
