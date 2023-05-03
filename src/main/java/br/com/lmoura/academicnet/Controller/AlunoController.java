package br.com.lmoura.academicnet.Controller;

import br.com.lmoura.academicnet.modelo.Aluno;
import br.com.lmoura.academicnet.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")


public class AlunoController {

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    //listando os alunos existentes no banco de dados
    @GetMapping
    public List<Aluno> listar(){
        return alunoRepositorio.findAll();
    }

    //Incluir um aluno no banco de dados
    @PostMapping
    public void incluir(@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);
    }

    //Método para alteração de dados
    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);
    }

    //Deletando um aluno a partir do número de matrícula
   @DeleteMapping("/{matricula}")
    public void deletar(@PathVariable Long matricula){
        alunoRepositorio.deleteById(matricula);
   }

   //Consultar aluno pelo número de matrícula
   @GetMapping("/{matricula}")
    public Optional<Aluno> ler(@PathVariable Long matricula){
        return alunoRepositorio.findById(matricula);
   }

}
