import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.next();

        System.out.println(imprimeAnagrama(palavra));

    }

    public static int imprimeAnagrama(String palavra) {

        List<String> anagramas = new ArrayList<String>();
        List<String> anagramasValidos = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 1; j < palavra.length(); j++) {

                if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {

                    if (palavra.charAt(i) == palavra.charAt(i + 1)) {
                        String x = palavra.substring(i, i + 1);
                        anagramas.add(x);
                    } else {
                        String y = palavra.substring(i, j);
                        String z = palavra.substring(i + 1, j + 1);
                        String h = palavra.substring(i, i + 1);
                        anagramas.add(h);
                        anagramas.add(y);
                        anagramas.add(z);
                    }
                }
            }
        }

        for (String word : anagramas) {

            char[] vetorPalavra = word.toCharArray();
            Arrays.sort(vetorPalavra);
            String palavraOrdenada = String.copyValueOf(vetorPalavra);

            if (!anagramasValidos.contains(palavraOrdenada)) {
                anagramasValidos.add(palavraOrdenada);
            }

        }

        return anagramasValidos.size();
    }
}

