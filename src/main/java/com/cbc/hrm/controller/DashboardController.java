package com.cbc.hrm.controller;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class DashboardController {
    private final HttpServletRequest request;

    public DashboardController(HttpServletRequest request) {
        this.request = request;
    }

    @GetMapping("/dashboard")
    public String index(Model model){
        model.addAttribute("name","hhhh");
        return "index";
    }

    private KeycloakSecurityContext getKeycloakSecurityContext() {
        return (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
    }
}
