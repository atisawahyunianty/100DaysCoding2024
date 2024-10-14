package Hari43;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
         // Meminta input jari-jari dan satuan
        System.out.print("Input Jari-jari : ");
        double jariJari = tisa.nextDouble();

        System.out.print("Input satuan \t: ");
        String satuan = tisa.next();
        
        final double PI = 3.14159;

        // Menghitung keliling dan luas
        double keliling = 2 * PI * jariJari;
        double luas = PI * jariJari * jariJari;

        // Menampilkan hasil
        System.out.println("=================================HASIL=================================");
        System.out.printf("Jari-jari   : %.0f %s\n", jariJari, satuan);
        System.out.printf("Keliling    : %.5f %s\n", keliling, satuan);
        System.out.printf("Luas        : %.5f %s^2\n", luas, satuan);

        
    }
    
}
