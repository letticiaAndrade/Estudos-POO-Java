package classe;

public class PrimeiroTrauma {
    
    int a = 3; // não pode mexer aqui! É o desafio

    // outra forma de resolver o desafio
    static int b = 4; // transformando em estático 

    public static void main(String[] args) {
        // mesmo estando na própria classe, só consegue acessar um membro de instância (dentro do main) a partir de um método estático se criar uma instância

        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);

        // outra forma seria transformar o atributo em estático. Algo estático (o main é estático) pode acessar algo estático

        System.out.println(b);
    }
    
}
