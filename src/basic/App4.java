package basic;

import java.util.List;

public class App4 {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );

        // Requisito: descobrir qual é a maior idade da coleção. (Podemos usar mapToInt para mapear para inteiro (e retornar uma IntStream) e max (que é terminal e optional) para obter o maior valor)
        int max = people.stream().mapToInt(Person::age).max().orElse(0); // max (por ser OptionalInt) permite ainda chamar o orElse para informar 0 caso não encontre nada.
        System.out.println(max); // como max é terminal jogamos tudo isso na variável max para exibir separadamente no println

        // podemos repetir os passos para trazer o mínimo
        int min = people.stream().mapToInt(Person::age).min().orElse(0);
        System.out.println(min);

        // podemos trazer a média
        double avg = people.stream().mapToInt(Person::age).average().orElse(0); // como average retorna um OptionalDouble mudamos a variável para tipo double
        System.out.println(avg);
    }

    record Person (String name, int age) {}
}
