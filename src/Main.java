import java.util.Scanner;

public class Main {
    /* ćwiczenie 5 Metody */

    public static void main(String[] args) {
        // zad.1 a) stworzyć tablicę typu int[20]
        int[] tab1 = new int[20];
        // zad.2 a)
        String[] tab2 = new String[6];
        // zad.1 d) wstawić wywołanie metody do metody main
        wypisanie(uzupelnienie(tab1));
        // zad.2 wywołanie metody
        wypisanie2(uzupelnienieStrinow(tab2));
        // zad.3
        zad3("Sławek", "Majchrzak", 48);
        // zad.4 zmienne + wywołanie
        int wynikA = zad4(1, 2);
        int wynikB = zad4(7, 8, 9);
        System.out.println("Suma zmiennych A i B: " + (wynikA + wynikB));
    }

    // zad.1 b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20
    static int[] uzupelnienie(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = 40-i;
        }
        return tab1;
    }
    // zad.2 c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0
    static String[] uzupelnienieStrinow(String[] tab2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz " + tab2.length + " dowolnych słów: ");
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = sc.nextLine();
        }
        return tab2;
    }

    // zad.1 c) napisać metodę, która wypisze otrzymane wartości,
    static void wypisanie(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
    }
    // zad.3 b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
    //            (użyć do tego pętli i klasy Scanner)
    static void wypisanie2(String[] tab2) {
        int index = tab2.length - 1;
        System.out.print("Twoje stringi na opak to: ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[index - i] + " ");
        }
        System.out.println();
    }

    static void zad3(String imie) {
        System.out.print(imie + " ");
    }
    static void zad3(String imie, String nazwisko) {
        zad3(imie);
        System.out.print(nazwisko + " ");
    }
    static void zad3(String imie, String nazwisko, int wiek) {
        zad3(imie, nazwisko);
        System.out.println(wiek);
    }

    static String[] zbierzDane(String[] odUsera) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię, nazwisko i wiek: ");
        for (int i = 0; i < 3; i++) {
            odUsera[i] = sc.nextLine();
        }
        return odUsera;
    }
    // zad.4
    public static int zad4(int a, int b) {
        int wynikA = (a + b);
        System.out.println("Zmienna A (suma dwóch liczb): " + wynikA);
        return wynikA;
    }
    public static int zad4(int c, int d, int e) {
        int wynikB = (c + d + e);
        System.out.println("Zmienna B (suma trzech liczb): " + wynikB);
        return wynikB;
    }

}
