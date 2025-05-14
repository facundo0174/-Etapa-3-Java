/*nivel 3 ejercicio 2  * Dame los mayores y los menores : Realizar un programa donde se guarden 5 en 
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo 
de los números ingresados.
 */
import java.util.Scanner;
public class MinMaxScanner {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int[] arreglo=new int[5];
        Integer min=Integer.MAX_VALUE;
        Integer max=Integer.MIN_VALUE;
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese un numero para la posicion "+(i+1));
            arreglo[i]=read.nextInt();
            read.nextLine();
            System.out.println("--");
            if (min>arreglo[i]){
                min=arreglo[i];
            }
            if(max<arreglo[i]){
                max=arreglo[i];
            }
        }
        read.close();
        System.out.println("El arreglo ingresado es el siguiente.");
        System.out.print("|");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+"|");
        }
        System.out.println("El valor minimo del mismo es "+min+" y el maximo es igual "+max);
    }
}
