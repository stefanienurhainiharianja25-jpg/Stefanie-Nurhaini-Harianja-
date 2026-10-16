/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.*;

public class Mantra {

    // Method ucapan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

      // TAMBAHAN: Overload dengan dua parameter String
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: Senjata " + target + " terlepas.");
    }

    // TAMBAHAN: Overload dengan urutan parameter berbeda
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");

        // TAMBAHAN: Menguji method dua parameter String
        mantra.ucapkan("Expelliarmus", "Harry");

        // TAMBAHAN: Menguji urutan parameter berbeda
        mantra.ucapkan(15, "Expelliarmus");
    }
}

/*
1. Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method
dengan dua parameter.
Jawab: Jika method dengan dua parameter dihapus, pemanggilan mantra.ucapkan("Expelliarmus", 5); 
       akan mengalami error karena method tersebut sudah tidak ada. Namun, method yang memiliki 
       satu dan tiga parameter tetap bisa dijalankan.

2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba
buat method ucapkan(int kekuatan, String namaMantra).
Jawab: Bisa. Method overloading dapat dibuat dengan urutan parameter yang berbeda, 
       asalkan tipe atau jumlah parameternya berbeda.
       Tambahkan method berikut ke dalam class Mantra:

       public void ucapkan(int kekuatan, String namaMantra) {
            System.out.println("Mengucapkan mantra: " + namaMantra
                    + " dengan kekuatan " + kekuatan);}
            
       Kemudian, panggil method tersebut di dalam main():
       mantra.ucapkan(5, "Expelliarmus");
       
       outputnya mnejadi: Mengucapkan mantra: Expelliarmus dengan kekuatan 5
*/