/* -Exercio 02 -
Ler uma temperatura em graus Celsius e exibi-la convertida em graus Fahrenheit. A fórmula de
conversão a ser utilizada é F = ( 9 * C + 160 ) / 5, em que a variável F representa a temperatura
em graus Fahrenheit e a variável C a temperatura em graus Celsius. */



public class Exe1B
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//recebe a temperatura em Celsius
Float tc = Float.parseFloat(args[0]);

System.out.println("A temperatura em Fahrenheit " + ((9.0 * tc) + 160.0));
}
}
