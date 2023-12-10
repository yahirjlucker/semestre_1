import java.util.Random;

public class ProgramaU5_10 {

    public static void main(String[] args) {
        int longi=20; //Numero de letra, caracter o numoer
        String pass = random(longi);
        System.out.println("La connstraseña es: "+pass);
    }
    
    public static String random(int x){ //x es el tamaño
        //Caracteres
        String letras = "ABSLHDLHKAH/$%#&_jkjsaloqn"; //Doble comilla para string y comillas simpre para caracter
        Random alea = new Random(); //Funcion para que genere un numero aleatorio
        StringBuilder cadena = new StringBuilder(x); //Construir caracteres como un arreglo 
        for(int i=0; i<x; i++){
            /*Para darle un lugar de las letras que sea aleatorio y no uno fijo
            Ya que si se pone un numero fijo se pone lo mismo(1)*/
           int IndiceCaracter = alea.nextInt(letras.length()); //length cuenta las letras o numeros de caracteres
           /*Lo alamacena como si fuera un arreglo y el indice el valor*/
           cadena.append(letras.charAt(IndiceCaracter)); 
        
        }
        return cadena.toString(); //toString() el resultado lo conviertes en texto
    }
}
