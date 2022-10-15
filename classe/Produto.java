package classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;

    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Produto() {

    }
    double precoComDesconto() {
    double resultado = preco - desconto;
    return resultado;
   } 

   
    double precoComDesconto(double descontoDoGerente) {
    double resultado = preco - desconto + descontoDoGerente;
    return resultado;
   } 
}
