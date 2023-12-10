using System.Text; //para la cadena imaginaria o por decirlo de ese modo
namespace ProgramaU5_10;

class Password{
    static void Main(string[] args){
        int longitud=8;
        Console.Write("Password: "+random(longitud));
    }
    public static String random(int x){ //x es el tamaño    
        //Caracteres
        string letras = "ABSLHDLHKAH/$%#&_jkjsaloqn"; //Doble comilla para string y comillas simpre para caracter
        StringBuilder cadena = new StringBuilder(x); //Construir caracteres como un arreglo 
        Random alea = new Random(); //Funcion para que genere un numero aleatorio
       
        for(int i=0; i<x; i++){
            /*Para darle un lugar de las letras que sea aleatorio y no uno fijo
            Ya que si se pone un numero fijo se pone lo mismo(1)*/
           int IndiceCaracter = alea.Next(letras.Length); //length cuenta las letras o numeros de caracteres
           /*Lo alamacena como si fuera un arreglo y el indice el valor*/
           cadena.Append(letras[IndiceCaracter]); 
        
        }
        return cadena.ToString(); //toString() el resultado lo conviertes en texto
    }
}