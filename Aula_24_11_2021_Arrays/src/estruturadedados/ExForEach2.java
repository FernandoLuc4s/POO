package estruturadedados;

import java.util.ArrayList;
import java.util.Collections;

public class ExForEach2 {
    public static void main(String[] args) {
       
        ArrayList<String> listaNomes = new ArrayList();
        
        listaNomes.add("Karoline");
        listaNomes.add("Lucas");
        listaNomes.add("Andrea");
        Collections.sort(listaNomes);
        
        listaNomes.forEach((nomes) ->{
            System.out.println(nomes);
        });
    }
}
