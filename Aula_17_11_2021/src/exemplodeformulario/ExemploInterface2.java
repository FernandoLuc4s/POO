package exemplodeformulario;


public class ExemploInterface2 {

    public static void main(String[] args) {
        CalcaArea q = new Quadrado(5);
        CalcaArea c = new Circulo(2);
        System.out.println("A Area do quadrado é: "+q.calcularArea());
         System.out.println("\nA Area do circulo é: "+c.calcularArea());
    }
    
}
