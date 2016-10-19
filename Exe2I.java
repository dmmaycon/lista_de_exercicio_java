/* 2 - I -Ler um valor inteiro qualquer e apresentar mensagem informando se o valor é par ou ímpar. */

import java.util.Scanner;

public class Exe2I
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner s = new Scanner(System.in);

    //declara as variaveis
    int num;

    //entrada de dados
    System.out.println("Digite um numero inteiro: ");
    num = s.nextInt();

    //logica do programa
    if(num % 2 != 0){
      System.out.print("Tipo do numero " + num + " IMPAR!\n");
    }else{
      System.out.print("Tipo do numero " + num + " PAR!\n");
    }
  }
}
