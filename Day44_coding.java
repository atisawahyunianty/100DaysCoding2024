package Coding100Hari;

import java.util.Scanner;

public class Hari44 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Input angka pertama :");
        int angka1 = tisa.nextInt();
        System.out.print("Input angka kedua   :");
        int angka2 = tisa.nextInt();
        
        System.out.println("================================");
        
        System.out.println(angka1 <= angka2);
        System.out.println(angka1 >= angka2);
    }
    
}
