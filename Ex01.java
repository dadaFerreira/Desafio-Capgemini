
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flafNumeroValido = false;

        do{
            System.out.println("Entre com o número de linhas:");
            int numeroLinhas = scan.nextInt();

            if(numeroLinhas <= 0){
                System.out.println("Número inválido, digite um número maior que 0.");
            }else {
                System.out.println(montaArvore(numeroLinhas));
                flafNumeroValido = true;
            }

        }while (flafNumeroValido == false);
    }

    public static String montaArvore(Integer numeroLinhas){

        String espaco = " ";
        String caractere = "*";
        String arvore = "";

        for (int i = 1; i <= numeroLinhas; i++) {
            arvore += espaco.repeat(numeroLinhas -i);
            arvore += caractere.repeat(i);
            arvore +=("\n");
        }

        return arvore;
    }


}
