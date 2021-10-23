package aula13_10_2021_encapsulamento;

public class Calculos {
    private float a, b;  

    public float getA() {
        return a;
    }
    
    public void setA(float a){
    this.a=a;
    }
    
     public float getB() {
        return b;
    }
    
    public void setB(float b){
        this.b=b;
    }
    
    public float soma(){
        return a+b;
    }
    public float subtracao(){
        return a-b;
    }
    public float multipli(){
        return a*b;
    }
    public float divisao(){
        return a/b;
    }
}
