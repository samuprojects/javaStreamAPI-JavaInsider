package terminal;

import java.util.Comparator;
import java.util.stream.Collectors;

public class AppCollect6 {
    public static void main(String[] args) {

        // Mapear a quantidade de itens para determinado nome (nesse exemplo letra) (utilização do mesmo groupingBy, porém com a versão que recebe dois parâmetros
        Item
                .list()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                i -> i.name().charAt(0),
                                Collectors.counting()
                        )
                )
                .forEach((k, v) -> System.out.println(k + " => " + v));

        // Agrupar por letra e trazer a soma dos preços dos elementos que possuem a respectiva letra
        Item
                .list()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                i -> i.name().charAt(0),
                                Collectors.summingDouble(Item::price) //recebe uma ToDoubleFunction que no nosso caso é o Item e o Price
                        )
                )
                .forEach((k, v) -> System.out.println(k + " => " + v));

        // Agrupar pelo valor máximo associado a letra do nome
        Item
                .list()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                i -> i.name().charAt(0),
                                Collectors.maxBy(Comparator.comparing(Item::price)) // retorna um Optional, o mínimo é descartado
                        )
                )
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

