import java.util.Scanner;

public class ProgramaU4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ed = new int[5];
    

        for(int i=0; i<5; i++){
            System.out.print("Ingrse la edad numero: ");
            ed[i] = sc.nextInt();
        }

        System.out.println("");
        for(int i=0; i<5; i++){
            System.out.print("Edad "+ed[i]+": ");
            if(ed[i]>=18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
           
        }

        

        

    }
}