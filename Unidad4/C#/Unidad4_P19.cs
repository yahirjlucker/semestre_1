using System;
namespace ProgramaU4_18;

class Numeros{
    static void Main(string[] args){
        int par=0; int impar=0;
        Console.Write("Numero de filas(X): ");
        int x= Convert.ToInt32(Console.ReadLine());
        Console.Write("Numeros de columnas(Y): ");
        int y= Convert.ToInt32(Console.ReadLine());
        int[,] num = new int[x,y];
        
            for (int j = 0; j < y; j++) {
        for(int i=0; i<x; i++){
                Console.Write("Valor para ("+i+")("+j+"): ");
                num[i,j]=Convert.ToInt32(Console.ReadLine());
            }
        }
        
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                if(num[i,j]%2==0){
                    par++;
                }else{
                    impar++;
                }
            }
        }
        
        Console.WriteLine("Numeros pares: "+par);
        Console.WriteLine("Numeros impares: "+impar);
    }
}
