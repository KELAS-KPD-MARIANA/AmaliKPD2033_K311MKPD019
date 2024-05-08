package com.mycompany.undiparlimen;
import java.util.Scanner;
public class UndiParlimen {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();
        
        if (umur < 17) {
            System.out.println("Anda terlalu muda dan tidak layak mengundi"); 
        } else {
            System.out.print("Apakah Tuan/Puan telah mendaftar (ya/tidak): ");
            String daftar = input.next();
            
            if (daftar.equalsIgnoreCase("Ya")) {
                System.out.println("Anda layak mengundi");
            } else {
                System.out.print("Anda perlu mendaftar dulu sebelum mengundi");
            }
        }
    }
}
