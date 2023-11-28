using System;
namespace ProgramaU4_1;

class Edades{
    static void Main(string[] args){
        int[] edades = new int[5];

        for(int i=0; i<5; i++){
            Console.Write("Ingrse la edad numero: ");
            edades[i]=Convert.ToInt32(Console.ReadLine());
        }
         Console.WriteLine("");
        for(int i=0; i<5; i++){
            Console.Write("Edad "+edades[i]+": ");
            if(edades[i]>=18){
                Console.WriteLine("Es mayor de edad");
            }else{
                Console.WriteLine("Es menor de edad");
            }
           
        }

    }
}