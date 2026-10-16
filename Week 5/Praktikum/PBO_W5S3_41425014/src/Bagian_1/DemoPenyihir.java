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

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// TAMBAHAN: Kelas RonWeasley mewarisi Penyihir
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan penuh semangat meskipun terkadang kurang tepat.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();

        // TAMBAHAN: Membuat objek RonWeasley
        Penyihir penyihir3 = new RonWeasley();

        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();

        // TAMBAHAN: Memanggil method RonWeasley
        penyihir3.ucapkanMantra();
    }
}
/*
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih
berjalan?
Jawab: Kode tetap bisa berjalan meskipun @Override dihapus, karena method ucapkanMantra() 
       pada class HarryPotter dan Hermione tetap menggantikan method milik class Penyihir. 
       Annotation @Override hanya membantu memastikan bahwa method tersebut benar-benar 
       menimpa method dari class induknya.
2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Jawab: Keuntungan polymorphism adalah kita bisa menggunakan satu tipe class yang sama, 
       yaitu Penyihir, untuk membuat objek HarryPotter dan Hermione. Ketika method 
       ucapkanMantra() dipanggil, setiap objek akan menampilkan hasil yang berbeda 
       sesuai dengan class masing-masing.
*/