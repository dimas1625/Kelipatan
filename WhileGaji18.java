import  java.util.Scanner;
public class WhileGaji18 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int jumlahKaryawan,jumlahJamLembur;
        double gajiLembur=0;
        double totalGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input18.nextInt();
        
        int i = 0;

        while (i < jumlahKaryawan) {

        System.out.println("Pilihan jabatan Direktur, Manajer, karyawan"); 
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1)+": ");
        jabatan = input18.next();
        System.out.print("Masukkan jumlah jam lembur : "); 
        jumlahJamLembur = input18.nextInt(); 
        i++;

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) { 
            gajiLembur = jumlahJamLembur * 100000;
        }
        else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 750000;
        } else { i--;
            System.out.println("jabatan invalid"); continue;

        }

        totalGajiLembur += gajiLembur;
    }
    System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}