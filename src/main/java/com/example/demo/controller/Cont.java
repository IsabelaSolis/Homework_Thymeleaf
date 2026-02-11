package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Aqui lo unico que agregue es el booleano, si es verdadero me va a mostrar la tabla 1 y si es falso la tabla 2
@Controller
public class Cont {
	 @GetMapping("/")
	    public String index(@RequestParam(required = false) String selected,Model model) {
	        model.addAttribute("Tabla1", true);
	        model.addAttribute("selected", selected);//nos va a ayudar a poner cual escojimos
	        
	        List<String> engineering =new ArrayList<>();
	        engineering.add("Computer science");
	        engineering.add("Mines");
	        engineering.add("Civil");
	        engineering.add("Industrial");
	        engineering.add("Lawyer");
	        engineering.add("Design");
	        engineering.add("Musician");
	        engineering.add("Chemistry");
	        engineering.add("Mechanics");
	        engineering.add("Nothing");
	        model.addAttribute("engineering", engineering);
	        model.addAttribute("degree", engineering);
	        
	        // Devuelve el nombre de la vista (index.html)
	        return "index";
	    }
}
