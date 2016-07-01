package view;

import controller.ProfessorController;
import java.util.Scanner;
import model.Professor;

public class ProfessorView {

    Scanner sc = new Scanner(System.in);
    
    ProfessorController ac = new ProfessorController();
    
    
    
    private void run(){
        int opcao = -1;
        do {
            Professor professor = new Professor();
            System.out.print(
              "======Professores====="
            + "\n1-Cadastrar"
            + "\n2-Listar Tudo"
            + "\n3-Buscar por Matricula"
            + "\n4-Editar aluno"
            + "\n5-Excluir aluno"
            + "\n0-Sair"
            + "\n======================"
            + "\n\nOpção: ");
       
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Matricula: ");
                    professor.setMatricula(sc.nextInt());
                    System.out.print("Nome: ");
                    professor.setNome(sc.next());
                    System.out.print("Idade: ");
                    professor.setIdade(sc.nextInt());
                    System.out.print("Disciplina: ");
                    professor.setDisciplina(sc.next());
                    ac.create(professor);
                    break;
                case 2 :
                    for (Professor a : ac.findAll()){
                        System.out.println(a.toString());
                    }
                    break;
                case 3 :
                    System.out.print("Digite a Matrícula: "); 
                    professor = ac.findById(sc.nextInt());
                    if (professor == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        System.out.println(professor.toString());
                    }
                    break;
                case 4 :
                    System.out.print("Digite a Matrícula: "); 
                    professor = ac.findById(sc.nextInt());
                    if (professor == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        System.out.print("Nome: ");
                        professor.setNome(sc.next());
                        System.out.print("Idade: ");
                        professor.setIdade(sc.nextInt());
                        System.out.print("Disciplina: ");
                        professor.setDisciplina(sc.next());
                        ac.update(professor);
                    }
                    break;
                case 5 :
                    System.out.print("Digite a Matrícula: "); 
                    professor = ac.findById(sc.nextInt());
                    if (professor == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        System.out.println(professor.toString());
                        ac.delete(professor);
                    }
                    break;
                    
            }
        } while(opcao != 0);
    
    }
    
    public ProfessorView() {}
    
    public static void main(String[] args){
        new ProfessorView().run();
    }
    
    
    
    
    
    
    
    
    
}
