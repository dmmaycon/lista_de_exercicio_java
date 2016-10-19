/*Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior valor em
relação ao menor valor*/

import java.util.Scanner;

public class Exe2A
{
  static public void main (String[] args)
  {
    //inicializa o scanner
    Scanner s = new Scanner(System.in);

    //Entrada de dados
    System.out.println("Digite um numero inteiro: ");
    int n1 = s.nextInt();
    System.out.println("Digite outro numero inteiro: ");
    int n2 = s.nextInt();

    //Logica
    if(n1 > n2){
      System.out.print("A diferenca entre " + n1 + " e " + n2 + " ---> " + (n1 - n2) + "\n");
    } else if (n2 > n1) {
      System.out.print("A diferenca entre " + n2 + " e " + n1 + " ---> " + (n2 - n1) + "\n");
    } else{
      System.out.println("Os numeros digitados sao iguais.");
    }
  }
}
