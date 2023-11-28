using System;
namespace ProgramaU4_6;

class Menor_Mayor{
    static void Main(string[] args){
        
        Console.Write("Cantidad de numeros a ingresar: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        double[] n= new double[tam];
        int l=tam-1;
        double temporal;

        for(int i=0; i<n.Length;i++){
            Console.Write("Ingrese un numero: ");
            n[i]=Convert.ToDouble(Console.ReadLine());
        }
        // Metodo burbuja: Revisa todo los valores del arreglo hasta que no necesiten más cambios
        for(int j=0; j<n.Length; j++){ 
            for(int k=0; k<n.Length;k++){
                if(n[j]>n[k]){
                    temporal=n[j]; //Un auxiliar para que no se pierda el valor que es mayor
                    n[j]=n[k]; // Se pasa para atras el menor
                    n[k]=temporal;// Ahora el valor que estaba comparando se pasa para delante del arreglo
                }
            }

        }
        Console.WriteLine("Numeros ordenados descendentemente: ");
        for(int h=0; h<n.Length; h++){
            Console.WriteLine(n[h]);
        }
    }

}