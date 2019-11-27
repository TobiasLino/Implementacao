/*
    Implementação de uma classe que insere os pedidos dentro de uma Pilha.
    A pilha tem as funções de inserir(push), remover(pop) e pesquisar(search),
    ela imprime os valores do primeiro pedido inserido ao último.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lista<Type> {
    private int top;
    private int max;
    private Pedido[] mem;
    private Pedido pedido;

    public Lista(int m)
    {
        max = m;
        top = -1;
        mem = new Pedido[m];
    }
    public void push(Pedido in)
    {
        if(!full()) {mem[++top] = in;}
        else {System.out.println("Cheio ");}
    }
    public Type pop() 
    {
        if(!empty()) {return mem[top--];}
        else 
        {
            System.out.println("Pilha vazia ");
            return null;
        }
    }
    public boolean empty() {return top==-1;}
    public boolean full() {return top==max-1;}

    
}