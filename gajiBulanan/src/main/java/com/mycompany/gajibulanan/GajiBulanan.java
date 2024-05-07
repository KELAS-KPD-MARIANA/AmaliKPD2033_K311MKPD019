package com.mycompany.gajibulanan;
import java.util.Scanner;
public class GajiBulanan {

    public static void main(String[] args) {
     
        double gaji;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Pelanggan: ");
        int pelanggan = input.nextInt();
        
        int gajiBulanan = 1100;
        int bonus = 0;
        
        if (pelanggan >1 && pelanggan <= 9) {
            bonus = 2000;
        } else if (pelanggan > 10 && pelanggan <= 19) {
            bonus = 4000;
        } else if (pelanggan > 20 && pelanggan <= 29) {
            bonus = 6000;
        } else if (pelanggan > 30 && pelanggan <= 39) {
            bonus = 8000;
        } else if (pelanggan > 40) {
            bonus = 10000;
        }
        
        gaji = gajiBulanan + bonus;
        
        System.out.println("Bilangan Pelanggan ialah: " + pelanggan);
        System.out.println("Jumlah Gaji bulanan adalah:RM " + gaji);
    }
}
