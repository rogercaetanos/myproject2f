package com.tcc.inf2fm.myproject2f.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcc.inf2fm.myproject2f.model.UsuarioDesastre;
import com.tcc.inf2fm.myproject2f.repository.UsuarioDesastreRepository;

@Controller
@RequestMapping("/iasp/usuario")
public class UsuarioDesastreController {
	
	@Autowired
	private UsuarioDesastreRepository usuarioDesastreRepository;
	
	// Carregar o formulário de Cadastro do usuário
	
	@GetMapping("/novo-usuario")
	public String novoUsuario(UsuarioDesastre usuarioDesastre, Model model) {
		
		model.addAttribute("usuarioDesastre", usuarioDesastre);
		return "ongiasp/Formulario";
	}
	
	@PostMapping("/add-usuario")
	public String addUsuario(UsuarioDesastre usuarioDesastre, Model model) {
		
		usuarioDesastre.setCodStatusUsuario(true);
		UsuarioDesastre usuarioDesastreDb = usuarioDesastreRepository.save(usuarioDesastre);
		return "redirect:/iasp/usuario/home";
		
	}
	
	

}
