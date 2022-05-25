package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoneyController {
    @PostMapping("/change")
    public String ChangeMoney(@RequestParam double amount, Model model) {
        double money=amount *21000;
        model.addAttribute("money",money);
        return "result";
    }
}