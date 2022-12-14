package com.example.warungsmonitor_gruppeh.model;

import com.example.warungsmonitor_gruppeh.controller.MaintananceMonitorController;
import com.example.warungsmonitor_gruppeh.service.MaintannanceMonitorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MaintenanceMonitorWEBTest {

    private final MaintannanceMonitorService monService = new MaintannanceMonitorService();

    /*Initial Test*/
    @Test
    void testDefaultState() {
        assertNull(null, monService.getMessage());
    }

    /*Set Meesage Test*/
    @Test
    void testSetMessage() {
        String testMessage = ("Ich bin ein Test");
        monService.setMessage(testMessage);

        assertEquals(testMessage, monService.getMessage());
    }

    @Test
    void testResetMessage() {

        monService.setMessage("setMessage");
        monService.resetMessage();
        assertNull(null, monService.getMessage());
    }


}
