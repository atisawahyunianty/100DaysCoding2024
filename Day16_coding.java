package Coding100Hari;

import java.util.Scanner;

public class Hari16 {
    public static void main(String[] args) {
        //Operator Aritmatika : perkalian, pembagian
        
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        int angka1 = tisa.nextInt();
        
        System.out.println("Masukkan angka kedua : ");
        int angka2 = tisa.nextInt();
        
        int perkalian = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + perkalian);
        
        int pembagian = angka1 / angka2;
        System.out.println("Hasil Pembagian = " + pembagian);
        
        
    }
    
}
