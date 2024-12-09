
package Coding100Hari;

import java.util.Scanner;

public class Hari99 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan angka x: ");
        int angkaAwal = tisa.nextInt();
        
        System.out.print("Masukkan angka y: ");
        int angkaAkhir = tisa.nextInt();

        int total = 0;

        for (int i = angkaAwal; i <= angkaAkhir; i++) {
            if (i % 2 == 0) {
                total += i;

            }
        }
        System.out.println("Jadi total penjumlahan bilangan genap dari " + angkaAwal + " ke " + angkaAkhir + " adalah " + total);
    }
    
}
