package terminal;

import java.util.stream.Collectors;

public class AppCollect4 {
    public static void main(String[] args) {
        // coletar agrupando dados com algum critério especificado

        // agrupando nomes por letra inicial
        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(i -> i.name().charAt(0)))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
