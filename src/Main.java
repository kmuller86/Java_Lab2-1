import java.io.OutputStream;
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
        System.out.println();
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        int o_count = 0, p_count = 0, x_count = 0, z_count = 0, q_count = 0, otherLetters_count = 0;
        String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        for(char znak : wyraz.toCharArray()){
            if(znak == 'o'){
                o_count++;
            }
            else if(znak == 'p'){
                p_count++;
            }
            else if(znak == 'x'){
                x_count++;
            }
            else if(znak == 'z'){
                z_count++;
            }
            else if(znak == 'q'){
                q_count++;
            }
            else{
                otherLetters_count++;
            }
        }
        System.out.println("Ilość poszczególnych liter w wyrazie:\n" + wyraz);
        System.out.println("o: " + o_count);
        System.out.println("p: " + p_count);
        System.out.println("x: " + x_count);
        System.out.println("z: " + z_count);
        System.out.println("q: " + q_count);
        System.out.println("Pozostałe litery: " + otherLetters_count + " razy");
    }
}
