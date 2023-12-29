package intermediate;

public class AppDistinct {

    public static void main(String[] args) {

        // Requisito: remover elementos duplicados existentes na stream atual

        var grades = Student.list().stream().flatMap(s -> s.grades().stream()).distinct().toList();
        System.out.println(grades);

        // o distinct não recebe parâmetros, ele retorna uma nova stream eliminando tudo que é duplicado (internamente chama o equals dentro de cada objeto)
        // Importante: tomar cuidado ao chamar o distinct em uma classe criada por você, porque só funcionar adequadamente se nela estiver implementado o equals/hashcode
    }
}
