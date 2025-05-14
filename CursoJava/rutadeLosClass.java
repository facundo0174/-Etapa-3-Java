public class rutadeLosClass {
    public static void main (String[] args){
        System.out.println("Ruta de salida de los .class: " + System.getProperty("user.dir"));
    }
}
/*para realizar la aparicion de los .class y compilar realmente se debe realizar el comando.
 * javac archivo.java
 * desde la carpeta que lo contiene, si tienes package y una ruta QUE NO EMPIECE CON JAVA.MICARPETA, entonces
 * el .class sera creado en esa ruta especificada, el package es mayormente de salida "ordenada", el import de entrada
 */