/* 2 - C
Ler quatro valores reais referentes a quatro notas escolares de um aluno e apresentar uma
mensagem informando se o aluno foi aprovado ou reprovado. Para determinar a aprovação do
aluno considere a média escolar maior ou igual a 6. Apresentar junto com as mensagens o
valor da média do aluno*/

import java.util.Scanner;

public class Exe2C
{
  static public void main(String[] args)
  {
    //inicializa Scanner
    Scanner s = new Scanner(System.in);

    //declaracao de variaveis
    Float vet_nota[];
    float nota_total = 0;
    float media_nota;
    vet_nota = new Float[4];
    // Entradas de dados
    for(int x = 0; x < 4; x++){
      System.out.println("Digite a " + (x + 1) + " do aluno \n");
      vet_nota[x] = s.nextFloat();
    }
    //logica do programa
    for(int x = 0; x < 4; x++){
    nota_total = vet_nota[x] + nota_total;
    }
    media_nota = nota_total / 4;
      if(media_nota >= 6.0){
        System.out.print("O aluno foi aprovado com a media ---> " + media_nota);
      } else{
        System.out.print("O aluno foi reprovado com a media ---> " + media_nota);
      }
  }
}
