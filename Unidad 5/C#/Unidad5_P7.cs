namespace ProgramaU5_7;

class Pago{
    static void Main(string[] args){
        Console.Write("Ingrese el precio del producto: ");
        double p = Convert.ToDouble(Console.ReadLine());
        Console.Write("Cantidad de productos: ");
        int n= Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Subtotal del producto: "+sub(p, n)+" $");
        Console.WriteLine("IVA del producto: "+iva(p)+" $");
        Console.WriteLine("Total a pagar: "+total(p,n)+" $");
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