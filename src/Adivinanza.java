import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int oportunidades = 0;
        int numeroRandowm = new Random().nextInt(100);
        System.out.println(numeroRandowm);

        System.out.println("Adivina el numero y se el ganador!!!");
        System.out.println("(el numero esta entre 0 y 100)");
        System.out.println("Tiens 5 oportunidades");
        while (oportunidades < 5){
            System.out.println("Oportunidad numero:" +  (oportunidades + 1) );
            System.out.println("Ingresa el numero:");
            oportunidades++;
            int numeroAdivinado = teclado.nextInt();
            if (numeroAdivinado == numeroRandowm ){
                System.out.println("Felicidades adivinaste");
                oportunidades = -1;
                break;
            }else if (numeroAdivinado < numeroRandowm){
                System.out.println("Lo siento vuelve a intentarlo, el numero es mayor");
            }else {
                System.out.println("Lo siento vuelve a intentarlo, el numero es menor");
            }
        }

        if (oportunidades == 5) {
            System.out.println("Lo siento superaste el limite");
        }

    }
}
