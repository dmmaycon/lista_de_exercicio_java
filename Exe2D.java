/* 2 - C
Ler três valores inteiros e apresenta-los em ordem crescente.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exe2D
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner s = new Scanner(System.in);

    //declaracao de variaveis
    int vet_num[];
    vet_num = new int[3];

    //entrada de dados
    for(int x = 0; x < 3; x++){
      System.out.print("Digite " + (x+1) + " numero. \n");
      vet_num[x] = s.nextInt();
    }
    //logica do programa
    Arrays.sort(vet_num);
    for(int x = 0; x < 3; x++){
      System.out.print("Numeros em ordem crescente: \n");
      System.out.print("--> " + vet_num[x] + "\n");
    }

  }
}
