package com.modelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.modelo.model.Aluno;
import com.modelo.repository.AlunoRepository;

@Controller
public class AlunoController {
	@Autowired
	AlunoRepository alunoRepository;
	

	@GetMapping("/cadastrarAluno")
	public String adicionar(Model aluno) {
		aluno.addAttribute("aluno", alunoRepository.findAll());
		return "adicionar";
	}
		
	
	@GetMapping("/listAluno")
	public String lista(Model model) {
		model.addAttribute("aluno", alunoRepository.findAll());
		return "cadastroAluno";
	}
	
	@GetMapping("/cadAluno")
	public String salvar(Aluno aluno) {
		alunoRepository.save(aluno);
		return "redirect:/";
	}
	@GetMapping("/edit")
	public String edite(Model model) {
		model.addAttribute("aluno", alunoRepository.findAll());
		return "edit";
	}
	
	@GetMapping("/edit/{id}")
	public String edite(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dado", alunoRepository.findById(id));
		return "edit";
		
	}
	@GetMapping("/del/{id}")
	public String deletar(@PathVariable("id") Long id) {
		alunoRepository.deleteById(id);
		return "redirect:/";
		
	}
}
