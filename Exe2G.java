/* 2 - G
Ler um valor inteiro e verifique se o valor está entre 1 e 9 (inclusive). O programa deve indicar
com a mensagem “O valor esta na faixa permitida” caso esteja dentro da faixa e indicar com a
mensagem “O valor está fora da faixa permitida” caso esteja fora da faixa
*/

import java.util.Scanner;

public class Exe2G
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner s = new Scanner(System.in);

    //entrada de dados
    System.out.println("Digite um numero inteiro: ");
    int num = s.nextInt();

    //executa a logica
    if((num >= 1) && (num <= 9)){
      System.out.println("O valor esta na faixa permitida");
    }else{
      System.out.println("O valor esta fora da faixa permitida");
    }
  }
}
