package terminal;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class ExCountLetters {

    public static void main(String[] args) {

        System.out.println(count("JavA"));
        System.out.println(count("Object oriented"));
        System.out.println(count("package"));
        System.out.println(count("override"));
    }

    private static Map<Character, Long> count(String str) {

        return Optional
                .ofNullable(str) // encapsulando o parâmetro no Optional para não ter problemas com os nulos
                .map(String::toUpperCase) // normalizando a String para o padrão maiúsculo utilizando um map com method reference
                .stream() // abre a stream para começar o processo de contagem na sequencia
                .flatMapToInt(String::chars) // transformando uma Stream de Intstreams numa IntStream usando method reference
                .mapToObj(i -> (char) i) // para retornar a Stream de Objeto onde cada fazemos um casting explícito para o char correspondente e trazendo um Stream de Character
                .filter(c -> !Character.isWhitespace(c)) // removendo os espaços em branco da stream
                .collect( //  para fazer o agrupamento
                        Collectors.groupingBy(
                                Function.identity(), // mapeando pelos caracteres associados A = A, A (no exemplo do Java, etc)
                                Collectors.counting() // trazer a contagem das associações acima (A = 2, no exemplo do Java, etc)
                        )
                );
    }
}