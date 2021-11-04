package elementosestaticos;

public class TestaStatic {
          static int n1=567;
         int n2 =330;
         public static void soma(int valor){
               TestaStatic objeto = new TestaStatic(); 
             objeto.n1 += valor;
         }
    public static void main(String[] args) {
       
        TestaStatic objeto1 = new TestaStatic(); 
        TestaStatic objeto2 = new TestaStatic(); 
        
        
        System.out.println("o valor da variavel é = "+n1);
        System.out.println("o valor da variavel é = "+objeto1.n1); 
        System.out.println("o valor da variavel é = "+objeto2.n1); 
        
        n1=500;
        TestaStatic.n1=600;
        objeto1.n1 = 800;
         objeto1.n2 = 455;
        
        System.out.println("o valor da variavel é = "+n1);
        System.out.println("o valor da variavel é = "+objeto1.n1);
        System.out.println("o valor da variavel é = "+objeto2.n1);
        
        System.out.println("o valor da variavel é = "+objeto1.n2);
        System.out.println("o valor da variavel é = "+objeto2.n2);
 
    }
    
    
}
