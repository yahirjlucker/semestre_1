using System;
namespace ProgramaU4_20;

class Matriz{
    static void Main(string[] args){
        Console.Write("Numero de filas(X): ");
        int x= Convert.ToInt32(Console.ReadLine());
        Console.Write("Numeros de columnas(Y): ");
        int y= Convert.ToInt32(Console.ReadLine());
        int[,] num = new int[x,y];
        int[,] cua = new int[x,y];
        
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                Console.Write("Valor para ("+i+")("+j+"): ");
                num[i,j]=Convert.ToInt32(Console.ReadLine());
            }
        }
        //Cuadrados
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                cua[i,j]= num[i,j] * num[i,j];
            }
        }
        //Imprimir al cuadrado
        Console.Write("Numeros al cuadrado: ");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                Console.Write(cua[i,j]+" ");
            }
        }
    }
}