
package Coding100Hari;

import java.util.Scanner;

public class Hari88 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari :");
        double J = tisa.nextDouble();
        
        System.out.print("Masukkan Tinggi :");
        double T = tisa.nextDouble();
        
        // Rumus mencari volume tabung
        double volume = Math.PI * J * J * T;
        System.out.printf("%.2f m kubik%n", volume);
    }
    
}
