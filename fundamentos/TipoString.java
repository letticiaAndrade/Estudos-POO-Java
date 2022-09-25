package fundamentos;

public class TipoString {
    
    public static void main(String[] args) {
        System.out.println("Olá pessoal!".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s +"!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        String nome = "Pedro";
        String sobrenome = "Santos";
        byte idade = 33;
        double salario = 12345.987;
        
        System.out.println("Nome: " + nome +"\nSobrenome: " + sobrenome +"\nidade: " + idade+ "\nSalário: "+ salario +"\n\n");

        System.out.printf("Nome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);


        String frase = String.format("\nNome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario, args);
        System.out.println(frase);
        
    }
}
