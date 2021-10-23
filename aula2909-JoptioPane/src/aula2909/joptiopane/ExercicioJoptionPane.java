package aula2909.joptiopane;

import javax.swing.JOptionPane;

public class ExercicioJoptionPane 
{
    public static void main(String[] args) 
    {
        int nota1=-1, nota2, nota3, nota4;

        while (nota1!=0) 
        {
            nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 1"));
            if(nota1!=0)
            {
                nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 2"));
                nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 3"));
                nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 4"));
                if(nota2==0 ||nota3==0 || nota4==0)
                {
                    JOptionPane.showMessageDialog(null, "Os valores das notas não podem ser 0, digite elas novamente ");
                     nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 2"));
                    nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 3"));
                    nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a nota 4"));
                }
                JOptionPane.showMessageDialog(null, (nota1 + nota2 + nota3 + nota4) / 4);
            }
        }
    }
}
