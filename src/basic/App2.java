package basic;

import java.util.List;

public class App2 {

    public static void main(String[] args) {

        // Criando conjunto de dados para ser a fonte da Stream
        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );

        people.stream() // obtendo stream a partir da fonte de dados
                .map(Person::name) // nesta primeira operação intermediária mapeamos cada uma das pessoas (objetos Person) da coleção para o nome do objeto Person (transformando dados do tipo Person em dados do tipo String)
                .map(String::toUpperCase) // a seguir mapeamos todas as strings em outras strings com letra maiúscula
                .sorted() // depois nesta, outra operação intermediária, ordenamos os nomes em ordem alfabética
                .forEach(System.out::println); // por último o forEach (que é uma operação terminal) executou em cada um dos elementos a operação de exibir na tela
    }

    record Person (String name, int age) {}
}
