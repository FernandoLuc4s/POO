package projetoseletor;

import java.io.IOException;

public class ProgramaSeletor {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Aqui é o programa seletor");
        ClassePrg1.main(args); 
        ClassePrg2.main(args);

        ClassePrg3 p3 = new ClassePrg3();
        p3.soma(50, 200);
        
        String x[] = {"Primeiro conteúdo do args", "Texto 2", "Texto 3"};
        ClassePrg4.main(x);
        
        System.out.println("\nEstou de volta ao programa seletor");
        
        Runtime.getRuntime().exec("notepad.exe"); // executando programa nativos do seu próprio SO
        Runtime.getRuntime().exec("calc.exe"); // iniciando calculadora
        Runtime.getRuntime().exec("mspaint.exe");//iniciando paint
        Runtime.getRuntime().exec("\"C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE\""); //iniciando Word
        Runtime.getRuntime().exec("cmd /c start dir");
     //   Runtime.getRuntime().exec("C:\\Users\\User\\AppData\\Local\\Programs\\Opera GX");
    }
}
