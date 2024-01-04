package terminal;

import terminal.OrderSystem.Order;

import java.util.Comparator;

import static java.util.stream.Collectors.*;
import static terminal.OrderSystem.Category.TOY;

@SuppressWarnings("ALL")
public class ExOrders {
    public static void main(String[] args) {
        queryA();
        queryB();
        queryC();
        queryD();
        queryE();
    }

    private static void queryA(){
        System.out.println("Pedidos por cliente");
        // se quiser com detalhamento basta remover o counting do Collector que foi importato estaticamente para economizar código
        OrderSystem.allOrders().stream().collect(groupingBy(o -> o.customer().name(), counting())).forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static void queryB(){
        System.out.println("Custos por pedido");

        // foi criado um método no record de Order para somar os preços dos produtos e facilitar o custo por pedido aqui
        OrderSystem.allOrders().stream().collect(groupingBy(Order::id, summingDouble(Order::price))).forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static void queryC(){
        System.out.println("Nomes dos clientes que compraram brinquedos");

        // anyMatch filtra quem é da categoria TOY trazendo quem for veiradeiro para a condição e depois mapeamos os clientes. Usado distintc para eliminar duplicidades
        OrderSystem.allOrders().stream().filter(o -> o.products().stream().anyMatch(p -> p.category() == TOY)).map(o -> o.customer().name()).distinct().forEach(System.out::println);
    }

    private static void queryD(){
        System.out.println("IDs de pedidos com preço acima de 500 ordenados por data");

        // filtramos os preços maiores com filter e o sorted para ordenar por data com map no final para mapear por ID
        OrderSystem.allOrders().stream().filter(o -> o.price() > 500).sorted(Comparator.comparing(Order::orderDate)).mapToLong(Order::id).forEach(System.out::println);
    }

    private static void queryE(){
        System.out.println("Preço total pago por cliente em todos os pedidos");

        // após organizar por cliente com o groupingBy importado estaticamente para reduzir o código, seguir somando os preços dos produtos de cada um com summingDouble
        OrderSystem.allOrders().stream().collect(groupingBy(o -> o.customer().name(), summingDouble(Order::price))).forEach((k, v) -> System.out.println( k + " => " + v));
    }
}
