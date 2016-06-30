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
            Aluno aluno = new Aluno();
            System.out.print(
              "======= Alunos ======="
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
                case 3 :
                    System.out.print("Digite a Matrícula: "); 
                    aluno = ac.findById(sc.nextInt());
                    if (aluno == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        System.out.println(aluno.toString());
                    }
                    break;
                case 4 :
                    System.out.print("Digite a Matrícula: "); 
                    aluno = ac.findById(sc.nextInt());
                    if (aluno == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        //System.out.println(aluno.toString());
                        System.out.print("Nome: ");
                        aluno.setNome(sc.next());
                        System.out.print("Idade: ");
                        aluno.setIdade(sc.nextInt());
                        ac.update(aluno);
                    }
                    break;
                case 5 :
                    System.out.print("Digite a Matrícula: "); 
                    aluno = ac.findById(sc.nextInt());
                    if (aluno == null){
                        System.out.println("Matrícula não encontrada");
                    }else {
                        System.out.println(aluno.toString());
                        ac.delete(aluno);
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