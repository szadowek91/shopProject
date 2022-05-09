package pl.szadowek91.shopProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class MainSiteCtrl {

    @GetMapping("/home")
    public String mainView(Model model){
        model.addAttribute("home","testing");
        return "home";
    }
}
