package classe;

public class AreaCircTeste {
    
    public static void main(String[] args) {
        
        AreaCirc a = new AreaCirc(10);
        // Forma ideal para se usar "static" na classe teste e mudar sua constante para as instancias
        AreaCirc.pi = 3.1415;
        System.out.println(a.area());


        System.out.println(AreaCirc.area(100));
        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI);
    }
}
