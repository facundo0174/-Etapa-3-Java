/*nivel 3 ejercicio 1
 * Dame los mayores y los menores : Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre 
por pantalla que no lo encontró.
 */
public class MinYMax {
    public static void main(String[] args){
        int[] arreglo={0,4,5,8,4,2,1,8,65,3,12,65,-12,12421,436,5,23,-12,3,-123};
        Integer max=Integer.MIN_VALUE;
        Integer min=Integer.MAX_VALUE;
        System.out.println("el arreglo de entrada es el siguiente.");
        for(int i=0;i<arreglo.length;i++){
            System.out.print("|"+arreglo[i]+"|");
            if(arreglo[i]>max){
                max=arreglo[i];
            }
            if(arreglo[i]<min){
                min=arreglo[i];
            }
        }
        System.out.println("\n");
        if(max==0 && min==0){
            System.out.println("el arreglo esta inicializado, no existe valor minimo o maximo.");
        }else{
            System.out.println("el valor maximo del arreglo anterior es "+max+" y el minimo es "+min);
        }
        
    }
}
