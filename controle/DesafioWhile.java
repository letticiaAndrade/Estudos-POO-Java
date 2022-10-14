package controle;

import java.util.Scanner;

public class DesafioWhile {
    
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int notasValidas=0;
        double nota = 0;
        double totalNotas=0;
       
        while (nota != -1) {
            
            System.out.println("Qual a nota do aluno? (digite -1 para sair)");
            nota = dados.nextDouble(); 
            if (nota >= 0 && nota <=10) {
                totalNotas += nota;
                notasValidas++;  
            } else if (nota != -1) {
                System.out.println("Nota inválida. Digite novamente: ");
                nota = dados.nextDouble();
            }
         
        }
        double media = (totalNotas/notasValidas);
        System.out.println("Valor total de notas: " + totalNotas);
        System.out.println("Valor de notas válidas digitadas: " + notasValidas);
        System.out.println("A média das notas: " + media);
        dados.close();
            


    }
}
