using System;
namespace ProgramaU4_7;

class Si{
    static void Main(string[] args){
        int  p1=0, p2=0;
        double media=0, mediana=0, suma=0;
        Console.Write("Cantidad de numeros a calcular: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        int[] n = new int[tam];

        //Ingresar valores al arreglo
        for(int i=0; i<n.Length; i++){
            Console.Write("Ingrese un numero: ");
            n[i]= Convert.ToInt32(Console.ReadLine());
        }

        // Sacaar la media
        for(int i=0 ; i<n.Length; i++){
            suma = suma+n[i];
        }
        media = suma/n.Length;
        Console.WriteLine("Media: "+media);

        //Sacar la mediana
        
        if(n.Length%2==0){
            p1=(n.Length/2)-1;
            p2=n.Length/2;
            mediana=(n[p1]+n[p2])/2;
            Console.Write("Mediana: "+mediana);
        }else{
            mediana=(n.Length-1)/2;
            Console.Write("Mediana: "+n[(int)mediana]);
        }

        
    }
}