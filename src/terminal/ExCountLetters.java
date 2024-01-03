package terminal;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("ALL")
public class ExCountLetters {

    public static void main(String[] args) {

        System.out.println(count("JavA"));
//        System.out.println(count("Object oriented"));
//        System.out.println(count("package"));
//        System.out.println(count("override"));
    }

    private static Map<Character, Long> count(String str){

        var r = Optional
                .ofNullable(str)
                .map(String::toUpperCase)
                .stream()
                .flatMapToInt(String::chars)
                .toArray();

        System.out.println(Arrays.toString(r));

        return null;
    }
}