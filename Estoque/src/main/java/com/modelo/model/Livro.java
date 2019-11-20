package com.modelo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Livro {
	
	
	
	private int ano;
	
	
	
	
	
	public int getData() {
		return ano;
	}

	public void setData(Date data) {
		this.ano = data.getYear() + 1900;
	}

	
	@Id
	@GeneratedValue
	private Long id;
	
	 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@NotNull(message="Nome é Obrigatorio")
	
	 @Column
	private String descricao;
	@NotNull(message="descrição é Obrigatorio")
	 @Column
	private String emprestimo;
	@NotNull(message="Data é Obrigatorio")
	 @Column
	private String devolucao;
	@NotNull(message="Data é Obrigatorio")
	 @Column
	
	private String autor;
	
	private String editora;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(String emprestimo) {
		this.emprestimo = emprestimo;
	}

	

	public String getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}
	
	

}
