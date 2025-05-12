/*Nivel 4 ejercico 3
 * 3. Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea 
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.*/
public class UnionArreglos {
    public static void main(String[] args) {
        int[] arreglo1={1,3,6,33,5,98,4};
        String[] arreglo2={"michifuz","perejillo","pizza","vino","hamburguezo"};
        boolean[] arreglo3={true,false,false,true};
        int longTotal = arreglo1.length + arreglo2.length+ arreglo3.length;
        Object[] arregloResult = new Object[longTotal];
        for (int i=0;i<arreglo1.length;i++){
            arregloResult[i]=arreglo1[i];}
        for(int i=0;i<arreglo2.length;i++){
            arregloResult[i+arreglo1.length]=arreglo2[i];}
        for(int i=0;i<arreglo3.length;i++){
            arregloResult[i+arreglo2.length+arreglo1.length]=arreglo3[i];}
        System.out.println("los arreglos son:");
        System.out.print("1) |");
        for (int i=0;i<arreglo1.length;i++){
            System.out.print(arreglo1[i]+"|");}
        System.out.println("");
        System.out.print("2) |");
        for (int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]+"|");}
        System.out.println("");
        System.out.print("3) |");
        for (int i=0;i<arreglo3.length;i++){
            System.out.print(arreglo3[i]+"|");}
        System.out.println("");
        System.out.println("la suma de todos ellos da igual a:");
        System.out.print("Resultante: |");
        for (int i=0;i<arregloResult.length;i++){
            System.out.print(arregloResult[i]+"|");}
        System.out.println("");
    }
}
