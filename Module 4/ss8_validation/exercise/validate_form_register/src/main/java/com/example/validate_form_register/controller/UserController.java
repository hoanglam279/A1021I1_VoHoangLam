package com.example.validate_form_register.controller;

import com.example.validate_form_register.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/validate")
    public ModelAndView Result(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        model.addAttribute("User", user);
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
