package estruturadedados;

public class ExemplodeArray {
    public static void main(String[] args) {
        Integer array1[] = new Integer[3];
        
        array1[0]=50;
        array1[1]=40;
        array1[2]=72;
        
        System.out.println("O valor da 2a ocorrência do array é: "+array1[1]);
        
        String produtos[] = new String[3];
        
        produtos[0]="Impressora 3D";
        produtos[1]="Microfone USB";
        produtos[2]="Webcam 2.0";
        
        for(int i =0; i < produtos.length; i++)
        {
            System.out.println(i+1 +" - "+produtos[i]);
        }
        
    }    
}
