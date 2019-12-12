package com.modelo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String sala;
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public String getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}
	public String getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(String emprestimo) {
		this.emprestimo = emprestimo;
	}
	private String livro;
	private String devolucao;
	private String emprestimo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	 
	
	
	
	
}
