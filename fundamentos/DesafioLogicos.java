package fundamentos;

public class DesafioLogicos {
    
    public static void main(String[] args) {
        
        // Trabalho na terça terça (V OU F) 
        // Trabalho na quinta (V OU F)
        // Se trabalhar nos dois dias e derem certo vai comprar a tv de 50 polegadas
        // Se um dos trabalhos derem certo vai comprar a tv de 32 polegadas
        // Em ambos os casos a familia vai tomar sorvete

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

                // Operador Unário
                boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"?" + comprouTV50);
        System.out.println("Comprou TV 32\"?" + comprouTV32);
        System.out.println("Comprou TV 32\"Sorvete?" + comprouSorvete);
        System.out.println("Mais saudável?" + maisSaudavel);



        System.out.println();
    }
}
