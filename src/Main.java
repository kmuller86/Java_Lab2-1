import java.util.Scanner;

public class Main {
    private static int[] tablica;
    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        // Do wyłapania inputu użytkownika
        int a;
        // Tworzenie skanera do danych wejściowych.
        Scanner console = new Scanner(System.in);
        // Zapytanie o podanie liczby.
        System.out.print("Wpisz dowolną liczbę: ");
        a = console.nextInt();
        // Określić co użytkownik wpisał.
        switch (a % 2)
        {
            case 0 :
                System.out.println("Liczba jest parzysta.");
                break;
            case 1 :
                System.out.println("Liczba jest nieparzysta.");
                break;
        }
        if(a % 7 == 0){
            System.out.println("Liczba " + a + " jest podzielna przez 7." + "\nWynik dzielenia to: " + a / 7);
        } else {
            System.out.println("Liczba " + a + " nie dzieli się przez 7.");
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

    }
}
