using System;
namespace ProgramaU5_1;

class Calculadora{
    static void Main(string[] args){
        Console.WriteLine("Suma: "+suma(8,10));
        Console.WriteLine("Resta: "+resta(28,8));
        Console.WriteLine("Multiplicacion: "+multi(11,2));
        Console.WriteLine("Division: "+divi(81,9));
    }
    // SUMA
    public static int suma(int a, int b){
        int res=a+b;
        return res;
    }
    // RESTA
     public static int resta(int a, int b){
        int res=a-b;
        return res;
    }
    // MULTIPLICACION
     public static int multi(int a, int b){
        int res=a*b;
        return res;
    }
    // DIVISION
     public static int divi(int a, int b){
        int res=a/b;
        return res;
    }
}