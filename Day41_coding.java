package Coding100Hari;

import java.util.Scanner;

public class Hari41 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan nilai x: ");
        int x = tisa.nextInt();
        
        System.out.println("Masukkan nilai y: ");
        int y = tisa.nextInt();
        
        int hasil = (x + 5)* y;
        System.out.println("Hasil dari (x + 5)* y = " + hasil);
        System.out.println("Apakah hasil lebih besar dari 50? " + (hasil > 50));
    }
    
}
