package classe;

public class AreaCirc {
    
    double raio;
    // o atributo com o termo "static" não se associa mais a instancia/objeto e sim a classe 
    // o final static ou static final é uma constante e não mais variável
    static double pi = 3.14;

    AreaCirc (double raioInicial) {
        
        raio = raioInicial;
    }

    double area () {
        return pi * Math.pow(raio, 2);
    }

    // método "static"
    static double area (double raio) {
        return pi * Math.pow(raio, 2);
    }
}
