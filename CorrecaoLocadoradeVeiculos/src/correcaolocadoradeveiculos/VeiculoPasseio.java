/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaolocadoradeveiculos;

public class VeiculoPasseio extends Veiculo {
    double valor;
    String dt_cadastro;
    private int km;

    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }
    
    
}
