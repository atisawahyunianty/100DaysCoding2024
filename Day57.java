package Coding100Hari;

import java.util.Scanner;

public class Hari57 {
    public static void main(String[] args) {
       Scanner tisa = new Scanner (System.in);
       
        System.out.print("Masukkan angka awal : ");
        int angka = tisa.nextInt();
        
        while(angka <= 20 ){
            System.out.print(angka + " ");
            angka += 2;
        }
    }
    
}
