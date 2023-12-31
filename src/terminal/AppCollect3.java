package terminal;

import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class AppCollect3 {
    public static void main(String[] args) {
        // transformar elementos de uma stream em Map

        var items = Item
                .list()
                .stream()
                .collect(Collectors.toMap(i -> i.name(), i -> i.price())); // no toMap o primeiro parâmetro representa a key e o segundo o value
        System.out.println(items);

        // como estamos usando o próprio parâmetro da expressão lambda para chamar o método podemos simplificar com method reference

        var items2 = Item
                .list()
                .stream()
                .collect(Collectors.toMap(Item::name, Item::price));
        System.out.println(items2);
    }
}
