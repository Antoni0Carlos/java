/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

public class Logica {
    public static void main(String[] agrs) /* throws IOException */ {

        /*
         * System.out.println("O meu nome é " + nome);
         * System.out.println("O minha idade é " + idade);
         * System.out.println("O meu peso é " + peso);
         */

        /*
         * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         * String nome = reader.readLine();
         * 
         * System.out.println("O nome digitado foi " + nome);
         * /
         */

        String nome = "Carlos";
        int idade = 21;
        double peso = 59.5;

        if (nome == "Carlos") {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}