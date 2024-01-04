package terminal;

@SuppressWarnings("ALL")
public class ExOrders {

    /*
    * Considerar os records:
    * Product(String name, Category category, double price)
    * Order(Long id, Customer customer, List<Product> products, LocalDate orderDate)
    * public record Customer (String name)
    *
    * enum Category
    * TOY, ELECTRONIC, STATIONARY
    *
    * Retornar usando Stream API: Os pedidos de cada cliente, Custo total de cada pedido,
    * Nomes dos clientes que compraram brinquedos, IDs de pedidos com preço acima de 500 ordenados por data,
    * Preço total pago por cliente em todos os seus pedidos.
    *
    * Criar conjuntos de Product e Order para testar as queries
    * */

    public static void main(String[] args) {
        queryA();
        queryB();
        queryC();
        queryD();
        queryE();
    }

    private static void queryA(){
        System.out.println("Pedidos por cliente");
    }

    private static void queryB(){
        System.out.println("Custos por pedido");
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
