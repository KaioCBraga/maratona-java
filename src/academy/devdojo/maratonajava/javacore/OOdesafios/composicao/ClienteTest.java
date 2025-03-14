package academy.devdojo.maratonajava.javacore.OOdesafios.composicao;

public class ClienteTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Faca", 29.99);
        Produto produto2 = new Produto("Colher", 8.99);
        Produto produto3 = new Produto("Garfo", 5.59);
        Produto produto4 = new Produto("Prato", 19.99);
        Item item1 = new Item(produto1, 4);
        Item item2 = new Item(produto2, 7);
        Item item3 = new Item(produto3, 7);
        Item item4 = new Item(produto4, 4);
        Item[] items1 = {item1, item2};
        Item[] items2 = {item3, item4};
        Compra compra1 = new Compra(items1);
        Compra compra2 = new Compra(items2);
        Compra[] compras = {compra1, compra2};
        Cliente cliente1 = new Cliente("Kaio", compras);
        cliente1.getValorTotal();
    }
}
