
/*nivel 2 ejercicio 7
 * Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos, 
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este 
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje 
diciendole a ese amigo porque no lo muestra por pantalla.
 */

import java.util.*;
public class AmigosYEdades {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese la cantidad de amigos.");
        int cantAmigos=read.nextInt();
        read.nextLine();
        String nombre;
        int edad;
        Amigo [] arregloAmigo=new Amigo[cantAmigos];
        
        for (int i=0;i<cantAmigos;i++){
            System.out.println("ingrese el nombre de su amigo: ");
            nombre=read.nextLine();
            System.out.println("ingrese la edad de su amigo: ");
            edad=read.nextInt();
            read.nextLine();
            arregloAmigo[i]=new Amigo(nombre, edad);
        }
        for (int i=0;i<cantAmigos;i++){
            if (arregloAmigo[i].edad>18){
                arregloAmigo[i].mostrarAmigo();
            }else{
                System.out.println("imposible mostrar, es menor de edad.");
            }
        }
        read.close();
    }   
}
class Amigo{
    String nombre;
    int edad;
    public Amigo(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void mostrarAmigo(){
        System.out.println("nombre: "+this.nombre+" edad "+this.edad);
    }

}


