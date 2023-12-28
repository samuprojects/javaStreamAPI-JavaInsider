package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App6 {

    public static void main(String[] args) {

        // Requisito: gerar uma lista com 10 vezes o número 5
        // Podemos usar o método estático generate da Stream API, que retorna uma stream. Ele recebe um Supplier como parâmetro
        // Um Supplier é uma interface funcional que retorna algo. Possui um método get que não recebe parâmetros, mas pode retornar qualquer tipo de coisa
        // É utilizado quando precisamos produzir alguma coisa. (IMPORTANTE, o generate produz uma stream infinita, por isso devemos informar o limite)
        List<Integer> numbers = Stream.generate(() -> 5).limit(10).toList();// usamos o toList para trazer a lista gerada pelo generate no limite 10 e atribuir a uma variável para exibição
        System.out.println(numbers);

        // é possível usar outras classes de Stream especializadas nos tipos primitivos (IntStream, LongStream, DoubleStream) que trabalham com o método generate
        // nesse cenário em específico como essas classes retornam o tipo primitivo a que fazem referência nominal não podemos armazenar em lista (pois elas só aceitam as classes Wrappers dos tipos primitivos) por isso vamos usar Arrays
        double[] array = DoubleStream.generate(() -> 3.5).limit(3).toArray();
        System.out.println(Arrays.toString(array));
    }
}
