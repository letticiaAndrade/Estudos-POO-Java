package controle;

public class DesafioIf {
    /* Nesse desafio é necessário identificar o que gerou o bug da condição if (que nesse caso foi o uso da vírgula que fechou o bloco if)*/
    public static void main(String[] args) {
        
        double nota = 1.3;

        if (nota>= 9.0); 
        {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }
    }
    /* Código certo a seguir: 
     *   
        double nota = 1.3;

        if (nota>= 9.0) {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }
     */
}
