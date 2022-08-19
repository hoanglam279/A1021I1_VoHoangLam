package com.example.furama.controller;

import com.example.furama.dto.UserDto;
import com.example.furama.model.Role;
import com.example.furama.model.User;
import com.example.furama.util.EncrypPasswordUtils;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping("/login")
    public String showLogin() {
        return "home/login";
    }

    @GetMapping("/admin")
    public String getHomeAdmin() {
        return "home/admin";
    }

//    @GetMapping("/user")

    @GetMapping("/")
    public String getHome() {
        return "home/index";
    }

    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        return new ModelAndView("home/register", "registerUser", new UserDto());
    }

    @PostMapping("/register")
    public String registerUser(@Validated @ModelAttribute("registerUser") UserDto registerUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "home/register";
        } else {
            User user = new User();
            user.setUsername(registerUser.getUsername());
            user.setPassword(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            user.setRememberToken(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            Role roleEntity = roleService.findByName("ROLE_MEMBER");
            Set<Role> listRoles = new HashSet<>();
            listRoles.add(roleEntity);
            user.setRoles(listRoles);
            userService.save(user);
            return "redirect:/login";
        }
    }


    @GetMapping(value = "/403")
    public String accessDenied() {
        return "home/403";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
            Cookie cookie = new Cookie("remember-me", "");
            cookie.setMaxAge(24 * 60 * 60 * 1);
            response.addCookie(cookie);
        }
        return "redirect:/login";
    }
}
