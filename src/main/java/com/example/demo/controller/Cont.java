package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Engineering;
import com.example.demo.models.Usuario;
//Aqui lo unico que agregue es el booleano, si es verdadero me va a mostrar la tabla 1 y si es falso la tabla 2
@Controller
public class Cont {
	 @GetMapping("/")
	 public String raiz(Model model,@RequestParam(required = false) String selected) {
		   model.addAttribute("Tabla1", true);
	       model.addAttribute("selected", selected);//nos va a ayudar a poner cual escojimos
			ArrayList<Engineering>lista =new ArrayList<>();
			lista.add(new Engineering("Computer science"));
			lista.add(new Engineering("Mines"));
			lista.add(new Engineering("Civil"));
			lista.add(new Engineering("Industrial"));
			lista.add(new Engineering("Lawyer"));
			lista.add(new Engineering("Design"));
			lista.add(new Engineering("Musician"));
			lista.add(new Engineering("Chemistry"));
			lista.add(new Engineering("Mechanics"));
			lista.add(new Engineering("Nothing"));
			
			Usuario usuario = new Usuario("Isabela", "Solis", "Sexto");
			model.addAttribute("usuario", usuario);
			model.addAttribute("engineering", lista);
			return "index";
	 }
}
	   