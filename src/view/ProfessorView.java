package view;

import controller.ProfessorController;
import java.util.Scanner;
import model.Professor;

public class ProfessorView {

    Scanner sc = new Scanner(System.in);
    
    ProfessorController pc = new ProfessorController();
   
    public ProfessorView(){}
    
    private void cadastrar(int opcao){
        Professor professor = new Professor();
        System.out.print("Maticula: ");
        professor.setMatricula(sc.nextInt());
        System.out.print("Nome: ");
        professor.setNome(sc.next());
        System.out.print("Idade: ");
        professor.setIdade(sc.nextInt());
        System.out.print("Disciplina: ");
        professor.setDisciplina(sc.next());
    }    
    
    private void listarTudo(){
        for(Professor professor : pc.findAll()){
            System.out.println(professor.toString());
        }
    }
    
    private void remover(){
        Professor professor = new Professor();
        System.out.print("Matricula: ");
        professor = pc.findById(sc.nextInt());
        if (professor == null){
            System.out.println("Professor não cadastrado");
        } else {
            pc.delete(professor);
        }
    }
    
      
    public void run(){
        int opcao = -1;
        do {
  //          Professor professor = new Professor();
            System.out.print(
              "======Professore======"
            + "\n1-Cadastrar"
            + "\n2-Listar Tudo"
            + "\n3-Buscar por Matricula"
            + "\n4-Editar Professor"
            + "\n5-Excluir Professor"
            + "\n0-Sair"
            + "\n======================"
            + "\n\nOpção: ");
       
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    cadastrar();
                    break;
                case 2 :
                    listarTudo();
                    break;
                case 5 :
                    remover();
                    break;
                    
  
            }
        } while(opcao != 0);
    
    }
    
//    public static void main(String[] args){
//        new ProfessorView().run();
//    }

    private void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    
}
