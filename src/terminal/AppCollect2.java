package terminal;

import java.util.stream.Collectors;

public class AppCollect2 {
    public static void main(String[] args) {
        // podemos usar o joining para concatenar String como uma redução, porém com mais opções de controle

        var names = Item
                .list()
                .stream()
                .map(Item::name)
                .collect(Collectors.joining()); // versão crua sem delimitador
        System.out.println(names);

        var names1 = Item
                .list()
                .stream()
                .map(Item::name)
                .collect(Collectors.joining("|")); // versão com delimitador (o join já possui a lógica de separar entre os elementos, sem mostrar no início e fim)
        System.out.println(names1);

        // é possível ainda adicionar prefixos ou sufixos
        var names2 = Item
                .list()
                .stream()
                .map(Item::name)
                .collect(Collectors.joining("|", "==> ", " <=="));
        System.out.println(names2);


    }
}
