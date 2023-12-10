import java.util.Scanner;
public class ProgramaU5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double p = sc.nextDouble();
        System.out.print("Cantidad de productos: ");
        int n= sc.nextInt();
        System.out.println("Subtotal del producto: "+sub(p, n)+" $");
        System.out.println("IVA del producto: "+iva(p)+" $");
        System.out.println("Total a pagar: "+total(p,n)+" $");
    }
    //IVA del producto
    public static double iva(double a){
        double IVA=0.16;
        double r = a*IVA;
        return r;
    }
    //SUBTOTAL
    public static double sub(double a, int b){
        double r = a*b;
        return r;
    }
    // TOTAL
    public static double total(double b, double c){
        double IVA=0.16;
        double r= (b*c)+((b*c)*IVA);
        return r;
    }
    
}
