package intermediate;

import java.util.Collection;

public class AppFlatMap {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        // Requisito: obter a lista de todas as notas de todos os estudantes

        //Student.list().stream().map(s -> s.grades() // pode usar method reference
        //var grades = Student.list().stream().map(Student::grades).toList();

        // PROBLEMA, nesse cenário teremos "uma lista de uma lista" de Double
        // isso ocorre porque na stream já possui várias listas de notas e no final está colocando em mais uma
        // mais de um nível de lista não é necessário e nesse contexto o map não ajuda em nada.

        // A solução é mapear utilizando o flatMap, que também recebe um Function, porém o retorno deve ser uma stream. Ele junta essa Stream de saída do flatMap
        // Com a stream atual que estamos trabalhando fazendo com que as informações percam um nível na hierarquia.
        //var grades = Student.list().stream().map(Student::grades).flatMap(l -> l.stream()).toList(); // pode usar method reference se quiser, stream é um método de Collection
        var grades = Student.list().stream().map(Student::grades).flatMap(Collection::stream).toList(); // dessa forma teremos apenas uma lista de Double
        System.out.println(grades);
    }
}
