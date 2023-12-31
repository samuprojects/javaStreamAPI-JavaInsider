package terminal;

public class AppFind {
    public static void main(String[] args) {

        // Objetivo: recuperar o primeiro elemento da stream

        // podemos usar a operação terminal findFirst, muito utilizada quando há uma stream de apenas 1 elemento e deseja extrair ele para encerrar a stream
        // usamos o filter para colocar uma condição e desse resultado usamos o findFirst para pegar o primeiro elemento disponível resultado do filter
        // o findFirst retorna um Optional (pois pode ocorrer da stream estar vazia) que nos permite encadear com um orElse passando null

        Item item = Item.list().stream().filter(i -> i.price() >= 5.0).findFirst().orElse(null);
        System.out.println(item);

    }
}
