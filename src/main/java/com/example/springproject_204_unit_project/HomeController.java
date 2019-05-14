package com.example.springproject_204_unit_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String carForm(Model model){
        model.addAttribute("cars",new Cars());
        return "carform";
    }

    @PostMapping("/carform")
    public String carPost(@ModelAttribute Cars cars,Model model){
        model.addAttribute("cars",cars);
        return "confirmcar";

    }
}
