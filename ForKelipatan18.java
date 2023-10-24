import java.util.Scanner;
/**
 * ForKelipatan18
 */
public class ForKelipatan18 {

    public static void main(String[] args) {
        Scanner input18=new Scanner(System.in);

        int kelipatan;
        int jumlah=0;
        int counter=0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan=input18.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;

            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan,jumlah);
    }
}