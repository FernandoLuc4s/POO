package exemplodeclasses;

import java.util.Scanner;

public class CorrecaoDigitaConta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();
        int opcao = 3;
        while (opcao != 0) {
            System.out.print("Escolha <1>Poupança <2>Corrente <0>Sair:");
            opcao = scan.nextInt();
            if (opcao == 1) {

                System.out.println("\nCadastro em conta poupança\n");
                System.out.print("Número da conta: ");
                cp.numeroConta = scan.nextInt();
                while (cp.numeroConta<=0) {
                    System.out.println("Você digitou uma conta inválida, diigte um número diferente de 0");
                    cp.numeroConta = scan.nextInt();
                }
                System.out.print("Número do cliente: ");
                cp.numeroCliente = scan.nextInt();
                System.out.print("Data de Abertura: ");
                cp.dataAbertura = scan.next();
                System.out.print("Data de Aniversário: ");
                scan.nextLine();
                cp.dataAniversario = scan.nextLine();
                System.out.print("Digite o valor do deposito: ");
                cp.depositoConta(scan.nextDouble());
                System.out.println("o saldo é: " + cp.saldo);
                System.out.print("Digite o valor do saque: ");
                cp.saqueConta(scan.nextDouble());
                System.out.println("o saldo é: " + cp.saldo);

            }
            if (opcao == 2) {
                while (cc.numeroConta>=0) {
                    System.out.println("Você digitou uma conta inválida, diigte um número diferente de 0");
                    cc.numeroConta = scan.nextInt();
                }
                System.out.println("\nCadastro em conta corrente\n");
                System.out.print("Número da conta: ");
                cc.numeroConta = scan.nextInt();
                System.out.print("Número do cliente: ");
                cc.numeroCliente = scan.nextInt();
                System.out.print("Data de Abertura: ");
                cc.dataAbertura = scan.next();
                System.out.print("Código do Gerente: ");
                cc.gerente = scan.nextInt();
                System.out.print("Limite de Crédito: ");
                cc.limite = scan.nextDouble();
                System.out.print("Taxa Mensal: ");
                cc.taxaMensal = scan.nextDouble();
                System.out.print("Digite o valor do deposito: ");
                cc.depositoConta(scan.nextDouble());
                System.out.println("o saldo é: " + cc.saldo);
                System.out.print("Digite o valor do saque: ");
                cc.saqueConta(scan.nextDouble());
                System.out.println("o saldo é: " + cc.saldo);
            }
        }
        System.out.println("Programa Finalizado!!!!!!!!!!!!");
    }
}
