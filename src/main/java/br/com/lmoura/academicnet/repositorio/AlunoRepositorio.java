package br.com.lmoura.academicnet.repositorio;

import br.com.lmoura.academicnet.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

//cria as operações básicas de acesso ao banco de dados.
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
}
