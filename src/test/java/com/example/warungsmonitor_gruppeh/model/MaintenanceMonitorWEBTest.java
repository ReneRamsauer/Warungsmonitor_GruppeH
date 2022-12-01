package com.example.warungsmonitor_gruppeh.model;

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

}
