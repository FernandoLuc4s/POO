package exemplodeclasses;

public class ContaPoupanca extends Conta {

    String dataAniversario;

    @Override // reescrita de metódo, tá te avisando que você está trazendo algo que já existe na classe --> tipo de Polimorfismo
    void saqueConta(double valor) { // polimorfismo acontece quando você reescreve um metódo que já existe
        if ((saldo - valor) >= 0) {
            saldo -= valor;
        } else {
            System.out.println("ERRO: saldo ficará abaixo de 0.00 ");
        }
    }

    ContaPoupanca() {
    }

    ContaPoupanca(String dataAniversario, double valor) {
        this.dataAniversario = dataAniversario;
        this.saldo = valor;
    }

    ContaPoupanca(int numeroConta, String dataAniversario, double valor) {
        this.numeroConta = numeroConta;
        this.dataAniversario = dataAniversario;
        this.saldo = valor;
    }

}
