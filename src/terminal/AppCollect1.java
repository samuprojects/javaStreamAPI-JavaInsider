package terminal;

import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class AppCollect1 {
    public static void main(String[] args) {
        // a operação terminal de collect pode transformar os elementos em uma espécie de redução, ou numa lista, ou num conjunto, ou num Map, ou agrupamento, ou uma contagem, etc.

        // existem duas formas de chamar o collect
        // o agrupamento é feito pelo collect para executar alguma coisa, essa alguma coisa é realizada pelo Collector
        // a classe Collector possui uma série de métodos estáticos que criam collectors prontos para utilização
        // o mais famoso é o toList que retorna uma lista com os elementos

        var item1 = Item
                .list()
                .stream()
                .collect(Collectors.toList());
        System.out.println(item1);

        // poderia reduzir a opção acima apenas usando o toList de tão famoso que ficou o Collectors.toList
        var item11 = Item
                .list()
                .stream()
                .toList();
        System.out.println(item11);

        //se quiser uma lista imutável
        var item2 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(item2);

        // se quiser retornar um Conjunto
        var item3 = Item
                .list()
                .stream()
                .collect(Collectors.toSet());
        System.out.println(item3);

        // ou um Set imutável
        var item4 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(item4);

    }
}
