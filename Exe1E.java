/* -Exercio 1 - E -
Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em Kelvin. Para
conversão deve-se primeiro converter em graus Celsius conforme exercício anterior, e depois
converter em Kelvin
 */



public class Exe1E
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//recebe a temperatura em Fahrenheit
Double tf = Double.parseDouble(args[0]);
// C = (( F – 32 ) * 5) / 9
Double tc = 0.0;
tc = ((tf - 32.0) * 5.0) / 9.0;
System.out.println("Fahrenheit: " + args[0] + " Kelvin: " + (tc + 273.15));
}
}
