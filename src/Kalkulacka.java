import java.util.Scanner;

public class Kalkulacka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cislo1, cislo2, vysledek;
        char operator;

        System.out.println("Zadaj prvé číslo: ");
        cislo1 = scanner.nextDouble();

        System.out.println("Zadaj operátor (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.println("Zadaj druhé číslo: ");
        cislo2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                vysledek = cislo1 + cislo2;
                break;
            case '-':
                vysledek = cislo1 - cislo2;
                break;
            case '*':
                vysledek = cislo1 * cislo2;
                break;
            case '/':
                if (cislo2 != 0) {
                    vysledek = cislo1 / cislo2;
                } else {
                    System.out.println("Chyba: Delenie nulou nie je povolené.");
                    return;
                }
                break;
            default:
                System.out.println("Chyba: Neplatný operátor.");
                return;
        }

        System.out.println("Výsledek: " + vysledek);
    }
}

