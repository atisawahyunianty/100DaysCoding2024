package Coding100Hari;

import java.util.Scanner;

public class Hari48 {

    public static void main(String[] args) {

        Scanner tisa = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int angka = tisa.nextInt();

        if (angka > 80 && angka < 100) {
            System.out.println("Anda mendapatkan nilai tertinggi");
        }
        if (angka > 70 && angka < 80) {
            System.out.println("Anda mendapatkan nilai standar");
        } else {
            System.out.println("Anda mendapatkan nilai rendah");
        }
    }

}
