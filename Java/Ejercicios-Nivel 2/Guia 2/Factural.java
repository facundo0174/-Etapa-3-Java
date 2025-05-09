/*nivel2 ejercicio 3
 * El factorial : Realizar un programa que calcule el factorial de un número 
 */
import java.util.Scanner;
public class Factural {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese el numero cual factorial desee.");
        int factorial=read.nextInt();
        int result=1;
        int i=factorial;
        while (i>0) {
            result*=i;
            i--;            
        }
        System.out.println("el factorial del numero "+factorial+" es igual a "+result);
        read.close();
    }
}
