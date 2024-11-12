package Coding100Hari;

import java.util.Scanner;

public class Hari72 {
        // Method rekursif untuk menghitung jumlah dari n ke 1
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            // Rekursi: n + sum(n - 1)
            return n + sum(n - 1);
        }
    }

       public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka = tisa.nextInt();
        System.out.println("Jumlah dari angka yg di inputkan ke 1 adalah: " + sum(angka));
    }
    }
    
