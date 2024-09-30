package Coding100Hari;

public class Hari29 {

    public static void main(String[] args) {
        //konversi string ke boolean dan char

        String a = "true";
        boolean b = Boolean.parseBoolean(a);
        System.out.println("Konversi ke boolean :" + b);

        String c = "Hello";
        char d = c.charAt(0);
        System.out.println("konversi ke char :" + d);
    }

}
