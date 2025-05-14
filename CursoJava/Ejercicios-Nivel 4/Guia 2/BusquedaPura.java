/*nivel 4 ejercicio 2
 *  Eliminación de un elemento: Dado un arreglo con valores enteros, realice la 
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por pantalla.  */
import java.util.Scanner;
public class BusquedaPura {
    public static void main(String[] args) {
        Integer[] arreglo1={1,4,66,3,7,8,4};
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese el entero a buscar");
        int numMagico=read.nextInt();
        read.nextLine();read.close();
        System.out.println("el arreglo es el siguiente:");
        System.out.println("|");
        for(int i=0;i<arreglo1.length;i++){
            System.out.print(arreglo1[i]+"|");
        }
        System.out.println("");
        boolean encontrado=false;
        for (int i=0;i<arreglo1.length;i++){
            if(arreglo1[i]==numMagico){
                arreglo1[i]=null;
                encontrado=true;
            }
        }
        if (encontrado){
            System.out.println("el numero "+numMagico+" fue encontrado en el arreglo y fue eliminado exitosamente");
            System.out.println("el arreglo resultante es el siguiente:");
            System.out.print("|");
            for (int i=0;i<arreglo1.length;i++){
                System.out.print(arreglo1[i]+"|");
            }
        }else{
            System.out.println("no se encontro el numero "+numMagico+" en el arreglo");
        }
    }
}
