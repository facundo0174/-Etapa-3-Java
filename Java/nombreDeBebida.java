//nivel 1 ejercicio 7
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
