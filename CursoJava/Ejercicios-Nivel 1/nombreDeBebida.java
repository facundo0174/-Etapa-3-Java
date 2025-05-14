//nivel 1 ejercicio 7
/*Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la 
información de: El nombre de su última mascota y nombre de la última película 
vista. Por último mostrarlo por pantalla con el siguiente formato: “Nombre de la 
próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}  */
import java.util.Scanner;
public class nombreDeBebida {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        String mascota,pelicula;
        System.out.println("ingrese el nombre de su ultima mascota: ");
        mascota=read.nextLine();
        System.out.println("ingrese el nombre de la ultima pelicula vista");
        pelicula=read.nextLine();
        System.out.println("el nombre de la bebida solicitada sera la siguiente: "+mascota+" "+pelicula);
        read.close();
    }
}
