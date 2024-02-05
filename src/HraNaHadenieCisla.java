import java.util.Scanner;

public class HraNaHadenieCisla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vitajte v hre na hádanie čísla!");
        System.out.println("Hra generuje náhodné číslo od 1 do 100.");

        // Generovanie náhodného čísla od 1 do 100
        int spravneCislo = (int) (Math.random() * 100) + 1;

        int pokusy = 0;
        boolean uspech = false;

        while (!uspech) {
            System.out.println("Zadajte vašu hádanú hodnotu: ");
            int hadaneCislo = scanner.nextInt();
            pokusy++;

            if (hadaneCislo == spravneCislo) {
                uspech = true;
            } else if (hadaneCislo < spravneCislo) {
                System.out.println("Hľadané číslo je väčšie. Skúste znova.");
            } else {
                System.out.println("Hľadané číslo je menšie. Skúste znova.");
            }
        }

        System.out.println("Gratulujem! Uhádli ste správne číslo " + spravneCislo + " po " + pokusy + " pokusoch.");
    }
}
