import java.util.Scanner;
/**
 * DoWhileCuti18
 */
public class DoWhileCuti18 {

    public static void main(String[] args) {
        Scanner input18=new Scanner(System.in);

        int jatahCuti,jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti=input18.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)");
            konfirmasi = input18.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println( "Jumlah Hari: ");
                jumlahHari = input18.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }    
                } else {    
                    break;
                }
        } while (jatahCuti > 0 && !konfirmasi.equalsIgnoreCase("t"));
        System.out.println("Anda Tidak Mengambil Jatah Cuti");
    }
}