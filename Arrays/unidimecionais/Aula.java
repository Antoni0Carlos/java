public class Aula {
    public static void main(String[] args) {
        // Vetores (arrays unidimecional)
        /*
         * [tipo] [nome] = new [tipo] {"tamanho"}
         */

        int idadesDasPessoas[] = new int[5];
        idadesDasPessoas[0] = 22;
        idadesDasPessoas[1] = 23;
        idadesDasPessoas[2] = 44;
        idadesDasPessoas[3] = 77;
        idadesDasPessoas[4] = 67;

        for (int i = 0; i < idadesDasPessoas.length; i++) {
            System.out.println("Valor da pessoa " + (i + 1) + " = " + idadesDasPessoas[i]);
        }
    }
}

/*
 * int idadePessoa1, idadePessoa2, idadePessoa3, idadePessoa4, idadePessoa5;
 * 
 * idadePessoa1 = 12; idadePessoa2 = 90; idadePessoa3 = 45; idadePessoa3 = 11;
 * idadePessoa5 = 22;
 */