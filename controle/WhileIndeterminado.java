package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            valor = dados.nextLine();
        }
        dados.close();
    }
}
