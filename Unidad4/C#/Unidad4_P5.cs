using System;
namespace ProgramaU4_5;

class Frutas{
    static void Main(String[] args){

        Console.Write("Cantidad de frutas: ");
        int tam=Convert.ToInt32(Console.ReadLine());
        String[] fruta = new String[tam];
        String[] fruta_r = new String[tam];
        int l=tam-1;

        for(int i=0; i<fruta.Length; i++){
            Console.Write("Ingrese nombre de una fruta: ");
            fruta[i]=Console.ReadLine();
        }

        for(int j=0; j<fruta.Length; j++){
            fruta_r[j]= fruta[l];
            l--;
        }

        for(int k=0; k<fruta_r.Length; k++){
            Console.Write(fruta_r[k]+", ");
        }

    }
}