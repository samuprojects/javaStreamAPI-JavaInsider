package basic;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("ALL")
public class App7 {

    public static void main(String[] args) {

        // Requisito: geração de números aleatórios em uma stream.
        Random random = new Random();

        // os métodos da classe Random: ints, doubles e longs retornam uma Stream com o tipo de dado correspondente para geração de uma sequência randômica.
        int[] array = random.ints(0, 10).limit(10).toArray(); // para limitar a faixa de intervalo do número randômico pode utilizar as sobrecargas existentes nesse método
        System.out.println(Arrays.toString(array));

        // se não quiser usar o limit para informar a quantidade de números a serem gerados podemos informar diretamente no ints
        int[] array1 = random.ints(10,0, 10).toArray(); // para limitar a faixa de intervalo do número randômico pode utilizar as sobrecargas existentes nesse método
        System.out.println(Arrays.toString(array1));

        // no doubles o mesmo conceito
        double[] array2 = random.doubles(10,0, 10).toArray(); // para limitar a faixa de intervalo do número randômico pode utilizar as sobrecargas existentes nesse método
        System.out.println(Arrays.toString(array2));

    }
}
