package basic;

import java.util.Comparator;
import java.util.List;

public class App3 {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );

        // Requisito: exibir na tela as idades das pessoas, ordenadas em ordem decrescente, apenas de quem tem mais de 18 anos.
        people.stream().map(Person::age).filter(a -> a >= 18).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    record Person (String name, int age) {}
}
