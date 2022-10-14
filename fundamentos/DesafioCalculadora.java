package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double num1, num2;

        System.out.println("------Menu-----");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");

        System.out.println("Digite um número: ");
        num1 = dados.nextDouble();
        System.out.println("Digite um número: ");
        num2 = dados.nextDouble();
        System.out.println("Escolha uma opção: ");
        int opcao = dados.nextInt();

        // Lógica usando operador ternário;

        double resultado = opcao == 1 ? num1 +num2 : 0;
         resultado = opcao == 2 ? num1 -num2 : resultado;
         resultado = opcao == 3 ? num1 *num2 : resultado;
         resultado = opcao == 4 ? num1 /num2 : resultado;

       System.out.println(resultado);
        
        dados.close();

}
}
