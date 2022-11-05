package classe;


public class Data {
    
    int mes;
    int ano;
    int dia;
    
    public Data () {

    }

    public Data(int dia, int mes, int ano) {

    }

    String obterDataFormatada() {
        return String.format(" %d / %d / %d", dia,mes,ano);
    }

    // Forma incomum e não recomendada
    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
