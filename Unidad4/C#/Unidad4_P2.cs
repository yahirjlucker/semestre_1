using System;
namespace ProgramaU4_2;

class Si
{
    static void Main(string[] args)
    {
        //double[] a = { 1, 2, 3 }; manera simplificada
        double prom, suma = 0;

        Console.Write("Numero de calificaciones: ");
        int tam = Convert.ToInt32(Console.ReadLine()); //tamaño para el arreglo
        int[] c = new int[tam];

        for(int j=0; j<c.Length; j++)
        {
            Console.Write("Ingrese la calificacion: ");
            c[j] = Convert.ToInt32(Console.ReadLine()); //c el nombre del arreglo y j es el lugar, chango
            suma = suma + c[j];
        }
        /*for (int i = 0; i < c.Length; i++) Cuando no sabemos el tamaño del arreglo
        for (int i = 0; i < 10; i++){
            suma = suma + c[i];
        }*/
        prom = suma / c.Length; //Length es para dar el numero de datos que se encuentran en un arrray
        Console.Write("El promedio es: " + prom);
    }
}
