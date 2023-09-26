import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;
        System.out.print("Dame un numero [0..9999]:");
        num = sc.nextInt();
        if(num <0 || num  >9999){
            System.out.println("Error, el numero no esta en el rango " + num);
        }else{
            int unidades = num % 10;
            int numInvertido = unidades;
            if(num > 10){
                int decenas = num / 10 % 10;
                numInvertido = numInvertido * 10 + decenas;
                if (num > 100){
                    int centenas = num / 100 % 10;
                    numInvertido = numInvertido *   10 + centenas;
                    if(num>1000){
                        int millares = num / 1000 % 10;
                        numInvertido = numInvertido*10 + millares;
                    }
                }
            }
            System.out.println(num + " al revés es " + numInvertido);

        }


    }
}