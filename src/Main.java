import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int b = 3;
        for (int i = 100; i >= 0; i--) {
            if (i % 3 == 0 && i !=0) {
                System.out.println( i + "/" + b + " = " + i/b);
            }
        }
        System.out.println("");

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ile chcesz elementów tablicy: ");
        //czytamy ilość chcianych elementów
        n = sc.nextInt();
        //tworzymy tablicę z 10 elementami
        int[] array = new int[10];
        System.out.println("Wprowadź liczby całkowite: ");
        for(int i=0; i<n; i++)
        {
        //czytamy elementy tablicy wpisane przez użytkownika
            array[i] = sc.nextInt();
        }
        System.out.println("Lista elementów: ");
        // odczytujemy elementy pętlą i do każdego elementu dodajemy 11
        for (int i=0; i<n; i++) {
            System.out.println(array[i]+11);
        }

    }
}
