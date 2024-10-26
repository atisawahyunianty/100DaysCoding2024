package Coding100Hari;
public class Hari55 {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil dari 1 hingga 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // Memeriksa apakah i adalah bilangan ganjil
                System.out.print(i + " ");
            }
        }
    }
    
}
