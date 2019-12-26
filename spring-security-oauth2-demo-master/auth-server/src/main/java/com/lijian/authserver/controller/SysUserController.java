package com.lijian.authserver.controller;

import com.lijian.authserver.domain.SysUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RequestMapping("/sysUsers")
@RestController
public class SysUserController {

    @GetMapping("/user")
    @PreAuthorize("isAuthenticated()")
    public Principal user(Principal user, Model model){
        model.addAttribute("username",user.getName());
        return user;
    }
}
