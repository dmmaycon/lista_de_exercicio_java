/* -Exercio 03 -
Ler uma temperatura em graus Fahrenheit e apresenta-la convertida em graus Celsius. A
fórmula de conversão a ser utilizada é C = (( F – 32 ) * 5) / 9, em que a variável F representa a
temperatura em graus Fahrenheit e a variável C a temperatura em graus Celsius.
 */



public class Exe1C
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//recebe a temperatura em Fahrenheit
Float tf = Float.parseFloat(args[0]);

System.out.println("A temperatura em Fahrenheit " + ((tf - 32.0) * 5.0)/9.0);
}
}
