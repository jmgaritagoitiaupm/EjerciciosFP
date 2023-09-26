import java.util.Scanner;

public class Condicionales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        /*
        System.out.println("dame una nota [0,10]: ");
        nota = sc.nextInt();
        while(nota<0 || nota>10){
            System.out.println("dame una nota [0,10]: ");
            nota = sc.nextInt();
        }
        */
        do{
            System.out.println("dame una nota [0,10]: ");
            nota = sc.nextInt();
        }while(nota<0 || nota>10);
        if(nota >=0 && nota<=10){
            if (nota<5){
                System.out.println("Suspenso");
            } else if (nota <7) {
                System.out.println("Aprobado");
            } else if (nota < 9) {
                System.out.println("Notable");
            }else{
                System.out.println("Sobresaliente");
            }
        }else{
            System.out.println("error, nota no válida");
        }
    }
}
