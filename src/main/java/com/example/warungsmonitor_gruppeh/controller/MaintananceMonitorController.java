package com.example.warungsmonitor_gruppeh.controller;

import com.example.warungsmonitor_gruppeh.service.MaintannanceMonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MaintananceMonitorController {

    private final MaintannanceMonitorService monService;

    public MaintananceMonitorController(MaintannanceMonitorService monService) {
        this.monService = monService;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/wartung/{text}")
    void storeMessage(@PathVariable("text") String text) {
        monService.setMessage(text);
    }

    @GetMapping("/wartung")
    String wartung(Model model) {
        String ok = "200 OK";
        String message = monService.getMessage();
        model.addAttribute("message", message);

        if(ok.equals(monService.getMessage())) {
            model.addAttribute("color", "#42f557");
        } else {
            model.addAttribute("color", "#f54842");
        }

        return monService.getMessage();
    }
/*
    @PostMapping("/setwartung/{message}")
    void storeMessage(@PathVariable String message) {
        monService.setMessage(message);
    }
*/


}
