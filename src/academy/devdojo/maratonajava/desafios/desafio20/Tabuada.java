package academy.devdojo.maratonajava.desafios.desafio20;

public class Tabuada implements calcularTabuada {


    private int number;

    public Tabuada(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void calcTabuada(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
