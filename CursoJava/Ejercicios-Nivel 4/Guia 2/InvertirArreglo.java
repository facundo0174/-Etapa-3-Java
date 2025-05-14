public class InvertirArreglo {
    public static void main(String[] args) {
        int[] arreglo={1,6,3,4,7,45,3,5};
        int cant=arreglo.length;
        int aux;
        cant--;
        int i;
        System.out.println("el arreglo original es:");
        System.out.print("|");
        for(i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+"|");
        }
        System.out.println("");
        System.out.println("__________________________________");
        i=0;
        while(i<arreglo.length && i<cant){
            aux=arreglo[cant];
            arreglo[cant]=arreglo[i];
            arreglo[i]=aux;
            cant--;
            i++;
        }
        System.out.println("el arreglo invertido es:");
        System.out.print("|");
        for(i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+"|");
        }
    }
}
    

