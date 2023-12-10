namespace ProgramaU5_4;

class Numero_P{
     public static void Main(string[] args) {
        Console.Write("Ingrese un numero: ");
        int num = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(num+" "+primo(num));
    }
    public static string primo(int x){  
        int c=0;
        string p;
        for(int i=x; i>0; i--){
            if(x%i==0){
                c++;
            }
        }
        if(c==2){
            p = "es numero primo";
        }else{
            p = "no es numero primo";
        }
         return p;
    }
   
}
