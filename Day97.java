
package Coding100Hari;

import java.util.Scanner;

public class Hari97 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan n: ");
        int n = tisa.nextInt();
        
        System.out.println("Bilangan prima dari 1 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i + " ");
            }
            
        }
    }
    
    // metode untuk memeriksa apakah suatu bilangan adalah prima
    private static boolean isPrime(int angka) {
           if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
       
    }
    
}
