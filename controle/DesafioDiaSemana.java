package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.println("Qual dia da semana? ");
        String diaSemana = dados.next();

        if (diaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (diaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (diaSemana.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (diaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (diaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (diaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (diaSemana.equalsIgnoreCase("Sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia inexistente");
        } 
        dados.close();
    }
}
