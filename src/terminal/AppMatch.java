package terminal;

public class AppMatch {
    public static void main(String[] args) {

        // Objetivo: retornar verdadeiro se determinada condição for atendida

        /*
        * Match: as operações allMatch, anyMatch e noneMatch são operações finais que recebem um Predicate (uma condição para ser testada e retorna um boolean)
        * Diferente do filter em que recebe um Predicate e retorna outra stream indicando se o elemento pertence ou não a stream (além de ser uma operação intermediária)
        * allMatch testa se todos os elementos da stream respeitam a condição determinada
        * anyMatch testa se pelo menos 1 dos elementos respeita a condição determinada
        * noneMatch testa se nenhum deles respeita a condição determinada
        * */

        boolean r1 = Item.list().stream().map(Item::name).anyMatch(n -> n.startsWith("C")); // verifica se pelo menos 1 elemento da lista começa com "C"
        System.out.println(r1);

        boolean r2 = Item.list().stream().map(Item::name).allMatch(n -> n.startsWith("C")); // verifica se todos os elementos da lista começam com "C"
        System.out.println(r2);

        boolean r3 = Item.list().stream().map(Item::name).noneMatch(n -> n.startsWith("C")); // verifica se nenhum dos elementos da lista começam com "C"
        System.out.println(r3);
    }
}
