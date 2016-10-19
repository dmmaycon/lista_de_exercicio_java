/* 2 - E
Ler quatro valores interios e apresentar
somente aqueles que forem divisíveis por 2 e 3*/

import java.util.Scanner;

public class Exe2E
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner s = new Scanner(System.in);

    //inicializa as variaveis
    int aux;
    int vet_num[];
    vet_num = new int[4];

    //Entradas de dados
    for(int x = 0; x < 4; x++){
      System.out.print("Digite o " + (x+1) + " numero. \n");
      vet_num[x] = s.nextInt();
    }
    //logica do programa
    for(int x = 0; x < 4; x++){
      aux = vet_num[x];
      if((aux % 2 == 0) && (aux % 3 == 0)){
        System.out.print("O numero " + vet_num[x] + " pode ser divisivel por 2 e 3\n");
      }
    }

  }
}
