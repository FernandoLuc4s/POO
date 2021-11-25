package exemplodeformulario;

public class Circulo implements CalcaArea{
      double raio;
    @Override
    public double calcularArea(){
        return raio + raio + 3.14;
    }
    
    public Circulo(double raio){
        this.raio = raio;
    }
}

