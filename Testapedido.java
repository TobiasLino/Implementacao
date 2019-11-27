public class Testapedido {
    public static void main(String[] args) {
        Item it1, it2, it3;
        it1 = new Item(100,3,3);
        it2 = new Item(101,2,4);
        it3 = new Item(102,1,5);

        Pedido pedido1 = new Pedido(1001,"Ana");
        Pedido pedido2 = new Pedido(1001,"Paula");
        Pedido pedido3 = new Pedido(1001,"Silva");
        

        pedido1.adicionaItem(it1);
        pedido1.adicionaItem(it2);
        pedido1.adicionaItem(it3);

        pedido2.adicionaItem(it1);
        pedido2.adicionaItem(it2);
        pedido2.adicionaItem(it3);

        pedido3.adicionaItem(it1);
        pedido3.adicionaItem(it2);
        pedido3.adicionaItem(it3);

        pedido1.imprimir();
        pedido2.imprimir();
        pedido3.imprimir();

        Lista<Pedido> pilha;
        pilha = new Lista<Pedido>(80);
        pilha.push(pedido1);
        pilha.push(pedido2);
        pilha.push(pedido3);
        int i=0;
        do {
            System.out.print("Pedido: "+i);
            pilha.pop();
            i++;
        } while(!pilha.empty());
    }
}