public class Item {
    // atributos
    private int codigo;
    private int quantidade;
    private double preco;
    //métodos
    public Item(int cod,int quant,double preco){codigo=cod;quantidade=quant;this.preco=preco;}
    public double calcularcustoItem(){return quantidade*preco;}
    public void imprime() {
        System.out.println("Código Item: "+codigo);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Preço: "+preco); 
    }
}