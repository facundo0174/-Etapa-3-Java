/*nivel 2 ejercicio 4
 * Suma del rango de números : Escribir un programa que encuentre la suma de los 
números impares en un rango de números enteros guardados en una variable. 
 */
import java.util.Scanner;
public class sumaRangoImparidad {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese una cota inferior.");
        int cotaInf=read.nextInt();
        System.out.println("ingrese la cota superior.");
        int cotaSup=read.nextInt();
        read.close();
        int i=cotaInf;
        int sumaImpares=0;
        while (i<=cotaSup){
            if((i%2)!=0){
                sumaImpares+=i;
            }
            i++;
        }
        System.out.println("la suma de todos los numeros impares entre "+cotaInf+" y "+cotaSup+" es igual a: "+sumaImpares);
    }
}
