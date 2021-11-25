package estruturadedados;

public class ExeMatriz {
    public static void main(String[] args) {
        String nome[][] = new String[3][3];
        
        nome[0][0]="Karoline";
        nome[0][1]="Alves dos Santos";
        nome[0][2]="KAS";
        
        nome[1][0]="Lucas";
        nome[1][1]="Capril de Araujo";
        nome[1][2]="LCA";
        
        nome[2][0]="Andrea";
        nome[2][1]="de Souza Soares";
        nome[2][2]="ASS";
        
        for (int i = 0; i < nome.length; i++) {
            System.out.print(" Nome na linha "+(i+1));
            System.out.print(": "+nome[i][0]+" "+nome[i][2]+"\n");
        }
    }
    
}
