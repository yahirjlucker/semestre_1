using System;
namespace ProgramaU4_18;

class Matriz{
    static void Main(string[] args){
        Console.Write("Tamaño de la matriz cuadrada: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        int[,]  mat = new int[tam,tam];
   
        for(int i=0; i<tam; i++){
            for (int j = 0; j < tam; j++) {
                Console.Write("Valor para ("+i+")("+j+"): ");
                mat[i,j] =Convert.ToInt32(Console.ReadLine());
            }
        }
        
        //1era Diagonal
        Console.Write("Valores de la primera diagonal: ");
        for (int i = 0; i < tam; i++) {
           Console.Write(mat[i,i]+" ");
        }
        Console.WriteLine("");
        Console.Write("Valores de la segunda diagonal: ");
        //2da diagonal
        for (int i = 1; i < tam; i++) {
            
                Console.Write(mat[i,i-1]+" ");
            
        }
    }
}