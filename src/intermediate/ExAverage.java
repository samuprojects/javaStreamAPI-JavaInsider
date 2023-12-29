package intermediate;

import java.util.Comparator;
import java.util.List;

public class ExAverage {

    // Requisito: implementar um código para retornar e imprimir da tela o ranking dos 3 melhores alunos com as melhores médias entre as provas realizadas.
    // Considerar o uso de records para representar um aluno (record Student (String name, List<Double> grades)) e o rank (record Rank(String name, double average)

    public static void main(String[] args) {

        var students = List.of(
                new Student("José", List.of(8.5, 10.0, 9.0)),
                new Student("Pedro", List.of(7.0, 7.0, 7.0)),
                new Student("Maria", List.of(6.5, 9.0, 4.0)),
                new Student("Sara", List.of(6.5, 7.0, 7.5)),
                new Student("Rodrigo", List.of(4.5, 3.0, 6.5))
        );

        /*
        * Iniciamos com students.stream() para trabalhar com os dados nesse formato,
        * depois mapeamos esses objetos Student em objetos do tipo Rank, onde para cada aluno criamos um novo Rank.
        * Para esse Rank passamos como parâmetro o nome que vem do aluno e a média (acessando pelo objeto "s" para calcular a média dos elementos de uma lista).
        * Como a lista tem uma coleção de dados podemos utilizá-la como fonte para uma stream, onde passamos s.grades.stream() para abrir a stream API dessa lista
        * Nesses dados mapeamos cada um deles para um objeto Double através do mapToDouble() passando a própria nota (g), seguido do cálculo da média com o average()
        * Como o retorno de average é um OptionalDouble chamamos o orElse() passando 0 para os casos de alunos sem nota, tornando a média 0.
        * */
        students.stream().map(s -> new Rank(s.name, s.grades.stream().mapToDouble(g -> g).average().orElse(0)))

                /*
                * Agora vamos organizar o Rank chamando o sorted e passando como parâmetro um Comparator.comparing definindo como parâmetro de comparação o Rank::average
                * Depois indicados por meio do reversed a ordem decrescente e no limite de 3 alunos (top 3)
                * Por último chamamos a operação terminal forEach passando o println para imprimir os valores na tela
                * */
                .sorted(Comparator.comparing(Rank::average).reversed()).limit(3).forEach(System.out::println);

    }

    private record Student(String name, List<Double> grades) {}

    private record Rank(String name, double average){}
}
