package exemplodeclasses;

import java.util.Scanner;



public class DigitaConta {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ContaPoupanca contap = new  ContaPoupanca();
        
        contap.numeroConta =1;
        
        while (contap.numeroConta != 0) {
        System.out.print("Número da conta: ");
        contap.numeroConta = scan.nextInt();            
         System.out.print("Número do cliente: ");
         contap.numeroCliente = scan.nextInt();
         System.out.print("Data abertura: ");
         contap.dataAbertura = scan.next();
         System.out.print("Data aniversário: ");
         contap.dataAniversario = scan.next();
         System.out.print("Valor do depósito: ");
         double deposito = scan.nextDouble();
         contap.depositoConta(deposito);
         System.out.print("Valor do saque: ");
         double saque = scan.nextDouble();
         contap.saqueConta(saque);
         
          System.out.print("Seu saldo na conta poupança é "+contap.saldo);
          System.out.println("");
          System.out.println("Se quiser sair pressione o 0 ou então continue cadastrando");
          
        System.out.print("Número da conta: ");
        contap.numeroConta = scan.nextInt();    
        }
        System.out.println("Cadastro de conta poupança finalizado");    
    }
    
}
