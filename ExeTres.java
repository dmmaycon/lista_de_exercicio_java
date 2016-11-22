/**

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Maycon de Moraes

* Data: 22/11/2016

* Descrição:  Desenvolva a codificação em linguagem Java dos programas de computador com uso de estruturas de iteração:
a) Calcule o valor de 𝜋 com uma precisão de 0,0000000001 utilizando a série abaixo:
Mostre o valor calculado e a quantidade de iterações necessárias.
*/
import java.math.BigDecimal;
import java.math.RoundingMode;
public class ExeTres
{

public static void main(String[] args)
  {
    Double piAnterior = 0.0;
    Double precisao = 0.0;
    Double precisaoFinal = 0.0;
    Double pi = 4.0;
    Double denominador = 4.0;
    Double divisor = 3.0;
    Double resultadoInteracao = 0.0;
    Double anterior = 4.0;
    int controle = 0;


  //logica
  while(precisaoFinal != 0.00000000000001)
    {
      resultadoInteracao = denominador / divisor;
      if(controle % 2 == 0){
            piAnterior = pi;
            pi -= resultadoInteracao;
            }else{
                pi += resultadoInteracao;
        }
      divisor += 2.0;
      controle++;
      precisao = (piAnterior - pi);
      BigDecimal bigPrecisao = new BigDecimal(precisao).setScale(15, RoundingMode.HALF_EVEN);
      precisaoFinal = bigPrecisao.doubleValue();

  }
  System.out.println("-------------------------------------------------------------");
  System.out.println("--- Valor de pi com precisao de 15 casas decimais. ----------");
  System.out.println("--- O valor de pi  --> " + pi + "         --------");
  System.out.println("--- Numero de interacoes --> " + controle + "         -----");
  System.out.println("-------------------------------------------------------------");
}
}
