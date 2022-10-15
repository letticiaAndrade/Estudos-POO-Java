package classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
    double resultado = preco - desconto;
    return resultado;
   } 

   
    double precoComDesconto(double descontoDoGerente) {
    double resultado = preco - desconto + descontoDoGerente;
    return resultado;
   } 
}
