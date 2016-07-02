package controller;

import java.util.ArrayList;
import java.util.List;
import model.Turma;

public class TurmaController {
 
    private List<Turma> turmas;
    
    public TurmaController(){
        this.turmas = new ArrayList();
    }
    
    public void cadastrar(Turma turma){
        turmas.add(turma);
    }
    
    public List<Turma> findAll(){
       return turmas;
    } 
    
    public Turma findById(int id){
        for (Turma turma : turmas){
            if (turma.getCodigo() == id){
               return turma;
            }
        }
        return null;
    }
    
    public void update(Turma turma){
        for (Turma turm : turmas){
            if (turma.getCodigo() == turm.getCodigo()){
                turm = turma;
                break;
            }
        }
    }
    
    public void delete(Turma turma){
        turmas.remove(turma);
    }
    
}
