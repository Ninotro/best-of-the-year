package com.experis.course.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {


    @GetMapping("home")
    public String home(Model model ) {
        model.addAttribute("name","Nino");
        return "home";
    }


}
