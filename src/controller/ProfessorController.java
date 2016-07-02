package controller;

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorController {
  
    private List<Professor> professores;
    
    public ProfessorController(){
        this.professores = new ArrayList();
    }
    
    public void cadastrar(Professor professor){
        professores.add(professor);
    }
    
    public List<Professor> findAll(){
       return professores;
    } 
    
    public Professor findById(int id){
        for (Professor professor : professores){
            if (professor.getMatricula() == id){
               return professor;
            }
        }
        return null;
    }
    
    public void update(Professor professor){
        for (Professor prof : professores){
            if (professor.getMatricula() == prof.getMatricula()){
                prof = professor;
                break;
            }
        }
    }
    
    public void delete(Professor professor){
        professores.remove(professor);
    }
    

}
