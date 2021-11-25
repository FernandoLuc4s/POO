package estruturadedados;

public class ArraydeObjetos {
    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto[] = new Produto[2];
        
        produto[0] = new Produto();
        produto[0].codigo=5000;
        produto[0].descricao="Retentor do volante";
        produto[0].valor=45.72;
        
        produto[1] = new Produto();
        produto[1].codigo=7000;
        produto[1].descricao="VElas de ignição";
        produto[1].valor=96.35;
        
        System.out.println("Relação de produtos - Total: "+produto.length); //retorna a quantida de objetos da classe
        for (Produto p : produto) {
            System.out.println("Códgio: "+p.codigo+" Descrição: "+p.descricao+" Valor: "+p.valor);
        }
        
        
        
        
    }
}
