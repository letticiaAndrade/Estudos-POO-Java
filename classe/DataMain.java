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

        System.out.printf("Data : %d / %d / %d",data1.dia,data1.mes, data1.ano);

        System.out.printf("\nData : %d / %d / %d",data2.dia,data2.mes, data2.ano);

   
    }
}
