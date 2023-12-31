package terminal;

import java.util.List;

public record Item(String name, double price) {

    public static List<Item> list() {
        return List.of(
                new Item("Cebola", 3.9),
                new Item("Café", 10.0),
                new Item("Farinha", 6.4),
                new Item("Banana", 7.0),
                new Item("Leite", 4.7)

        );
    }
}
