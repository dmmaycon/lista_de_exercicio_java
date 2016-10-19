/* -Exercio 04 -
Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Kelvin. A fórmula
para conversão é K = C + 273.15, onde K é a temperatura em Kelvin e C é a temperatura em
graus Celsius.
 */



public class Exe1D
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//recebe a temperatura em Celsius
Float tc = Float.parseFloat(args[0]);

System.out.println("A temperatura em Fahrenheit " + (tc + 273.15));
}
}
