package com.example.calculadora_metabolica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        // Retorna o arquivo index.html da pasta templates
        return "index";
    }
}

