/*nivel 3 ejercicio 5
 * Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales, 
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si 
la resta da negativo entonces guarde 0. 
 */
public class RestalosProhibido0{
    public static void main(String[] args) {
        double[] arreglo1={1.45,52.21,6.125,9.268,4.69,0.35};
        double[] arreglo2={5.38,6.84,3.47,8.346,1.56,3.6};
        double[] result=new double[6];
        mostrarArreglo(arreglo1,arreglo2);
        restar(arreglo1, arreglo2, result);
    }
    public static void mostrarArreglo(double[] arreglo1,double[] arreglo2){
        System.out.println("el arreglo 1 es igual a:");
        System.out.print("|");
        for(int i=0;i<6;i++){
            System.out.print(arreglo1[i]+"|");
        }
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("el arreglo 2 es igual a:");
        System.out.print("|");
        for(int i=0;i<6;i++){
            System.out.print(arreglo2[i]+"|");
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }
    public static void restar(double[] arreglo1,double[] arreglo2, double[] result){
        System.out.println("el arreglo resultante es el siguiente:");
        System.out.print("|");
        for(int i=0;i<6;i++){
            if ((arreglo1[i]-arreglo2[i])>=0){
                result[i]=arreglo1[i]-arreglo2[i];
            }else{
                result[i]=0;
            }
            System.out.print(result[i]+"|");
        }
    }
}