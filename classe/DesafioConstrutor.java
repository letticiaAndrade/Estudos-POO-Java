package classe;

public class DesafioConstrutor {
    
    int dia, mes, ano;

    DesafioConstrutor () {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    DesafioConstrutor ( int diaInicial, int mesInicial, int anoInicial) {
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;

    }
    String obterDataFormatada () {
        return String.format("%d/%d/%d", dia,mes,ano);
    }

}
