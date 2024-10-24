package Coding100Hari;

import java.util.Scanner;

public class Hari53 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        System.out.print("Masukkan perkalian apa : ");
        int number = tisa.nextInt();

        // Perulangan untuk menampilkan tabel perkalian 
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (number * i));
        }
    }
    
}
