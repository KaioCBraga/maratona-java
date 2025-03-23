package academy.devdojo.maratonajava.desafios.desafio14;

public class Valor {
    private int valor_one;
    private int valor_two;

    public int getValo_one() {
        return valor_one;
    }

    public void setValo_one(int valor_one) {
        this.valor_one = valor_one;
    }

    public int getValo_two() {
        return valor_two;
    }

    public void setValo_two(int valor_two) {
        this.valor_two = valor_two;
    }

    public void trocaValor(int valor_one, int valor_two) {
        valor_one = this.valor_two;
        valor_two = this.valor_one;
        this.valor_one = valor_one;
        this.valor_two = valor_two;
    }

    @Override
    public String toString() {
        return "Valor{" +
                "valor_one=" + valor_one +
                ", valor_two=" + valor_two +
                '}';
    }
}
