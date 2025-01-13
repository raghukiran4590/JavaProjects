package com.edbg.snow.ihub.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String heathCheck() {
        return "Health Check OK!";
    }
}
