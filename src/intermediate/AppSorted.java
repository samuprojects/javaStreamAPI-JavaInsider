package intermediate;

public class AppSorted {

    public static void main(String[] args) {

        // Requisito: ordenar os nomes dos alunos alfabeticamente
        var names = Student.list().stream().map(Student::name).sorted().toList();
        System.out.println(names);

        // O sorted sem parâmetros assume que a ordenação será natural A, B, C... 1,2,3...
        // se quiser outro tipo de ordenação podemos passar um Comparator no sorted utilizando um lambda com dois parâmetros e retornando um inteiro para indicar se os objetos são iguais e quem vem antes ou depois
        // geralmente o mais usado é usar os Comparators disponíveis que já criam expressões lambda (por exemplo, reverseOrder para inverter a ordem natural), enfim, usar Comparators pode deixar tudo mais flexível
    }
}
