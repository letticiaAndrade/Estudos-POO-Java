package controle;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar "+ "\nas palavras mágicas...");
            System.out.println("Quer sair?");
            texto = dados.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
        
        System.out.println("Obrigado!");
        dados.close();
    }
}
