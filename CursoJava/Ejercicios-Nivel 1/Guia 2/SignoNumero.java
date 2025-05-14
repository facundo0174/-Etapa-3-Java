/*nivel 1 ejercicio 4
 * De que se trata esto? : Realizar un programa que guarde un número en memoria y 
determine si es positivo, negativo o cero. 
 */
import java.util.Scanner;
public class SignoNumero {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese un numero entero para comprobar su signo o nulidad.");
        int num=read.nextInt();
        if (num==0){
            System.out.println("el valor ingresado es nulo.");
        }else if(num<0){
            System.out.println("el valor ingresado es negativo.");
        }else{
            System.out.println("el valor ingresado es positivo.");
        }
        read.close();
    }
}
