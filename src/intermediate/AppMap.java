package intermediate;

import java.time.Year;
import java.util.Arrays;

@SuppressWarnings("ALL")
public class AppMap {

    public static void main(String[] args) {

        // Operações intermediárias: MAP, permite transformar uma coisa em outra.
        // Um map recebe um Function (que é uma interface funcional que recebe como parâmetro um tipo parametrizado qualquer e retorna outro tipo) para mapeamento com apply

        // Requisito: mapear os objetos Students com os anos de nascimento dos Alunos
        var years = Student.list().stream().map(s -> s.yearOfBirth()).map(y -> y.getValue()).toList();

        // se quiser simplificar ainda mais as expressões lambda pode trocar por method reference
        var years1 = Student.list().stream().map(Student::yearOfBirth).map(Year::getValue).toList();

        // se estiver num cenário que necessite economizar recursos computacionais (evitando o autoboxing) pode utilizar a representação por Streams de tipos primitivos
        var years2 = Student.list().stream().map(Student::yearOfBirth).mapToInt(Year::getValue).toArray(); // lembrando que a API de coleções do Java não armazena tipos primitivos (somente via classes Wrappers), por isso o uso do Array

        System.out.println(years);
        System.out.println(years1);
        System.out.println(Arrays.toString(years2));

    }
}
