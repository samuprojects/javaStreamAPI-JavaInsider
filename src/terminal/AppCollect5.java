package terminal;

import java.util.stream.Collectors;

public class AppCollect5 {
    public static void main(String[] args) {
        // Particionar a stream em 2 baseado em alguma condição

        Item
                .list()
                .stream()
                .collect(Collectors.partitioningBy(i -> i.price() >= 5))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
