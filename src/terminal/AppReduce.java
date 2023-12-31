package terminal;

@SuppressWarnings("ALL")
public class AppReduce {
    public static void main(String[] args) {
        // Operação terminal Reduce

        // Objetivo: somar todos os preços dos produtos

        double sum = Item.list().stream().mapToDouble(Item::price).sum(); // uma opção
        System.out.println(sum);

        /* Outra forma com reduce
        * Como a stream é de elementos do tipo Item utilizamos o map para mapear de Item para price e assim obtemos uma stream de elementos double
        * Podemos chamar o reduce que faz pegar todos os elementos que estão dentro da stream combinando-os de alguma forma para obter um resultado.
        * Uma operação de redução como a soma, por exemplo, funciona acumulando os valores, primeiro elemento, soma com o segundo que gera um resultado.
        * Na próxima iteração esse resultado é somado com o terceiro elemento, e assim a cada iteração vai acumulando e reduzindo um elemento da stream
        * No final haverá apenas um elemento dentro da stream com o resultado que é a resposta da redução.
        *
        * Para redução a primeira coisa que precisamos é de um identity (que é o valor pela qual a redução vai começar), caso a stream esteja vazia a identity ser´a retornada
        * A identity é o valor default caso a stream esteja vazia
        *
        * O segundo parâmetro é um accumulator, que é um BinaryOperator (recebe dois parâmetros Double e retorna um parâmetro Double)
        * O BinaryOperator é uma interface funcional que estende BiFunction (onde todos os parâmetros são iguais, e possui o método apply que recebe dois valores de um tipo e retorna outro valor do mesmo tipo)
        * Dentro do accumulator o primeiro parâmetro da expressão é o valor acumulado e o segundo o valor corrente.
        * Para cada item qua a operação de redução é chamado o BinaryOperator é invocado passando sempre o valor que já está acumulado e o valor atual.
        * O reduce vai retornar um tipo T que é o tipo do que está dentro da stream (nesse caso double)
        * */

        //double sum1 = Item.list().stream().map(Item::price).reduce(0.0, (accum, v) -> accum + v); // como Double possue um método sum que já faz isso poderíamos fazer
        //double sum1 = Item.list().stream().map(Item::price).reduce(0.0, (accum, v) -> Double.sum(accum, v)); // podemos usar direto o method reference como a seguir

        double sum1 = Item.list().stream().map(Item::price).reduce(0.0, Double::sum);
        System.out.println(sum1);
    }
}
