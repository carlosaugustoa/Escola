package View;

import java.util.Scanner;

class PrincipalView {

    Scanner sc = new Scanner(System.in);
     
        private void Principalrun(){
        
        int opcao = -1;
        do {
            System.out.print(
              "====== Opcões ======="
            + "\n1-Professor"
            + "\n2-Aluno"
            + "\n3-Turmas"
            + "\n0-Sair"
            + "\n======================"
            + "\n\nOpção: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    ProfessorView.run();
                    break;
                case 2 :
                    AlunoView.run();
                    break;
                case 3 :
                    
                    break;
            }
        } while(opcao != 0);
    
    } 
    
    public static void main(String[] args){
        new PrincipalView().Principalrun();
           
    }
}       