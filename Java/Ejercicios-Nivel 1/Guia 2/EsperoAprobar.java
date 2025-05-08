/*nivel 1 ejercicio 7
 * Espero aprobar : Escribe un programa que imprima un título para el programa, 
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes, 
donde los N números son guardados en variables o constantes según corresponda. 
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con 
cuanto 
 */
import java.util.Scanner;
public class EsperoAprobar {
    public static void main(String[] Args){
        Scanner read = new Scanner(System.in);
        int CANTIDA_DE_PARCIALES=3;
        double [] notas ={6.43,7.84,3.65};
        double promedio = 0;
        System.out.println("||ESPERO APROBAR||");
        for (int i=0;i<CANTIDA_DE_PARCIALES;i++){
            promedio+=notas[i]/CANTIDA_DE_PARCIALES;
        }
        String frase = (promedio>=6)?"FELICIDADES APROBASTE":"SUERTE LA PROXIMA";
        System.out.print("|examen 1: "+notas[0]+"|examen 2: "+notas[1]+"|examen 3: "+notas[2]+"|"+frase+"|Nota final: "+promedio);
        read.close();
    }
}
