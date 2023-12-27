package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App1 {

    public static void main(String[] args) {


        // Exemplos de como criar Streams
        Stream<String> s1 = Stream.of("A", "B", "C"); // gerado diretamente na stream

        String[] array = { "A", "B", "C" };
        Stream<String> s2 = Arrays.stream(array); // gerado a partir de uma fonte (source) array

        List<String> list = List.of("A", "B", "C");
        Stream<String> s3 = list.stream(); // gerado a partir de uma coleção (lista) de dados

        // com as streams criadas é possível executar várias operações intermediárias e uma terminal

        // vamos seguir com uma operação terminal, toda Stream possui um forEach que é uma operação terminal que consome elementos da Stream
        // recebe um Consumer como parâmetro e fazemos alguma coisa com o elemento, no exemplo, mostrar na tela.

        s1.forEach(System.out::println);
        s2.forEach(System.out::println);
        s3.forEach(System.out::println);

        // Dica:
        // → as operações terminais OU não retornam nada (são void), OU retornam apenas um valor final.
        // → as operações intermediárias retornam uma nova stream para aplicar mais operações
    }
}
