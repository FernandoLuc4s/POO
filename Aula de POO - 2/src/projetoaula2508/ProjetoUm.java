package projetoaula2508;
import java.util.Scanner;


public class ProjetoUm {

	public static void main(String[] args) {
		float n1, n2, resultado;
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextFloat();
		n2 = scan.nextFloat();
		System.out.println("o valor do primeiro n�mero �: "+n1);
		System.out.println("o valor do segundpo n�mero �: "+n2);
		
		resultado = (n1+n2) / 2;
		
		System.out.println("O valor da m�dia �: "+resultado);

	}

}
