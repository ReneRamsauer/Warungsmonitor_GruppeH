package com.example.warungsmonitor_gruppeh.controller;

import com.example.warungsmonitor_gruppeh.service.MaintannanceMonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintananceMonitorController {

    private final MaintannanceMonitorService monService;

    public MaintananceMonitorController(MaintannanceMonitorService monService) {
        this.monService = monService;
    }

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/wartung")
    String getSum(Model model) {
        int number = 4;
        model.addAttribute("number", number);

        if((number % 2) == 0) {
            model.addAttribute("color", "#123321");
        } else {
            model.addAttribute("color", "#321123");
        }

        return "number";
    }


}
