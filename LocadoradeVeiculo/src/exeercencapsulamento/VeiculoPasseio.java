package exeercencapsulamento;

public class VeiculoPasseio extends Veiculo {
     double valor;
     String dt_Cadastro;
     private int km;
     
     public void setKm(int km){
         this.km = km;
     }
     
     public int getKm(){
         return km;
     }
}
