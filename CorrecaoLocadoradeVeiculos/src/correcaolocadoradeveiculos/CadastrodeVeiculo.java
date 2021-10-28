package correcaolocadoradeveiculos;
import javax.swing.JOptionPane;

public class CadastrodeVeiculo 
{
    public static void main(String[] args) 
    {
        int opcao;
        do{
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha <0> para sair, <1> para Veiculos de passei e <2> para veiculos de carga"));
        
        if (opcao==1) {
            VeiculoPasseio vp = new VeiculoPasseio();
            
            vp.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do veiculo"));
            vp.cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
            vp.dt_cadastro = JOptionPane.showInputDialog("Digite a data de cadastro do veiculo");
            vp.marca = JOptionPane.showInputDialog("Digite a marca do veiculo");
            vp.modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
            vp.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veiculo"));
            vp.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo")));
            vp.setKm(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do veiculo")));
            vp.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o número de chassi do veiculo")));
            
            JOptionPane.showMessageDialog(null, "Os dados digitados foram\n"+vp.id+"\n"+vp.cor+"\n"+vp.dt_cadastro+"\n"+vp.marca+"\n"+vp.modelo+"\n"+vp.valor+"\n"+vp.getAno()+"\n"+vp.getKm()+"\n"+vp.getChassi());
            
        }
        if (opcao==2) {
            VeiculoCarga vg = new VeiculoCarga();
            vg.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do veiculo"));
            vg.cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
            vg.dt_cadastro = JOptionPane.showInputDialog("Digite a data de cadastro do veiculo");
            vg.marca = JOptionPane.showInputDialog("Digite a marca do veiculo");
            vg.modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
            vg.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veiculo"));
            vg.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo")));
            vg.setKm(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do veiculo")));
            vg.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o número de chassi do veiculo")));
            vg.tipodeCarga = JOptionPane.showInputDialog("Digite o tipo da carga do veiculo");
            
            JOptionPane.showMessageDialog(null, "Os dados digitados foram\n"+vg.id+"\n"+vg.cor+"\n"+vg.dt_cadastro+"\n"+vg.marca+"\n"+vg.modelo+"\n"+vg.valor+"\n"+vg.getAno()+"\n"+vg.getKm()+"\n"+vg.getChassi()+"\n"+vg.tipodeCarga);
            
        }
        }while(opcao!=0); 
    }
}
