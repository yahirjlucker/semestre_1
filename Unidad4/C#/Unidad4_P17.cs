using System;
namespace ProgramaU4_17;

class Multi{
    static void Main(string[] args){
        Console.Write("Numero de filas(X): ");
        int x= Convert.ToInt32(Console.ReadLine());
        Console.Write("Numeros de columnas(Y): ");
        int y= Convert.ToInt32(Console.ReadLine());
        int[,] uno = new int[x,y];
        int[,] dos = new int[x,y];
        int[,] tres = new int[x,y];
        
        //1
       Console.WriteLine(" * * * Primera matriz * * *");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                Console.Write("Valor para ("+i+")("+j+"): ");
                uno[i,j]=Convert.ToInt32(Console.ReadLine());
            }
        }
        //2
        Console.WriteLine("* * * Segunda matriz * * *");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                Console.Write("Valor para ("+i+")("+j+"): ");
                dos[i,j]=Convert.ToInt32(Console.ReadLine());
            }
        }
        //3
        Console.WriteLine("* * *Multiplicacion de las dos matrices * * *");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                tres[i,j]= uno[i,j] * dos[i,j];
                Console.Write(tres[i,j]+"  ");
            }
        }
    }
}