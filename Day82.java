
package Coding100Hari;

public class Hari82 {
    public static void main(String[] args) {
      
        double angka = 8.9;
        double angka1 = 8.3;
        
        //Ceil (dibulatkan ke atas)
        System.out.println("===Ceil===");
        System.out.println("ceil dari " + angka + " adalah: " + Math.ceil(angka));
        
        //Floor (dibulatkan ke bawah)
        System.out.println("\n===floor===");
        System.out.println("floor dari " + angka + " adalah: " + Math.floor(angka));
        
        //Round (jika ≥ 0.5, dibulatkan ke atas dan jika < 0.5, dibulatkan ke bawah.)
        System.out.println("\n===round===");
        System.out.println("round dari " + angka + " adalah " + Math.round(angka));
        System.out.println("round dari " + angka1 + " adalah " + Math.round(angka1));
    }
    
}
