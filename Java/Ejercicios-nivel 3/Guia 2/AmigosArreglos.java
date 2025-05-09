/*nivel 3 ejercicio 3 * Mis amigos, su edad y el mayor
Guarda en un arreglo una N cantidad de amigos, itere sobre esa cantidad mostrando 
el nombre de cada amigo si y sólo si este amigo es mayor de edad, 
en caso de ser menor de edad imprima un mensaje diciendole a ese amigo porque no lo muestra por pantalla.
Pero a su vez, encuentre al amigo que mayor edad tenga, muestre un mensaje por
 pantalla del nombre de esa persona y su edad.  */
import java.util.Scanner;
public class AmigosArreglos {
    public static void main(String[] args) {
        int num=5;
        int edad;
        int posicion=0;
        int edadMayor=0;
        String nombre;
        Scanner read=new Scanner(System.in);
        Amigos[] arreAmigos=new Amigos[num];
        for(int i=0;i<num;i++){
            System.out.println("ingrese el nombre de su amigo.");
            nombre=read.nextLine();
            System.out.println("ingrese la edad de su amigo.");
            edad=read.nextInt();
            read.nextLine();
            arreAmigos[i]=new Amigos(nombre,edad);
            if(arreAmigos[i].edad >edadMayor){
                posicion=i;
                edadMayor=arreAmigos[i].edad;
            }
            arreAmigos[i].mostrarAmigo();
        }
        System.out.println("mi amigo con mayor edad es "+arreAmigos[posicion].nombre+" con "+
                            arreAmigos[posicion].edad+" anios de edad");
        read.close();
    }
}
class Amigos{
        String nombre;
        int edad;

        public Amigos(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
        }
        public void mostrarAmigo(){
            if(this.edad<18){
                System.out.println("lo siento "+this.nombre+" legalmente no puedo mostrate por pantalla");
                System.out.println("--------------------------------------------------------------");
            }else{
                System.out.println("mi amigo "+this.nombre+" es mayor de edad, con "+this.edad+" anios");
                System.out.println("--------------------------------------------------------------");
            }
        }
}
