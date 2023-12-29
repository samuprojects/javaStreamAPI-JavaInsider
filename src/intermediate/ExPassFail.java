package intermediate;

import java.util.List;

public class ExPassFail {

    // Requisito: implementar um código para retornar e imprimir da tela o nome do aluno com PASS ou FAIL, se o aluno passou ou não, respectivamente.
    // Considerar o uso do record para representar o aluno e suas notas (record Student(String name, List<Double> grades))
    // o critério para passar de ano é ter uma média 7,0 ou maior entre as provas realizadas

    public static void main(String[] args) {

        var students = List.of(
                new Student("José", List.of(8.5, 10.0, 9.0)),
                new Student("Pedro", List.of(7.0, 7.0, 7.0)),
                new Student("Maria", List.of(6.5, 9.0, 4.0)),
                new Student("Sara", List.of(6.5, 7.0, 7.5)),
                new Student("Rodrigo", List.of(4.5, 3.0, 6.5))
        );

        var result = students
                .stream()
                .map(s -> {
                    double avg = s.grades.stream().mapToDouble(g -> g).average().orElse(0);
                    boolean pass = avg >= 7.0;
                    return s.name + " - " + (pass ? "PASS" : "FAIL");
                })
                .toList(); // poderia ser um forEach se quiser

        System.out.println(result);

    }

    private record Student(String name, List<Double> grades) {}

}
