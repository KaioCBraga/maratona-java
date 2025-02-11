package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Honda Civic";
        carro.modelo = "Basico";
        carro.ano = 2019;
        Carro carro2 = new Carro();
        carro2.nome = "Corolla";
        carro2.modelo = "Completo";
        carro2.ano = 2023;
        System.out.println("Troquei o meu " + carro2.nome + +carro2.ano + carro2.modelo + " por um " + carro.nome + carro.ano + carro.modelo);
    }
}
