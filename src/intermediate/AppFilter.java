package intermediate;

public class AppFilter {

    public static void main(String[] args) {

        // Requisito: retornar da lista de alunos apenas os que nasceram após o ano de 2005
        var students = Student.list().stream().filter(s -> s.yearOfBirth().getValue() >= 2005).toList();
        System.out.println(students);

        // Requisito: obter apenas as notas acima de 7
        var grades = Student.list().stream().flatMap(s -> s.grades().stream()).filter(g -> g >= 7.0).toList();
        System.out.println(grades);

        // o filter aplica uma condição onde se for verdadeira na próxima stream o elemento é mantido ou retirado se false.

    }
}
