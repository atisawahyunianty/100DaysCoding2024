package Coding100Hari;

import java.util.Scanner;

public class Hari51 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = tisa.nextInt();
        
        //menggunakan sisa bagi 2 untuk menentukan genap atau ganjil
        switch(angka % 2){
            case 0:
                System.out.println("Angka " + angka + " adalah genap.");
                break;
            case 1:
                System.out.println("Angka " + angka + " adalah ganjil.");
                break;
        
        }
    }
    
}
