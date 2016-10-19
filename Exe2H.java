/*2 - H Ler cinco valores inteiros e apresentar o maior e o menor valores informados*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exe2H
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner s = new Scanner(System.in);

    //inicializa as variaveis
    int vet_num[];
    vet_num = new int[5];
    int maior, menor;

    //entrada de dados
    for(int x = 0; x < 5; x++){
      System.out.print("Digite o " +(x+1)+ " numero: \n");
      vet_num[x] = s.nextInt();
    }

    //logica do programa
    Arrays.sort(vet_num);
    menor = vet_num[0];
    maior = vet_num[4];
    System.out.print("O menor numero digitado foi ---> " + menor + "\n");
    System.out.print("O maior numero digitado foi ---> " + maior + "\n");
  }
}
