package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        
        int a = 6*(3+2);
        double b = Math.pow(a, 2);
        int c = 3*2;
        double d = b / c;
        double e = (1- 5) * (2-7);
        double f = e / 2;
        double g = Math.pow(f, 2);
        double h = d - g;
        double i = Math.pow(h, 3) / Math.pow(10, 3); 
        System.out.println(i);
        
    }
}
