
import java.util.Scanner;

public class Programau5_3 {
     public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Ingresa x: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa y: ");
        double y = sc.nextDouble();
        
        System.out.println("Resultados 1era ecuacion: " + ec1(x,y));
        System.out.println("Resultados 2da ecuacion: " + ec2(x,y));
        
    }
    public static double ec1(double x, double y){
        double r;
       r= Math.pow(x,2)+(2*Math.pow(y,4));
        return r;
        
    }
    public static double ec2(double x, double y){
        double r;
       r= Math.sqrt(Math.pow(x,4)+ (5*y));
        return r;
        
    }
    
}


