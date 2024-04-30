package kia.puratamarkah;
import java.util.Scanner;
public class PurataMarkah {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double ujian;
        double[] markah = new double[5];
        double purata = 0;
        
        
        System.out.print("Peperiksaan / ujian kali ke (1/2/3): ");
        ujian = input.nextDouble();

        
        for (int i = 0; i < 5; i++) {
            System.out.print("");
            markah[i] = input.nextDouble();
            purata += markah[i];
        }

        System.out.println("\nMarkah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "." + markah[i]);
        }

        System.out.println("\nHasil tambah 5 Markah: " + purata);

        double hasilpurata = (purata / 5);
        System.out.println("Purata: " + hasilpurata);

        int Jumlah = 0;
        for (int i = 0; i < 5; i++) {
            if (markah[i] > hasilpurata) {
                Jumlah++;
            }
        }
        System.out.println("Bilangan markah melebihi purata: " + Jumlah);
    }
}
