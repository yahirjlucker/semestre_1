using System;
namespace ProgramaU4_8;

class Par_Impar{
    static void Main(string[] args){
        int par=0, impar=0, n1=0, n2=0;
        Console.Write("Total de numeros a ingresar: ");
        int tam = Convert.ToInt32(Console.ReadLine());
        int[] n = new int[tam];
    

        for(int i=0; i<n.Length; i++){
            Console.Write("Ingrese un numero: ");
            n[i] = Convert.ToInt32(Console.ReadLine());

        }
        //Sacar el tamaño de los arreglos 
        for(int i = 0; i<n.Length; i++){
            if(n[i]%2==0){
                par++;
            }else{
                impar++;
            }
        }
            int[] par_array = new int[par];
            int[] impar_array = new int[impar];
        //Dar valores a los arreglos
        for(int j = 0; j<n.Length; j++){
            if(n[j]%2==0){
                par_array[n1]=n[j];
                n1++;
            }else{
                impar_array[n2]=n[j];
                n2++;
            }    
        }
        //Pares
        Console.Write("Numeros pares: ");
        for(int k =0; k<par_array.Length; k++){
            
            Console.Write(par_array[k]+" ");
        }
        //Impares
        Console.WriteLine("");
        Console.Write("Numeros impares: ");
        for(int l=0; l<impar_array.Length; l++){
            
            Console.Write(impar_array[l]+" ");
        }

    }
}
