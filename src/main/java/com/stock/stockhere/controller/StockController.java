package com.stock.stockhere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StockController {

    @GetMapping("/login")
    public ModelAndView loginPage() {

        ModelAndView mv = new ModelAndView("login_page");

        return mv;

    }

}
