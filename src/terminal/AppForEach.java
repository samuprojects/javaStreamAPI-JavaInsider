package terminal;

public class AppForEach {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        // Operações Terminais encerram o consumo de dados da Stream

        /*
        * O forEach recebe um Consumer como parâmetro e executa um código em cada um dos elementos da stream, além de não retornar nenhuma informação
        * O Consumer é uma interface funcional que recebe alguma coisa (nesse caso os elementos da lista de Item) e executamos alguma outra coisa.
        * Como o forEach não retorna nada ele serve simplesmente para executar algo que não depende de retorno em cada um dos elementos da stream
        * É muito utilizado para impressão na tela ou em situações específicas de chamada de algum método, ou execução de alguma coisa, em cada um dos elementos dessa stream.
        *
        * OBSERVAÇÃO: O forEach tem um atalho (diferente de outros métodos) que é não precisar do stream explicitamente conforme a seguir
        *
        * */

        Item.list().stream().forEach(System.out::println); // não precisa chamar stream explicitamente

        System.out.println();

        Item.list().forEach(System.out::println);
    }
}
