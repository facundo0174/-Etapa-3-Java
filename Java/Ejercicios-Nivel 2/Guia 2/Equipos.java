/*nivel 2 ejercicio 10
 * 10. Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol, 
luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre 
de los jugadores en distintas variables. Luego muestre un encabezado con el 
nombre de cada equipo y por cada equipo muestre los nombres de los jugadores. 
 */
import java.util.Scanner;
public class Equipos {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String equipo1="barcelona";
        String entrenador1="menganito";
        String equipo2="portugal";
        String entrenador2="fulanito";
        String[][] jugadores=new String[11][2];
        for(int equipo=0;equipo<jugadores[0].length;equipo++){
            System.out.println("----------------------------------------------------------");
            if(equipo==0){
                System.out.println("ingrese de manera seguida los jugadores del equipo "+equipo1);
            }else{
                System.out.println("ingrese de manera seguida los jugadores del equipo "+equipo2);
            }            
            System.out.println("----------------------------------------------------------");
            for (int jugador=0;jugador<jugadores.length;jugador++){
                System.out.println("ingrese el nombre del jugador n° "+(jugador+1));
                jugadores[jugador][equipo]=read.nextLine();
            }
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("se muestra a continuacion los equipos, sus entrenadores y sus jugadores.");
        System.out.println("\n");

        for (int equipo=0;equipo<jugadores[0].length;equipo++){
            if(equipo==0){
                System.out.println("Nombre del equipo: "+equipo1+" | Entrenador: "+ entrenador1);
            }else{
                System.out.println("Nombre del equipo: "+equipo2+" | Entrenador: "+ entrenador2);
            }
            System.out.println("------------------jugadores------------------");
            for(int jugador=0;jugador<jugadores.length;jugador++){
                System.out.println("***Jugador N° "+(jugador+1)+" | Nombre: "+jugadores[jugador][equipo]+" ***");
            }
        }
        read.close();
    }
}
