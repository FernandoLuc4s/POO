package aula13_10_2021_encapsulamento;
import java.util.Scanner;

public class ExemploEncapsulamento {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculos calc = new Calculos();
        System.out.print("Digite o valor de A ");
        calc.setA(scan.nextFloat());
        System.out.print("Digite o valor de B ");
        calc.setB(scan.nextFloat());
        
        System.out.println("valor de A é: "+calc.getA());
        System.out.println("a soma é: "+calc.soma());
        System.out.println("a subtração é: "+calc.subtracao());
        System.out.println("a multiplicação é: "+calc.multipli());
         System.out.println("a divisão é: "+calc.divisao());
         
    }
    
}
