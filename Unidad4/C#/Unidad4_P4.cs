using System;
using System.Dynamic;
namespace ProgramaU4_4;

class Negatuvos{
    static void Main(string[] args){
        int nega=0;
        Console.Write("Cantidad de numero a evalurar: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        int[] n = new int[tam];

        for(int i=0; i<n.Length; i++){
            Console.Write("Ingrese el numero: ");
            n[i]=Convert.ToInt32(Console.ReadLine());
        }

        for(int i=0; i<n.Length; i++){
            if(n[i]<0){
                nega++;
            }
        }
        Console.WriteLine("Total de numeros negativos que hay: "+nega);
    }
}