
package Coding100Hari;

import java.util.Scanner;

public class Hari95 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("masukkan tingggi: ");
         int n = tisa.nextInt(); // jumlah baris pola

        // pola segitiga siku-siku
        System.out.println("Segitiga Siku-Siku:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pola segitiga siku-siku terbalik
        System.out.println("\nSegitiga Siku-Siku Terbalik:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
