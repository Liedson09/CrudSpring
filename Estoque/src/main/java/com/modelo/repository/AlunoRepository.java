package com.modelo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.model.Aluno;
import com.modelo.repository.AlunoRepository;

	public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
