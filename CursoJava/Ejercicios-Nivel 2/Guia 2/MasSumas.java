/*nivel 2 ejercicio 6
 * Y mas… sumas! : Realizar un programa donde se guarde un número entero en una 
variable y que imprima por pantalla el resultado de la suma de todos los números 
enteros desde 1 hasta ese número. 
 */
import java.util.Scanner;
public class MasSumas {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese la cota de la suma.");
        int cota=read.nextInt();
        System.out.println("el resultado de la suma de 1 hasta : "+cota+" es igual a:");
        int result=0;
        for (int i=1;i<=cota;i++){
            result+=i;
        }
        System.out.println(result);
        read.close();
    }
}
