import java.util.Scanner;

public class Repetitivas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dame un numero positivo:");
        num = sc.nextInt();
        while(num>=0){
            System.out.println("el cuadrado de " + num + " es : " + num*num);
            System.out.print("Dame un numero positivo:");
            num = sc.nextInt();
        }
    }
}
