
package modul1;

import java.util.Scanner;

public class Latihan8 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai bahasa inggris : ");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
                System.out.println("Siswa dapat beasiswa");
    else
                System.out.println("Siswa tidak dapat beasiswa");
                
        
        
    }
    
}
