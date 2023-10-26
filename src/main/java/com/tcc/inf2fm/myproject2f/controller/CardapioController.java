package com.tcc.inf2fm.myproject2f.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcc.inf2fm.myproject2f.model.Cardapio;
import com.tcc.inf2fm.myproject2f.repository.CardapioRepository;

@Controller
@RequestMapping("/cafeteria/cardapio")
public class CardapioController {
	
	@Autowired   // Injeção de dependência
	private CardapioRepository cardapioRepository;
	
	// Carregar o formulário de cadastro
	@GetMapping("/novo-cardapio")
	String novoCardapio(Model model, Cardapio cardapio) {
		model.addAttribute("cardapio", cardapio);
		return "FormularioCardapio";
	}
	
	// Adicionar cardápio no banco de dados
	@PostMapping("/add-card")
	String addCardapio(Model model, Cardapio cardapio) {
		cardapio.setCodStatusCardapio(true);
		Cardapio cardapioDb = cardapioRepository.save(cardapio);
		
		return "redirect:/cafeteria/cardapio/sucesso-cardapio";
	}
	
	// Abrir página de sucesso do cadastro
	
	@GetMapping("/sucesso-cardapio")
	String showPageSuccessCardapio() {
		
		return "pagina-sucesso";
	}

}
