package com.example.warungsmonitor_gruppeh.service;

import com.example.warungsmonitor_gruppeh.dto.Monitor;
import org.springframework.stereotype.Service;

@Service
public class MaintannanceMonitorService {

    private final Monitor mon = new Monitor();

    public MaintannanceMonitorService() {
    }

    public String getMessage() {
        return mon.getMessage();
    }

    public void setMessage(String message) {
        mon.setMessage(message);
    }

    public void resetMessage() {
        mon.setMessage("");
    }

}
