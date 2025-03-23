package academy.devdojo.maratonajava.desafios.desafio16;

public class Traingle {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Traingle(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }


    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public void verificarValidade() {
        if ((ladoA > 0 && ladoB > 0 && ladoC > 0) && (ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) &&
                (ladoA + ladoC > ladoB)) {
            System.out.println("Seu triangulo é valido");
        } else System.out.println("Triangulo invalido!");
    }

    public void verrificarTriangle() {
        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("O triangulo é equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("O triangulo é isósceles");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("O triangulo é escaleno ");

        }
    }
}
