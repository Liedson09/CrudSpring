package com.modelo.controller;

import java.util.Date;
import java.util.jar.Attributes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.modelo.model.Livro;

@Controller
public class CadastroController {
	@Autowired
	CrudRepository crudRepository;
	
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "index";
	}
	@GetMapping("/formLivro")
	public String lista(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "formLivro";
	}
	@GetMapping("/index")
	public String Home(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "index";
	}
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "login";
	}

			
	@GetMapping("/editar")
	public String editar(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "editar";
	}
	@GetMapping("/cadastrar")
	public String cadastro(Model model) {
		model.addAttribute("produto", crudRepository.findAll());
		return "cadastro";
	}

	
	@PostMapping("/cadastro")
	public String salvar(@Valid Livro livro, BindingResult result
			,RedirectAttributes attributes) {
		
		if(result.hasErrors()){
			
		}
		
		attributes.addFlashAttribute("mensagem", "livro cadastrado com sucesso");	
		crudRepository.save(livro);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		crudRepository.deleteById(id);
		return "redirect:/";
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dados", crudRepository.findById(id));
		return "editar";
		
	}
	
}
