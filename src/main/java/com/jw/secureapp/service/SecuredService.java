package com.jw.secureapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableMethodSecurity(securedEnabled = true)
public class SecuredService {

    @PreAuthorize("hasRole('USER')")
    public void securedMethod(){
        log.info("SECURED METHOD");
    }

    @PreAuthorize("hasRole('ADMIN')")
    public void adminMethod(){
        log.info("ADMIN METHOD");
    }
}
