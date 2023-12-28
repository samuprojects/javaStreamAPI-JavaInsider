package basic;

import java.util.List;
import java.util.stream.Collectors;

public class App5 {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );

        // Requisito: dessa lista de pessoas obter como resultado outra lista contendo apenas os nomes dessa lista people
        List<String> names = people.stream().map(Person::name).collect(Collectors.toList()); // vamos usar o collect (que é uma operação final) para coletar na forma de uma lista
        System.out.println(names);

        // outra opção é chamar o método toList (equivalente ao Collectors.toList) introduzido no Java 16 e criado devido o sucesso do Collectors.toList
        List<String> names2 = people.stream().map(Person::name).toList();
        System.out.println(names2);

        // daí é só brincar com o que quiser, por exemplo remover nomes com a letra R
        List<String> names3 = people.stream().map(Person::name).filter((n -> !n.startsWith("R"))).toList();
        System.out.println(names3);

        // ou converter os nomes todos em maiúsculas antes de trazer os nomes da lista
        List<String> names4 = people.stream().map(Person::name).map(String::toUpperCase).filter((n -> !n.startsWith("R"))).toList();
        System.out.println(names4);
    }

    record Person (String name, int age) {}
}
