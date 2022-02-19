import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastre sua senha:");
        String senha = scan.next();

        System.out.println("Senha válida? " + senhaValida(senha));
        System.out.println(numeroMinimo(senha));

    }

    public static boolean senhaValida(String senha) {

        String regex = "(?=.*[)(!$@^#&%+\\-*\\-+])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}";
        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);
        return m.matches();
    }

    public static int numeroMinimo(String senha){

        int tamanho  = senha.length();
        return 6 - tamanho;
    }

}
