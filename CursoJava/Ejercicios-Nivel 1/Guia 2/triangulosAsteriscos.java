/*Nivel 1 ejercicio 1
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un 
triángulo de asteriscos en la consola. Usar bucles. 
 */
import java.util.Scanner;
public class triangulosAsteriscos {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int niveles;
        System.out.println("ingrese la cantidad de niveles del triangulo.");
        niveles=read.nextInt();
        if (niveles>0){
            mostrarTriangulo(niveles);
        }else{
            System.out.println("ERROR ingrese un valor mayor a 0.");
        }
        read.close();

    }
    public static void  mostrarTriangulo(int niveles){
        int mitad = obtenerCantidad(niveles);
        mitad=mitad/2;
        int der=0;
        int izq=0;
        for (int i=1; i<=niveles; i++){
            if (i==1){
                for(int j=1; j<=mitad;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                der=mitad + 1;
                izq=mitad-1;
            }else{
                for (int j=1; j<=izq; j++){
                    System.out.print(" ");
                }
                for (int j=izq; j<=der; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
                der++;
                izq--;
            }
        } 
    }
    
    public static int obtenerCantidad (int niveles){
        int cantidad=0;
        for (int i=1; i<=niveles; i++){
            if (niveles ==1){
                cantidad=1;
                break;
            }else{
                if (i==1){
                    cantidad=1;
                }else{
                    cantidad+=2;
                }
            }
        }
        return(cantidad);
    }
}
