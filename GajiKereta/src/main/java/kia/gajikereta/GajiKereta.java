package kia.gajikereta;
import java.util.Scanner;

public class GajiKereta {

    public static void main(String[] args) {
        double gaji_asas = 1800;
        double jumlah_gaji;
        double komisyen;
        int bil;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan kereta: ");
        bil = input.nextInt();
        
        if (bil > 10) {
            komisyen = 10000.00;
        } else if (bil >=5 && bil <= 9) {
            komisyen = 6000.00;
        } else if (bil >= 1 && bil <= 4) {
            komisyen = 3000.00;
        } else {
            komisyen = 0;
        }
        
        jumlah_gaji = gaji_asas + komisyen;
        
        System.out.println("Jumlah kereta: " + bil);
        System.out.println("Jumlah komisyen: " + komisyen);
        System.out.println("Jumlah gaji: RM " + jumlah_gaji);
    }
}
