
package exemplodeclasses;

public class Conta {
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){
        saldo -= valor;
    }
    void depositoConta(double valor){
        saldo += valor;
    }
    
     Conta(){
        saldo = 100;
    }
}
