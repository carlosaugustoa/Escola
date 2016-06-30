package view;

import controller.AlunoController;
import java.util.Scanner;
import model.Aluno;

public class AlunoView {

    Scanner sc = new Scanner(System.in);
    
    AlunoController ac = new AlunoController();
    
    private void run(){
        int opcao = -1;
        do {
            System.out.print(
              "==== Alunos ===="
            + "\n1-Cadastrar"
            + "\n2-Listar Tudo"
            + "\n3-Buscar por Matricula"
            + "\n4-Editar aluno"
            + "\n5-Excluir aluno"
            + "\n0-Sair"
            + "================="
            + "\nOpção: ");
       
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.print("Matricula: ");
                    aluno.setMatricula(sc.nextInt());
                    System.out.print("Nome: ");
                    aluno.setNome(sc.next());
                    System.out.print("Idade: ");
                    aluno.setIdade(sc.nextInt());
                    ac.create(aluno);
                    break;
                case 2 :
                    for (Aluno a : ac.findAll()){
                        System.out.println(a.toString());
                    }
                    break;
            }
        } while(opcao != 0);
    
    }
    
    public AlunoView() {}
    
    public static void main(String[] args){
        new AlunoView().run();
    }

}