package Coding100Hari;
public class Hari66 {
    public static void main(String[] args) {
        
        int persegi = 4;
        int panjang = 7;
        //pola persegi
        for (int i = 1; i <= persegi; i++) {
            for (int j = 1; j <= persegi; j++) {
                System.out.print(" * ");
                
            }
            System.out.println(); 
        }
        System.out.println("============================");
        
        //pola persegi panjang
        for (int i = 3; i <= panjang; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
        }
    }
    
}
