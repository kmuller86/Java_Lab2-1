import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        int b= 73;
        System.out.println(b);
        do {
            if (i % 73 == 0 && i !=0) {
                System.out.println( i + " - podzielna przez 73" + " = " + i/b);
            }
        } while (--i >= 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int[] tab = new int[5];
        /* punkt a) */
        tab[0]=1;
        tab[1]=5;
        tab[2]=3;
        tab[3]=9;
        tab[4]=2;

        System.out.println(Arrays.toString(tab));

        int j, x;
        j = 0;
        while (j < tab.length) {
            x = tab[j];
            System.out.println(x + " ");
            ++j;
        }

        double[] tab2 = new double[5];
        /* punkt b) */
        tab2[0]=1.1;
        tab2[1]=5.1;
        tab2[2]=3.1;
        tab2[3]=9.1;
        tab2[4]=2.1;

        System.out.println(Arrays.toString(tab2));

        double k, y;
        k = 0;
        while (k < tab2.length) {
            y = tab2[(int) k];
            System.out.println(y + " ");
            ++k;
        }

        String[] tab3 = new String[5];
        /* punkt c) */
        tab3[0]="Sławek";
        tab3[1]="Adam";
        tab3[2]="Jurek";
        tab3[3]="Roxana";
        tab3[4]="Terminator";

        int l = tab3.length-1;
        String z;
        while (l >= 0) {
            z = tab3[l];
            System.out.println(z + " ");
            --l;
        }

    /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

    }
}
