/* -Exercio 01 -
Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem
e a velocidade média. Desta forma, será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de
litros de combustível utilizada na viagem com a fórmula LITROS_USADOS = DISTANCIA / 12. O
programa deve apresentar os valores da velocidade média, tempo gasto, distância percorrida e
quantidade de litros utilizada na viagem.*/



public class Exe1A
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
  // recebe os parametros por cmd
  float tempo1 = Float.parseFloat(args[0]); // recebe o tempo de viagem
  float mediaVelocidade = Float.parseFloat(args[1]); // recebe a velocidade media

  // executa os calculos necessarios
  float distaciaPercorrida = (mediaVelocidade * tempo1);
  float litroCombustivel = (distaciaPercorrida / 12);


  System.out.println("A velocidade media -> " + mediaVelocidade);
  System.out.println("O tempo gasto foi de  -> " + tempo1);
  System.out.println("A distancia percorrida foi de -> " + distaciaPercorrida);
  System.out.println("A quandidade de combustivel gasto no percuso foi de -> " + litroCombustivel );


}
}
