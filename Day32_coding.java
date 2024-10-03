package Coding100Hari;

import java.util.Scanner;

public class Hari32 {
    public static void main(String[] args) {
             Scanner tisa = new Scanner(System.in);
             
             System.out.println("Masukkan angka pertama :");
             int angka1 = tisa.nextInt();
             System.out.println("Masukkan angka kedua :");
             int angka2 = tisa.nextInt();
             
             double pembagian = angka1 / angka2;
             System.out.println("hasil pembagian =" + pembagian);
    }
    
}
