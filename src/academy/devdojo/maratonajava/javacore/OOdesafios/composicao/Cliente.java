package academy.devdojo.maratonajava.javacore.OOdesafios.composicao;

import java.util.Arrays;

public class Cliente {
    private String nome;
    private Compra[] compras;

    double valorTotal;

    private void obterValorTotal(int quantidade, double preco) {
        for (int i = 0; i < compras.length; i++) {
            valorTotal += quantidade * preco;
        }
    }

    public Cliente() {
    }

    public Cliente(String nome, Compra[] compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Compra[] getCompras() {
        return compras;
    }

    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", compras=" + Arrays.toString(compras) +
                '}';
    }
}