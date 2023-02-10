package com.groupware_backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/superAdmin")
    @PreAuthorize("hasRole('SUPER_ADMIN')")
    public String superAdminAccess() {
        return "User SUPER_ADMIN.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAcces() {
        return "admin Board.";
    }

    @GetMapping("/manager")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String managerAccess() {
        return "manager Board.";
    }

    @GetMapping("/teamLead")
    @PreAuthorize("hasRole('TEAM_LEAD')")
    public String teamLeadAccess() {
        return "team Lead Board";
    }

    @GetMapping("/staff")
    @PreAuthorize("hasRole('STAFF')")
    public String staffAccess() {
        return "staff Board";
    }



}
