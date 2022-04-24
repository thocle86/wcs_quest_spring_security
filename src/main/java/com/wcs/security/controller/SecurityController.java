package com.wcs.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@Controller
public class SecurityController {

    @RolesAllowed("CHAMPION")
    @GetMapping("/avengers/assemble")
    public String avengersAssemble(Model model, Principal user) {
        model.addAttribute("user", user.getName());
        return "avengers-assemble";
    }

    @RolesAllowed("DIRECTOR")
    @GetMapping("/secret-bases")
    public String secretBases(Model model, Principal user) {
        model.addAttribute("user", user.getName());
        return "secret-bases";
    }
}