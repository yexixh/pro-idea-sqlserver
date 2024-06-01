package learn2.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class LoginController {

    @GetMapping("/Login")
    public String toLoginPage(Model model) {
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }

    @GetMapping("/main")
    public String toMainPage(Model model) {
        return "main";
    }

    @GetMapping("/custom")
    public String custom(Model model) {
        return "custom";
    }

    @GetMapping("/product")
    public String product(Model model) {
        return "product";
    }
    @GetMapping("/supplier")
    public String supplier(Model model) {
        return "supplier";
    }
}

