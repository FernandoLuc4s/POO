package exemplodeclasses;

public class TesteExemplodeClasses {
    public static void main(String[] args) {
       ContaPoupanca cp = new ContaPoupanca();
       ContaPoupanca cp2 = new ContaPoupanca("13/08/2002", 500.00);
        ContaPoupanca cp3 = new ContaPoupanca(1000,"13/08/2002", 500.00);
        cp3.saqueConta(30.00);
        System.out.print("Dados iniciais da conta Poupança: Nº Conta: "+cp3.numeroConta+" Data Aniversário: "+cp3.dataAniversario+" Saldo: "+cp3.saldo);
        
        
        ContaCorrente contac = new ContaCorrente();
        contac.saqueConta(500);
        System.out.println("\nO saldo da conta corrente é : "+contac.saldo);
    }
}
