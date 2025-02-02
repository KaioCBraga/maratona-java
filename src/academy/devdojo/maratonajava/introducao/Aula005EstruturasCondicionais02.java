package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Estrutura IF-ELSE (se-não) e ELSE IF (se-não-se)
        int idade = 14;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
