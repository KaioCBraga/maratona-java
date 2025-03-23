package academy.devdojo.maratonajava.desafios.desafio09;

public class Pessoa implements imc {
    private String nome;
    private int idade;
    private double Peso;
    private double Altura;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }


    @Override
    public void calcularIMC() {
        double imc = this.Peso / (this.Altura * this.Altura);
        System.out.printf("Seu imc é %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do pesos");
        } else if (imc < 24.9) {
            System.out.println("Peso ideal parabéns");
        } else if (imc < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
