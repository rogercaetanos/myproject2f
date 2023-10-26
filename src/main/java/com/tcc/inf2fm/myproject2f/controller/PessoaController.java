package com.tcc.inf2fm.myproject2f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/academia/pessoa")
public class PessoaController {
	
	
	
	@GetMapping("/nova-pessoa")
	public String novaPessoa() {
		
		
		return "tacademia/AcademiaBemEstar";
		
	}
	
	
	
	

}
