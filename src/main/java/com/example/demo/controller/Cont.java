package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//Aqui lo unico que agregue es el booleano, si es verdadero me va a mostrar la tabla 1 y si es falso la tabla 2
@Controller
public class Cont {
	 @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("Tabla1", false);
	        // Devuelve el nombre de la vista (index.html)
	        return "index";
	    }
}
