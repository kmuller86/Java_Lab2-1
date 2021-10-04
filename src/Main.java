import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */
        Zwierzaki();
        Numery();
        /* zad.1
        a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
           Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
           elementów i elementami mają być nazwy zwierząt.
        b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
           -- podpowiedź: for(String zmienna : List<String>)
        c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
           następnie wyświetlić listę i wielkość listy,
        d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
           elementów listy
          */
    }
        static void Zwierzaki() {
            List<String> zwierzaki = new ArrayList<>();
            Scanner scan = new Scanner((System.in));
            System.out.print("Wypisz kilka nazw zwierząt : ");

            int max = 5;
            for (int i = 0; i < max; i++) {
                zwierzaki.add(scan.nextLine());
            }
            System.out.println("zwierzaki: " + zwierzaki);

            for (String x : zwierzaki) {
                System.out.print(x + " ");
            }
            System.out.println();

            int zdjeto = 0; // Setup the variable for removal counting
            while (zdjeto < Math.min(zwierzaki.size(), 2)) { // While we still haven't removed 2 entries OR second list size
                zwierzaki.remove(zwierzaki.size() - 1); // Remove the last entry of the list
                zdjeto++; // Increases 'zdjeto' count
            }
            zwierzaki.add("Słoń");
            zwierzaki.add("Nosorożec");
            zwierzaki.add("Hippopotam");
            System.out.println("Zmodyfikowane zwierzaki: " + zwierzaki);

            //Collections.reverse(zwierzaki);
/*        for(String x : zwierzaki) {
            System.out.print(x + " ");
        }*/
            System.out.println("Twoje zwierzaki od tyłu: ");
            for (int a = zwierzaki.size() - 1; a >= 0; a--) {
                System.out.print(zwierzaki.get(a) + " ");
            }

            System.out.println();
            //System.out.println("zwierzaki od tyłu jako lista: " + zwierzaki);
            System.out.println("Rozmiar listy: " + zwierzaki.size());

         /* zad.2
         Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
         niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
         a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        }

        static void Numery() {
            SortedSet<Integer> liczby = new TreeSet<>();
            Scanner scan = new Scanner((System.in));

            System.out.print("Wypisz kilka liczb, niech się niektórw powtórzą : ");
            int max = 10;
            for (int i = 0; i < max; i++) {
                liczby.add(Integer.valueOf(scan.nextLine()));
            }
            System.out.println("Twoje Liczby to: " + liczby + " bez duplikatów i posortowane rosnąco.");
        }
}

