package Coding100Hari;

import java.util.Scanner;

public class Hari47 {
    public static void main(String[] args) {
        
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan nilai :");
        int nilai = tisa.nextInt();
        
        if(nilai >= 80){
            System.out.println("Selamat anda lulus");
        }else{
            System.out.println("Anda tidak lulus");
        }
    }
    
}
