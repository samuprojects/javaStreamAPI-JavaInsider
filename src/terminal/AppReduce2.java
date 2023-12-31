package terminal;

@SuppressWarnings("ALL")
public class AppReduce2 {
    public static void main(String[] args) {

        // Semelhante ao exemplo anterior agora vamos reduzir as várias Strings dos nomes em uma String apenas

        var items = Item
                .list()
                .stream()
                .map(Item::name)
                .reduce("", (accum, s) -> accum + "," + s);
        System.out.println(items);

        // poderia fazer a redução sem o separador
        var items1 = Item
                .list()
                .stream()
                .map(Item::name)
                .reduce("", (accum, s) -> accum + s);
        System.out.println(items1);

        // ou utilizar o método concat passando os elementos da expressão lambda
        var items2 = Item
                .list()
                .stream()
                .map(Item::name)
                .reduce("", String::concat);
        System.out.println(items2);

    }
}
