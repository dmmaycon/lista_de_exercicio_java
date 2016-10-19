/*
1 - F
Calcular o volume do galao, raio e area sao entradas do programa.
*/
import java.util.Scanner;

public class Exe1F
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
  //incializa o scanner
  Scanner le = new Scanner(System.in);

System.out.println("Digite a area do galao: ");
Float area = le.nextFloat();
System.out.println("Digite a medida do raio: ");
Float raio = le.nextFloat();

Double volume = (area*(raio * raio)) * 3.1415;

System.out.println("Volume --> " + volume);
}
}
