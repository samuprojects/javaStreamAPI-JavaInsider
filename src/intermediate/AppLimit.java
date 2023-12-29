package intermediate;

public class AppLimit {

    public static void main(String[] args) {

        // Requisito: ordenar e trazer apenas os dois primeiros alunos

        var names = Student.list().stream().map(Student::name).sorted().limit(2).toList(); // o limit vai cortar dentro do parâmetro passado
        System.out.println(names);
    }
}
