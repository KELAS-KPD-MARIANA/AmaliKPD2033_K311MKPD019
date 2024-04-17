package kia.gajibekerja;
import java.util.Scanner;

public class GajiBekerja {

    public static void main(String[] args) {
        double baki;
        String jawapan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.next();

        int gajiSehari = 160;

        int hari;
        System.out.print("Masukkan bilangan hari bekerja: "); 
        do {
            hari = input.nextInt();

            if (hari > 31) {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
                System.out.print("Masukkan semula bilangan hari kerja: "); 
            }
        } while (hari > 31); 

        baki = hari * gajiSehari;

        System.out.println("Rumusan gaji bulanan bagi " + nama);
        System.out.println("Jumlah hari bekerja " + hari);
        System.out.println("GAJI SEBULAN ADALAH " + baki);
    } 
}
