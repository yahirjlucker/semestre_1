using System;
namespace ProgramaU5_2;

class Conversiones{
    static void Main(string[] args){
        int op;

        Console.WriteLine(" * * *ELIJA UNA CONVERSION * * * ");
        Console.WriteLine("1) Tempeartura °C a °F.");
        Console.WriteLine("2) Temperatura °F a °K.");
        Console.WriteLine("3) Medida pulgadas a metros.");
        Console.WriteLine("4) Tiempo horas a segundos.");

        do{
            Console.Write("Opcion: ");
            op = Convert.ToInt32(Console.ReadLine());
            switch(op){
                case 1:
                    Console.WriteLine("");
                    Console.Write("Temperatura en °C: ");
                    double c = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(c+" °C equivalen a: "+far(c)+" °F");
                    break;
                case 2: 
                    Console.WriteLine("");
                    Console.Write("Tempeartura a °F: ");
                    double f = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(f+" °F equivalen a: "+k(f)+" °K");
                    break;
                case 3:
                    Console.WriteLine("");
                    medida();
                    break;
                case 4:
                    Console.WriteLine("");
                    hora();
                    break;
                default:
                    Console.WriteLine("");
                    Console.WriteLine("No es una opcion eligible.");
                    break;
            }

        }while(op<1 || op>4);


        
    }
    // FUNCIONES
// 1) Celsius a Farenheit
    public static double far(double a){
        double r= (a *1.8)+32;
        return r;
    }
    // 2) Farenheit a Kelvin
    public static double k(double a){
        double r = ((a-32)*(0.555555))+273.15;
        return r;
    }
    // 4) Horas a segundos
    public static void hora(){
        
        double hrs, r;
        Console.Write("Horas: ");
        hrs = Convert.ToDouble(Console.ReadLine());
        r = hrs * 3600;
        Console.Write(hrs+" horas equivalen a: "+r+" segundos");
    }
    // 3) Pulgadas a centimetros
    public static void medida(){ // Para void no ocupas el comentario return
        double pul, r;
        Console.Write("Medida en pulgadas: ");
        pul = Convert.ToDouble(Console.ReadLine());
        r = pul*2.54;
        Console.Write(pul+" in equivalen a: "+r+" cm");
    }
    
}
