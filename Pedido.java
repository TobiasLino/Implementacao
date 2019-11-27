import java.util.ArrayList;
import java.util.List;

public class Pedido {
    protected int numero;
    protected String cliente;
    protected List<Item> lista;

    public Pedido(int n, String v) {numero=n;cliente=v;lista=new ArrayList<Item>();}
    public void adicionaItem(Item it){lista.add(it);}
    public double calcularTotal(){
        double total=0;
        for(int i=0;i<lista.size();i++) {
            Item umItem=lista.get(i);
            total+=umItem.calcularcustoItem();
        }
        return total;
    }
    public void imprimir() {
        System.out.println("Pedido: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Itens:");
        for(int i=0;i<lista.size();i++) {
            Item umItem=lista.get(i);
            System.out.println("*");
            umItem.imprime();
        }
        System.out.println("Total do pedido: "+calcularTotal());
    }
    public String getcliente() {return cliente;}

    public void printWithoutClient() {
        System.out.println("Itens:");
        for(int i=0;i<lista.size();i++) {
            Item umItem=lista.get(i);
            System.out.println("*");
            umItem.imprime();
        }
        System.out.println("Total do pedido: "+calcularTotal());
    }
}