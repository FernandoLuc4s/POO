package exeercencapsulamento;

public class Veiculo {
    protected int id;
    protected String marca; 
    protected String modelo; 
    String cor;
    private long chassi;
    private double ano;

    public long getChassi() {
        return chassi;
    }
    
    public void setChassi(long chassi){
        this.chassi = chassi;
    }

    public double getAno() {
        return ano;
    }
    
     public void setAno(double ano){
        this.ano = ano;
    }
}
