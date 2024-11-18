
package Coding100Hari;

import java.util.Scanner;

public class Hari78 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        String nama = "Sunghoon";
        System.out.println("Masukkan nama bias :");
        String inputNama = tisa.nextLine();
        
        if(nama.equalsIgnoreCase(inputNama)){
            System.out.println("Member Enhypen");
        }else{
            System.out.println("Coba lagi!");
        }
        
    }
    
}
