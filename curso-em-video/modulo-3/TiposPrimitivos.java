import java.util.Scanner;

public class TiposPrimitivos {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      System.out.print("digite o nome do aluno:  ");
      String nome = teclado.nextLine();
      System.out.print("digite a nota:  ");
      float nota = teclado.nextFloat();
      System.out.format("A nota é %s é %.1f  \n", nome, nota);
    }
  }
}
