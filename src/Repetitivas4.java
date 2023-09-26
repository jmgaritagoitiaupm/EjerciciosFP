import java.util.Scanner;

public class Repetitivas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero ;
        int contador = 0;
        do{
            System.out.print("Dame un numero: ");
            numero = sc.nextInt();
            if(numero>0){
                contador++;
            }
        }while(numero>=0);
        System.out.println("Has introducido " + contador + " positivos");
    }
}
