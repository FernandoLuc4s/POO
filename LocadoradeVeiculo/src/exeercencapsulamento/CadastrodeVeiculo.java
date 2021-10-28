package exeercencapsulamento;

import javax.swing.JOptionPane;

public class CadastrodeVeiculo {

    public static void main(String[] args) {
        VeiculoPasseio v2 = new VeiculoPasseio();
        VeiculoCarga v1 = new VeiculoCarga();
        int option=10;
        
        while (option != 0) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção <1> para veiculos de carga ou 2 para veiculos de passeio"));
            if (option == 1) {
                v1.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veiculo"));
                v1.marca = JOptionPane.showInputDialog("Digite a marca do veículo");
                v1.modelo = JOptionPane.showInputDialog("Digite o modelo do veículo");
                v1.cor = JOptionPane.showInputDialog("Digite a cor do veículo");
                v1.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o numero do chassi do veículo")));
                v1.setAno(Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do veículo")));
                v1.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veículo"));
                v1.dt_Cadastro = JOptionPane.showInputDialog("Digite a data de cadastro do veículo");
                v1.setKm(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de KM do veículo")));
                v1.tipodeCarga = JOptionPane.showInputDialog("Digite o tipo de carga do veículo");

                // Mostrando os dados digitados
                JOptionPane.showMessageDialog(null, "Id: " + v1.id + "\nMarca: " + v1.marca + "\nModelo: " + v1.modelo + "\nCor: " + v1.cor + "\nChassi: " + v1.getChassi() + "\nAno: " + v1.getAno()
                        + "\nValor: " + v1.valor + "\nData de Cadastro: " + v1.dt_Cadastro + "\nKM: " + v1.getKm() + "\nTipo de carga: " + v1.tipodeCarga);
            } else if (option == 2) {
                v2.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do veiculo"));
                v2.marca = JOptionPane.showInputDialog("Digite a marca do veículo");
                v2.modelo = JOptionPane.showInputDialog("Digite o modelo do veículo");
                v2.cor = JOptionPane.showInputDialog("Digite a cor do veículo");
                v2.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o numero do chassi do veículo")));
                v2.setAno(Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do veículo")));
                v2.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veículo"));
                v2.dt_Cadastro = JOptionPane.showInputDialog("Digite a data de cadastro do veículo");
                v2.setKm(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de KM do veículo")));

                // Mostrando os dados digitados
                JOptionPane.showMessageDialog(null, "Id: " + v2.id + "\nMarca: " + v2.marca + "\nModelo: " + v2.modelo + "\nCor: " + v2.cor + "\nChassi: " + v2.getChassi() + "\nAno: " + v2.getAno()
                        + "\nValor: " + v2.valor + "\nData de Cadastro: " + v2.dt_Cadastro + "\nKM: " + v2.getKm());
            }
        }
         JOptionPane.showMessageDialog(null,"Programa terminado");
    }
}
