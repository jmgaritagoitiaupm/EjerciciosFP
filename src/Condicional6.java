import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Dame el día, mes y anio: ");
        dia=sc.nextInt();
        mes=sc.nextInt();
        anio=sc.nextInt();
        if(anio<1){
            System.out.println("El año es incorrecto");
        } else if (mes <1 || mes >12) {
            System.out.println("El mes es erróneo");
        } else if (dia < 1 || dia > 31) {
            System.out.println("El día es incorrecto");
        } else if (dia>28 && mes==2) {
            System.out.println("Febrero solo tiene 28 días");
        } else if (dia==31 && (mes ==4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Este mes solo puede tener 30 dias");
        }else{
            System.out.printf("Fecha %02d-%02d-%d ",dia,mes,anio);
        }



    }
}
