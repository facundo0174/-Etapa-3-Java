/*nivel 3 ejercicio 4
 * Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con 
punto decimal en un arreglo. Luego, el programa debe ordenar los números de 
forma ascendente y mostrarlos en pantalla.
 */
import java.util.Scanner;
public class OrdenarAscendente {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a guardar.");
        int cant=read.nextInt();
        read.nextLine();
        double[] numeros=new double[cant];
        int posicion;
        for(int i=0;i<cant;i++){
            System.out.println("ingrese el real de posicion "+(i+1));
            numeros[i]=read.nextDouble();
            read.nextLine();
        }
        System.out.println("el arreglo ingresado es el sigueiente:");
        System.out.print("|");
        for(int i=0;i<cant;i++){
            System.out.print(numeros[i]+"|");
        }
        System.out.println("------------------------------------------------------");
        double min;
        for(int i=0;i<(cant-1);i++){
            min=numeros[i];
            posicion=i;
            for(int j=(i+1);j<(cant);j++){
                if(min>numeros[j]){
                    min=numeros[j];
                    posicion=j;
                }
            }
            if (posicion!=i){
                numeros[posicion]=numeros[i];
                numeros[i]=min;
            }
        }
        System.out.println("luego del ordenamiento quedo de la siguiente manera.");
        System.out.print("|");
        for (int i=0;i<cant;i++){
            System.out.print(numeros[i]+"|");
        }
        read.close();
    }
}
