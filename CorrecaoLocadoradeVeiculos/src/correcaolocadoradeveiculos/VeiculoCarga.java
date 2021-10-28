
package correcaolocadoradeveiculos;

public class VeiculoCarga extends Veiculo{
    double valor;
    String dt_cadastro;
    private int km;
    String tipodeCarga;
    
    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }
}
