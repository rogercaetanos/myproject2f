package com.tcc.inf2fm.myproject2f.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcc.inf2fm.myproject2f.model.Cliente;
import com.tcc.inf2fm.myproject2f.repository.ClienteRepository;

@Controller
@RequestMapping("/ecotech/cliente")
public class ClienteController {
	
	@Autowired  // Injeção de dependência. O spring vai criar o objeto automaticamente
	private ClienteRepository clienteRepository;
	
	// Carregar o formulário de cadastro do cliente
	@GetMapping("/novo-cliente")
	public String novoCliente(Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		
		return "tecotech/CadastrarCliente";
	}
	
	
	// Inserir cliente
	
	@PostMapping("/add-cliente")
	public String addCliente(Cliente cliente, Model model) {
		
		cliente.setCodStatusCliente(true);
		Cliente clienteDb = clienteRepository.save(cliente);
		return "redirect:/ecotech/cliente/index";
	}
	
	// Carregar Home Page
	
	@GetMapping("/index")
	public String home() {
		return "tecotech/index";
	}
	

}
