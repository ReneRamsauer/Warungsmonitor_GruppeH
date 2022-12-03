package com.example.warungsmonitor_gruppeh.controller;

import com.example.warungsmonitor_gruppeh.service.MaintannanceMonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

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

    @GetMapping("/wartung")
    String wartung(Model model) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String ok = "ok";
        String message = monService.getMessage();
        model.addAttribute("message", message);
        model.addAttribute("timestamp", timestamp);

        if(ok.equals(monService.getMessage())) {
            model.addAttribute("color", "#42f557");
        } else {
            model.addAttribute("color", "#f54842");
        }

        return "wartung";
    }

    @GetMapping("/wartung/reset")
    String reset() {

        monService.resetMessage();

        return "wartung";
    }

    @GetMapping("/text/{text}")
    @ResponseBody
    String mes(@PathVariable String text){
        monService.setMessage(text);

        return text;
    }


}
