/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeercencapsulamento;

/**
 *
 * @author User
 */
public class VeiculoCarga extends Veiculo{
    double valor;
    String dt_Cadastro;
    private int km;
    String tipodeCarga;
    
    public void setKm(int km){
        this.km = km;
    }
    public int getKm(){
        return km;
    }
}
