/*nivel 1 ejercicio 6
 * A mi me gustan los apres: Escribe un programa que imprima solo los N números 
pares, donde los N números son guardados en variables o constantes según 
corresponda. 
 */
import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int cotaPares=0;
        System.out.println("ingrese la cantidad de numeros pares que desea saber.");
        cotaPares=read.nextInt();
        int [] numerosPares= new int[cotaPares];
        if (cotaPares!=0){
            for (int i=0; i<cotaPares;i++){
                if(i==0){
                    numerosPares[i]=i;
                }else{
                    numerosPares[i]=numerosPares[i-1]+2;
                } 
            }
            System.out.println("los siguientes "+cotaPares+" numeros son pares:");
            for(int i=0;i<numerosPares.length;i++){
                System.out.println(numerosPares[i]);
            }
        }else{
            System.out.println("error ingrese numeros distintos de 0");
        }
        read.close();
    }
}
