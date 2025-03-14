package academy.devdojo.maratonajava.javacore.OOdesafios.composicao;

import java.util.Arrays;

public class Compra {
    private Cliente cliente;
    private Item[] items;


    public Compra() {
    }

    public Compra(Item[] items) {
        this.items = items;
    }

    public Compra(Cliente cliente, Item[] items) {
        this.cliente = cliente;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
