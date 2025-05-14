/*Nivel 1 ejercicio 2
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre 
esa cantidad mostrando el nombre de cada amigo.
*/
import java.util.Scanner;
public class NombreDeAmigos {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int cant;
        System.out.println("ingrese la cantidad de amigos.");
        cant=read.nextInt();
        read.nextLine();
        String[] amigos= new String[cant];
        for (int i=0;i<cant;i++){
            System.out.println("ingrese el nombre del amigo "+(i+1));
            amigos[i]=read.nextLine();
        }
        System.out.println("los amigos ingresados son:");
        for (int i=0;i<cant;i++){
            System.out.println(amigos[i]);
        }
        read.close();
    }
}
