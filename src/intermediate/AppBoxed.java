package intermediate;

import java.util.Arrays;
import java.util.List;

public class AppBoxed {

    public static void main(String[] args) {

        // Requisito: converter uma lista de números em uma IntStream e o inverso
        var numbers = List.of(1, 2, 3, 4, 5);

        var array = numbers.stream().mapToInt(i -> i).toArray();

        var list = Arrays.stream(array).boxed().toList();

        // Quando temos uma Stream e precisamos de uma IntStream utilizamos mapToInt (o mesmo para DoubleStream / mapToDouble, LongStream / mapToLong)
        // Quando temos uma IntStream, DoubleStream ou LongStream e precisamos de uma Stream (para armazenar, por exemplo, em uma lista) basta utilizar o boxed
        // O boxed utilizará a classe wrapper correspondente para armazenar o tipo primitivo (obtendo, por exemplo, uma Stream de Integer).

        System.out.println(Arrays.toString(array));
        System.out.println(list);

    }
}
