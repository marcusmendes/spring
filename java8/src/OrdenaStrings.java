import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("casa do codigo");
        palavras.add("caelum");

        // forma antiga para ordernar listas
        Comparator<String> comparator = new ComparadorPorTamanho();
        Collections.sort(palavras, comparator);

        System.out.println(palavras);

        // nova forma a partir do java 8
        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return -1;
                }

                if (s1.length() > s2.length()) {
                    return 1;
                }
                return 0;
            }
        });

        System.out.println(palavras);

        // lambda
        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            }

            if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        });

        System.out.println(palavras);

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

        palavras.sort(Comparator.comparing(s -> s.length()));

        System.out.println(palavras);

        // method reference
        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);

        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(palavras);

        // foreach
//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda
        palavras.forEach(s -> System.out.println(s));

        // method reference
        palavras.forEach(System.out::println);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }

        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}