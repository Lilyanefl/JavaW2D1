import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            if (litriConsumati == 0) {
                throw new ArithmeticException("Divisione per zero: litri consumati non possono essere 0.");
            }

            double kmPerLitro = kmPercorsi / litriConsumati;
            System.out.printf("Hai percorso %.2f km/litro.%n", kmPerLitro);

        } catch (ArithmeticException e) {
            LOGGER.error("Errore: {}", e.getMessage());
            System.out.println("Errore: Non puoi inserire 0 come valore per i litri consumati.");
        } catch (Exception e) {
            LOGGER.error("Errore generico: {}", e.getMessage());
            System.out.println("Si è verificato un errore. Assicurati di inserire numeri validi.");
        } finally {
            scanner.close();
        }

//        int[] newArray = {1,2,8,6,10};
//        Scanner scanner = new Scanner(System.in);
//        int x = 1;
//        int n = 0;
//
//
//        while(x!= 0){
//            try {
//                System.out.println("Inserisci numero");
//                x = scanner.nextInt();
//                System.out.println("Inserisci posizione");
//                n = scanner.nextInt();
//
//                newArray[n] = x;
//            } catch (Exception e) {
//                LOGGER.error(String.valueOf(e));
//            }
//
//        }
    }
}