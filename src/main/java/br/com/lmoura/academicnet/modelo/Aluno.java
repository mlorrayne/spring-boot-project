package br.com.lmoura.academicnet.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@NoArgsConstructor  // construtor padrão sem argumentos do Lombok
@AllArgsConstructor // construtor padrão com todos os argumentos
@Data               //Getters, Setters, ToString...
@Entity

public class Aluno {

    @Id
    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;
}
