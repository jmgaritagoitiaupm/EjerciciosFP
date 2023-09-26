import java.util.Scanner;

public class Repetitivas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dame un numero: ");
        num = sc.nextInt();
        while (num!=0){
            if(num>0){
                System.out.println(num + " es positivo");
            }else {
                System.out.println(num + " es negativo");
            }
            System.out.print("Dame un numero: ");
            num = sc.nextInt();
        }
        /*
        do{
            System.out.print("Dame un numero: ");
            num = sc.nextInt();
            if(num>0){
                System.out.println(num + " es positivo");
            }else if(num<0) {
                System.out.println(num + " es negativo");
            }
        }while(num!=0);
        */
    }
}
