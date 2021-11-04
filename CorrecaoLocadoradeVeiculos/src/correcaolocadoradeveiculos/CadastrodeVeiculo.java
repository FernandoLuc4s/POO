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
            VeiculoCarga vc = new VeiculoCarga();
            vc.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do veiculo"));
            vc.cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
            vc.dt_cadastro = JOptionPane.showInputDialog("Digite a data de cadastro do veiculo");
            vc.marca = JOptionPane.showInputDialog("Digite a marca do veiculo");
            vc.modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
            vc.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veiculo"));
            vc.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo")));
            vc.setKm(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do veiculo")));
            vc.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o número de chassi do veiculo")));
            vc.tipodeCarga = JOptionPane.showInputDialog("Digite o tipo da carga do veiculo");
            
            JOptionPane.showMessageDialog(null, "Os dados digitados foram\n"+vc.id+"\n"+vc.cor+"\n"+vc.dt_cadastro+"\n"+vc.marca+"\n"+vc.modelo+"\n"+vc.valor+"\n"+vc.getAno()+"\n"+vc.getKm()+"\n"+vc.getChassi()+"\n"+vc.tipodeCarga);
            
        }
        }while(opcao!=0); 
    }
}
