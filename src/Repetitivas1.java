import java.util.Scanner;

public class Repetitivas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Dame un numero positivo: ");
            num = sc.nextInt();
        }while (num <= 0);

        int aux = num, contador = 0;
        while(aux>0){
            contador++;
            aux /= 10;
        }
        System.out.println(num + " tiene " + contador + " cifras");

    }
}
