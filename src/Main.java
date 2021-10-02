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
        System.out.print("Twoje stringi to: ");
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

}

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
