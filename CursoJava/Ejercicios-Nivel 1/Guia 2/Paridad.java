/*nivel 1 ejercicio 3
 * Suma de números : Realizar un programa que guarde un número en memoria y 
determine si es par o impar. 
 */
import java.util.Scanner;
public class Paridad {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese el numero entero a comprobar paridad");
        int num = read.nextInt();
        if ((num%2)==0){
            System.out.println("el numero "+num+" es par");
        }else{
            System.out.println("el numero "+num+" es impar");
        }
        read.close();
    }
    
}
