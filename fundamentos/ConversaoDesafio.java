package fundamentos;

import java.util.Scanner;

public class ConversaoDesafio {
    
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String a = dados.nextLine().replace(",", ".");
        System.out.println("Digite o segundo salário: ");
        String b = dados.nextLine().replace(",", ".");
        System.out.println("Digite o terceiro salário: ");
        String c = dados.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(a);
        double salario2 = Double.parseDouble(b);
        double salario3 = Double.parseDouble(c);

        System.out.println("Primeiro salário: "+ salario1);
        System.out.println("Segundo salário: "+ salario2);
        System.out.println("Terceiro salário: "+ salario3);

        double soma = salario1+salario2+salario3;
        double media = soma / 3;
        System.out.println("A média salarial do funcionário com os últimos três salários é: " + media);
        dados.close();
        
    }
    
}
