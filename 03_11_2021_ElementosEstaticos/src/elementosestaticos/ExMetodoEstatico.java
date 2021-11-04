package elementosestaticos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExMetodoEstatico {
    static double n3 = 50;
    double n4 = 200;
    
    public static double soma(double x, double y){
    return x+y;
    }
    
    public  double subtracao(double x, double y){
       return x-y;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ExMetodoEstatico obj = new ExMetodoEstatico();
        
        System.out.print("Digite um valor para n3:");
        n3 = scan.nextDouble();
        
        System.out.print("Digite um valor para n4:");
        obj.n4 = scan.nextDouble();
        
        System.out.println("O valor da soma é: "+soma(n3, obj.n4));
        
         System.out.println("O valor da subtracao é: "+obj.subtracao(n3, obj.n4));
    }
    
}
