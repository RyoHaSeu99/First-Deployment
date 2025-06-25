package com.example.First_Deployment.First_Deployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FDController {
    @GetMapping("/")
    public String FD() {
        return "FirstDeployment";
    }
}
