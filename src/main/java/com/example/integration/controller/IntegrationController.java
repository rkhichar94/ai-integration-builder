package com.example.integration.controller;

import com.example.integration.service.IntegrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/integrations")
public class IntegrationController {

    private final IntegrationService service;

    public IntegrationController(IntegrationService service) {
        this.service = service;
    }

    @GetMapping("/{app}/users")
    public String getUsers(@PathVariable String app,
                           @RequestHeader("Authorization") String auth) {
        return service.fetchUsers(app.toUpperCase(), auth.replace("Bearer ", ""));
    }
}