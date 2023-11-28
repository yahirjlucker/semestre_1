using System;
namespace ProgramaU4_4;

class Temperatura
{
    static void Main(string[] args)
    {
        double f = 0, k = 0;
        Console.Write("Numero de temperaturas de °C para las conversiones: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        double[] c = new double[tam];

        for(int i = 0; i < c.Length; i++)
        {
            Console.Write("Temperatura en grados Centigrados: ");
            c[i] = Convert.ToInt32(Console.ReadLine());
        }
        Console.WriteLine("");
        for (int j = 0; j < c.Length; j++)
        {
            f = (c[j] * 1.8) + 32;
            k = (c[j] + 273.15);
            Console.WriteLine(c[j] + "° a grados farenheit: " + f + "°.");
            Console.WriteLine(c[j] + "° a grados kelvin: " + k + "°.");
            Console.WriteLine("");
        }
    }
}
