package terminal;

import terminal.OrderSystem.Order;

import static java.util.stream.Collectors.*;

@SuppressWarnings("ALL")
public class ExOrders {
    public static void main(String[] args) {
        queryA();
        queryB();
//        queryC();
//        queryD();
//        queryE();
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
    }

    private static void queryD(){
        System.out.println("IDs de pedidos com preço acima de 500 ordenados por data");
    }

    private static void queryE(){
        System.out.println("Preço total pago por cliente em todos os pedidos");
    }
}
