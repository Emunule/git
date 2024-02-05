import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KamenNozkyPapier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Vitajte v hre Kameň, Nôžky, Papier!");
        System.out.println("Zadajte svoj výber (kamen, nozky, papier): ");

        String[] moznosti = {"kamen", "nozky", "papier"};
        String vyberHraca = scanner.nextLine().toLowerCase();

        Arrays Arrays = null;
        if (!Arrays.asList(moznosti).contains(vyberHraca)) {
            System.out.println("Neplatný výber. Skúste znova.");
            return;
        }

        int vyberPocitacaIndex = random.nextInt(moznosti.length);
        String vyberPocitaca = moznosti[vyberPocitacaIndex];

        System.out.println("Počítač si vybral: " + vyberPocitaca);

        // Rozhodnutie víťaza
        if (vyberHraca.equals(vyberPocitaca)) {
            System.out.println("Remíza!");
        } else if ((vyberHraca.equals("kamen") && vyberPocitaca.equals("nozky")) ||
                (vyberHraca.equals("nozky") && vyberPocitaca.equals("papier")) ||
                (vyberHraca.equals("papier") && vyberPocitaca.equals("kamen"))) {
            System.out.println("Gratulujem, vyhrali ste!");
        } else {
            System.out.println("Počítač vyhral. Skúste znova.");
        }
    }
}
