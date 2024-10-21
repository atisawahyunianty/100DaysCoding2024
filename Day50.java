package Coding100Hari;

import java.util.Scanner;

public class Hari50 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan nilai :");
        int nilai = tisa.nextInt();
        
        if(nilai >= 90 && nilai <= 100){
            System.out.println("A");
        }else if(nilai >= 80 && nilai <= 89){
            System.out.println("B");
        }else if(nilai >= 70 && nilai <= 79){
            System.out.println("C");
        }else if(nilai >= 60 && nilai <= 69){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }
    
}
