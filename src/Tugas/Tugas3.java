
package Tugas;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, tmpt_lhr, jns_klmn, motto_hdp, almt, tgl_lhr;
        int nis;
        
        System.out.print("Nama                : ");
        nama = masukan.nextLine();
        System.out.print("NIS                 : ");
        nis = masukan.nextInt();
        System.out.print("Tempat Lahir        : ");
        tmpt_lhr = masukan.next();
        System.out.print("Tanggal Lahir       : ");
        tgl_lhr = masukan.next();
        System.out.print("Jenis Kelamin       : ");
        jns_klmn = masukan.next();
        System.out.print("Alamat di Malang    : ");
        almt = masukan.next();
        System.out.print("Motto Hidup         : ");
        motto_hdp = masukan.next();
    }
    
}