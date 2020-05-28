package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.model.Cliente;

@Controller
public class ClientesController {
	

	@RequestMapping("/clientes/novo")
	public String novo() {
		return "cliente/CadastroCliente";
	}
	


}
