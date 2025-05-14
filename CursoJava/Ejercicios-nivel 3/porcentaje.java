/*Nivel 3 ejercicio 1
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el 
porcentaje que indique el segundo número del primer número.
 */
import java.util.Scanner;
public class porcentaje {
    public static void main (String[] args){
        Scanner read=new Scanner(System.in);
        double num1,porcentaje;
        int num2;
        System.out.println("ingrese el primer numero, puede ser real y utilice '.' para los decimales");
        num1=read.nextDouble();
        System.out.println("introdusca el siguiente numero entero, que reprecenta el porsentaje deseado a obtener");
        num2=read.nextInt();
        System.out.println("\n");
        porcentaje=(num1*num2)/100;
        System.out.println("El "+num2+"% del numero "+num1+" es igual a: "+porcentaje);
        read.close();
    }
}
