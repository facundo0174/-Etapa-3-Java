/*nivel 4 ejercicio 4 */
import java.util.Scanner;
public class TrasladarPosArreglo {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int[] arreglo={1,5,3,6,7,4,2,5,7,3};
        int pos,aux,n;
        System.out.println("ingrese la posicion del arreglo a mover, menor a "+arreglo.length);
        pos=read.nextInt();
        read.nextLine();
        System.out.println("el arreglo a analizar es:");
        System.out.print("|");
        for (int i=0;i<arreglo.length;i++){
                    System.out.print(arreglo[i]+"|");
        }
        System.out.println("");
        if (pos>=arreglo.length){
            System.out.println("la posicion a mover es invalida. ERROR TERMINANDO EJECUCION");
        }else{
            System.out.println("ingrese la cantidad de desplazamientos.");
            n=read.nextInt();
            read.nextLine();
            if((pos+n)>=arreglo.length){
                System.out.println("la cantidad de desplazamientos es invalida, el desplazamiento final es igual a "+(pos+n)
                +" el tamaño del arreglo es: "+arreglo.length);}else{
                aux=arreglo[pos];
                arreglo[pos]=arreglo[pos+n];
                arreglo[pos+n]=aux;
                System.out.println("la traslacion del elemento a sido exitosa");
                System.out.println("el arreglo final es:");
                System.out.print("|");
                for (int i=0;i<arreglo.length;i++){
                    System.out.print(arreglo[i]+"|");
                }
            }
        }
        read.close();
    }    
}
