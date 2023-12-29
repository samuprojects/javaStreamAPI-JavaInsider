package intermediate;

public class AppPeek {
    public static void main(String[] args) {

        // Requisito: informar a média de todas as notas de todos os alunos

        var avg = Student.list().stream().flatMap(s -> s.grades().stream()).mapToDouble(d -> d).average().orElse(0);
        System.out.println(avg);
        System.out.println();

        // se quiser analisar como a stream se comporta no meio do caminho podemos utilizar o peek (que também é uma operação intermediária) e facilita o debug.

        var avg1 = Student.list().stream().peek(s -> System.out.println("Initial stream: " + s)).flatMap(s -> s.grades().stream()).peek(s -> System.out.println("After flatMap: " + s)).mapToDouble(d -> d).peek(s -> System.out.println("After mapToDouble: " + s)).average().orElse(0);
        System.out.println(avg1);

    }
}
