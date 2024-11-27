
package Coding100Hari;

import java.util.Arrays;


public class Hari87 {
    public static void main(String[] args) {
        int angka [] = {10,20,30}; 
        
        System.out.println("sebelum di ubah :" + Arrays.toString(angka));
        
        angka[0] = 5;
        
        System.out.println("setelah mengubah(index ke 0) :" + Arrays.toString(angka));
        
    }
    
}
