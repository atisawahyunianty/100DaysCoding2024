package Coding100Hari;
public class Hari64 {
    public static void main(String[] args) {
        //break label
        tisa:
        for (int i = 1; i <= 5; i++) { 
            System.out.println("i :" + i);
            for (int j = 1; j <= 5; j++) { 
                if (j == 3) {  
                    break tisa;
                }
                System.out.println("j: " + j); 
            }
        }
        System.out.println("Loop selesai"); 
    }
    
}
