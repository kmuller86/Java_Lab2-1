public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        // a)
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i); // 1 2 3 4
        }
        System.out.println();

        // b)
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i); // 1 2 3 4 6 7 8 9 10 - bez 5
        }
        System.out.println();

        // c)
        for(int l=1;l<10;l++){
            if(l==5) {
                return;
            }
            System.out.println(l); // 1 2 3 4
        }
    }
}
