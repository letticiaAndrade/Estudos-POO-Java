package fundamentos;

public class temperature {
    public static void main(String[] args) {
        double F = 100;
        final double constante1 = 32;
        final double constante2 = 5/9.0;
        double C = (F-constante1)* constante2;
        System.out.println(C);
    }
}
