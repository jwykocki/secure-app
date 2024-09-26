package com.jw.secureapp.controller;

import com.jw.secureapp.service.SecuredService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class AppController {

    private final SecuredService serviceSecurity;

    @GetMapping("/secured")
    public String getSecuredMethod() {
        log.info("Request from user with roles: {}", SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        serviceSecurity.securedMethod();
        return "Success";
    }
}
