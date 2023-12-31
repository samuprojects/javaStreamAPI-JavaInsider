package terminal;

@SuppressWarnings("ALL")
public class AppCountMinMax {
    public static void main(String[] args) {

        // Objetivo 1: contar elementos da stream

        long count = Item.list().stream().count(); // o count retorna um long com a quantidade de itens que faz parte da stream
        System.out.println("Count: " + count);

        // Objetivo 2: identificar os números mínimo e máximo

        /*
         * Para realizar essa operação precisa utilizar stream que trabalham com números e não com stream de objetos
         * Para isso podemos chamar um mapToDouble passando o preço(i → i.price()) (optado por usar method reference) e depois o max para obter o maior valor
         * O max retorna um OptionalDouble (pois pode ocorrer da stream não ter dados) que nos permite encadear com um orElseThrow para lançar exceção caso não encontre o desejado
         * O mesmo vale para o min
         * */

        double max = Item.list().stream().mapToDouble(Item::price).max().orElseThrow();
        System.out.println("Max: " + max);

        double min = Item.list().stream().mapToDouble(Item::price).min().orElseThrow();
        System.out.println("Min: " + min);


        // Objetivo 3: obter o preço médio
        double avg = Item.list().stream().mapToDouble(Item::price).average().orElseThrow();
        System.out.println("Avg: " + avg);

    }
}