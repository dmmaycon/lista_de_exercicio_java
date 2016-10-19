/*Ler um valor inteiro qualquer positivo ou negativo e apresentar o número lido como um valor
positivo.*/

import java.util.Scanner;

public class Exe2B
{
  static public void main (String[] args)
  {
    //inicializa o scanner
    Scanner s = new Scanner(System.in);

    //Entrada de digitados
    System.out.println("Digite um numero inteiro: ");
    int n1 = s.nextInt();
    int abs_n1 = Math.abs(n1);
    //Apresenta sempre o valor absoluto
    System.out.print("O valor absoluto de " + n1 + " ---> " + abs_n1);

  }
}
