import java.util.Scanner;

public class ProgramaU4_2 {
    public static void main(String[] args) {
        double prom=0, suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de calificaciones: ");
        int tam = sc.nextInt();
        int[] c = new int[tam];

        for(int i=0; i<c.length; i++){
            System.out.println("Ingrese la calificacion "+i+": ");
            c[i]=sc.nextInt();

        }

        for(int i=0; i<c.length; i++){
            suma=suma+c[i];
        }
        prom=suma/c.length;
        System.out.println("Promedio: "+prom);
    }
}