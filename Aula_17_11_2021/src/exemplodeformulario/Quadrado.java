/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodeformulario;

/**
 *
 * @author User
 */
public class Quadrado implements CalcaArea{
    double lado;
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    public Quadrado(double lado){
    this.lado = lado;
}
}


