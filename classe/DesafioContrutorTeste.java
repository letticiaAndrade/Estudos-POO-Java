package classe;

public class DesafioContrutorTeste {
    
    public static void main(String[] args) {
        
        DesafioConstrutor data1 = new DesafioConstrutor(3,8,2002);
        String dataFormatada1 = data1.obterDataFormatada();
        System.out.println(dataFormatada1);

        DesafioConstrutor data2 = new DesafioConstrutor();
        String dataFormatada2 = data2.obterDataFormatada();
        System.out.println(dataFormatada2);
      
        data2.obterDataFormatada();
    }
}
