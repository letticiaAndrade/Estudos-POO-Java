package classe;



public class DataMain {
    
    public static void main(String[] args) {
        
    Data data1 = new Data();

    data1.ano = 2002;
    data1.dia = 3;
    data1.mes = 8;

    Data data2 = new Data();

    data2.ano = 2000;
    data2.dia = 4;
    data2.mes = 4;
    
    String dataFormatada1 = data1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
        

    }
}
