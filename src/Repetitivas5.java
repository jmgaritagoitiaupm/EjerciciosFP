import java.util.Random;
import java.util.Scanner;

public class Repetitivas5 {
    public static void main(String[] args) {
        int b;
        Random random = new Random();
        b = random.nextInt(1,25);
        Scanner sc = new Scanner(System.in);
        int numero, intentos=0;

        do{
            System.out.print("Dame un numero entre 1 y 25: ");
            numero = sc.nextInt();
            intentos++;
            if(numero==b){
                System.out.println("Has acertado al intento número " + intentos);
            } else if (numero > b) {
                System.out.println(numero + " es mayor que el buscado");
            }else{
                System.out.println(numero + " es menor que el buscado");
            }
        }while(numero != b);


    }
}
