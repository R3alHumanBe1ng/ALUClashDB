package com.massiveattack.clashdb.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SheetsController {
    @Value("${CLIENT_ID}")
    private String CLIENT_ID;

    @Value("${API_KEY}")
    private String API_KEY;

    @Value("${SPREADSHEET_ID}")
    private String SPREADSHEET_ID;

    @GetMapping("/home")
    public String loadPage(Model model) {
        model.addAttribute("CLIENT_ID", CLIENT_ID);
        model.addAttribute("API_KEY", API_KEY);
        model.addAttribute("SPREADSHEET_ID", SPREADSHEET_ID);
        return "home";
    }
}
