package org.learning.bestoftheyear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Dico a Spring che questo è un controller
public class HomeController {
    @GetMapping("/") // A quale rotta rispondono i metodi di questo controller
    public String home(Model model) {
        // Definisco il nome da visualizzare
        String name = "Mohamed";
        model.addAttribute("name", name);
        return "home";
    }
}
