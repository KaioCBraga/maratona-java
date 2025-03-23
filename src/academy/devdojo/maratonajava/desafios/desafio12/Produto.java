package academy.devdojo.maratonajava.desafios.desafio12;

public class Produto {
    private String nome;
    private double valor;
    private TipoPagamento tipoPagamento;


    public Produto(String nome, double valor, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    protected double valorPagar(double valor) {
        if (getTipoPagamento() == TipoPagamento.CARTAO_PARCELADO3) {
            double v = valor + tipoPagamento.calcularDesconto(this.valor);
            return this.valor = v;
        } else {
            double v = valor - tipoPagamento.calcularDesconto(this.valor);
            return this.valor = v;
        }
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
