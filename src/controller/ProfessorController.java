package controller;

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorController {
    
    private List<Professor> professores;
    
    public ProfessorController(){
        this.professores = new ArrayList<>();
    }
    
    public void create(Professor professor){
        professores.add(professor);
    }
    
    public List<Professor> findAll(){
        return professores;
    } 
    
    public Professor findById(int matricula){
        Professor professor = new Professor();
        for (Professor a : professores){
            if (a.getMatricula() == matricula){
                professor = a;
                break;
                
            }
        }
        return professor;
    }
    
    public void update(Professor professor){
        for (Professor a : professores){
            if (a.getMatricula() == professor.getMatricula()){
                a.setNome(professor.getNome());
                a.setIdade(professor.getIdade());
                break;
            }
        }
    }
    
    public void delete(Professor professor){
        professores.remove(professor);
    }
    






}
