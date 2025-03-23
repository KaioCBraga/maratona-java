package academy.devdojo.maratonajava.desafios.desafio12;

public enum TipoPagamento {
    DINHEIRO_AVISTA {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    },
    PIX_AVISTA {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    }, CARTAO_AVISTA {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    }, CARTAO_PARCELADO2 {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0;
        }
    }, CARTAO_PARCELADO3 {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    };

    public abstract double calcularDesconto(double valor);
}
