package com.MAITES.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.MAITES.aplicacion.models.entities.usuario;
import com.MAITES.aplicacion.models.services.IUsuarioService;

@Controller
public class HomeController {
	
	@Autowired
	IUsuarioService usuarioservice;
	
	@GetMapping("/")
    public String root() {
        return "index";
    }
	
	@RequestMapping(value="maites", method = RequestMethod.POST)
    public String deleteUser (@RequestParam("username") String username, 
    		@RequestParam("password") String password, Model model) {
		usuario user = usuarioservice.findOne(username);
		if(user.getNombre() != null) {
			model.addAttribute("nombreDeUsuario", user.getNombre());
			 return "principal";
		}else {
			return "index";
		}
       
    }

}
