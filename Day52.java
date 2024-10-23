package Coding100Hari;

import java.util.Scanner;

public class Hari52 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan nilai :");
        int nilai = tisa.nextInt();
        
        //menggunakan ternary untuk menentukan status kelulusan
        
        String status = (nilai >= 70) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status :" + status);
        
    }
    
}
