
package Tugas;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int hasil = 0;
        int r;
        double pi = 3.14;
        
        System.out.print("Masukkan Radius bola : ");
        r = masukan.nextInt();
        System.out.print("cm");
        hasil = (int) (4 * pi * r * r);
        System.out.println("Hasil : "+ hasil);
    }
    
}
