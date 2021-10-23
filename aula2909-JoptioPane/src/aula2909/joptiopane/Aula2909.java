package aula2909.joptiopane;
import javax.swing.JOptionPane;

public class Aula2909 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Para continuar clique no botão");
        
        String texto;
        texto = JOptionPane.showInputDialog(null,"Digite um número");
        
        double i;
        i = Double.parseDouble(texto);
        
        JOptionPane.showMessageDialog(null, "O valor convertido é "+i);
        
                
    }
    
}
