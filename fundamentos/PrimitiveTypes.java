package fundamentos;
public class PrimitiveTypes{
        public static void main(String[] args) {
            // Tipos numéricos inteiros
            // Byte - menor armazenamento ideal para pequenos tamanhos - 1 - intervalo de -127 e 127
            byte anosDeEmpresa = 23;
            // Short - capacidade levemente grande - 2
            short numeroDeVoos = 542;
            // Int - capacidade grande - 4
            int id = 56789;
            // long - capacidade enorme - 8
            long pontosAcumulados = 3_234_845_223L;

            // Tipos numéricos reais
            // float - capacidade grande - 4;
            float salario = 11+445.44F;
            // double - capacidade enorme - 8
            double vendasAcumuladas = 2_991_797_103.01;

            // Tipo booleano
            boolean estaDeFerias = false; // true or false

            // Tipo caractere 
            char status = 'A'; // ativo 

            // Dias de empresa
            System.out.println(anosDeEmpresa *365);

            // Número de viagens
            System.out.println(numeroDeVoos / 2);

            // Pontos por real
            System.out.println(pontosAcumulados / vendasAcumuladas);
            
            System.out.println(id+": ganha -> "+ salario);
            System.out.println("Férias? "+ estaDeFerias);
            System.out.println("Status: " + status);

        }
}