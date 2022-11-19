package com.example.warungsmonitor_gruppeh.service;

import org.springframework.stereotype.Service;

@Service
public class MaintannanceMonitorService {

    String Message;

    public MaintannanceMonitorService() {
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
