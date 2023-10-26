package com.tcc.inf2fm.myproject2f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charitycloset/usuario")
public class UsuarioController {
	
	@GetMapping("/novo-usuario")
	public String novoUsuario() {
		
		
		
		return "html_closet/cadastroong";
	}

}
