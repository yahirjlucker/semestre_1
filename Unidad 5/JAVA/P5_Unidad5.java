import java.util.Scanner;
public class ProgramaU5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String pal = sc.nextLine();
        System.out.println(pal+" tiene un total de: "+palabra(pal)+" letras");
    }
    public static int palabra(String x){
        int p = x.length();
        return p;
    }
}
