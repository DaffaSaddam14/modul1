
package Tugas;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        System.out.println("Daffa Saddam Almadani / X RPL 6 / 14");
        
        Scanner masukan = new Scanner(System.in);
        double c = 0, r, f, k;
        
        System.out.print("Masukkan nilai Celcius : ");
        c = masukan.nextInt();
        
        r = c * 4 / 5;
        System.out.println("Reamur : " + r );
        f = c * 9 / 5 + 32;
        System.out.println("Fahrenheit : " + f);
        k = c + 273;
        System.out.println("Kelvin : " + k);
        
                }
}