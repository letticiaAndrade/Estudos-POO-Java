package classe;


public class Data {
    
    int mes;
    int ano;
    int dia;
    
    String obterDataFormatada() {
        return String.format(" %d / %d / %d", dia,mes,ano);
    }

    // Forma incomum e não recomendada
    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
