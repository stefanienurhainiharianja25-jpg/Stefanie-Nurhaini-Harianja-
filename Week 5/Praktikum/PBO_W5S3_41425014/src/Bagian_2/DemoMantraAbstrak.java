/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.*;

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// TAMBAHAN: Kelas Lumos
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menghasilkan cahaya dari ujung tongkat.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        // TAMBAHAN: Membuat dan menjalankan mantra Lumos
        MantraAbstrak mantra3 = new Lumos();
        mantra3.ucapkan();
        mantra3.efek();

        // Percobaan: membuat objek langsung dari MantraAbstrak
        // MantraAbstrak mantra4 = new MantraAbstrak("Mantra");
        // Baris di atas akan error karena MantraAbstrak adalah abstract class.
    }
}
/*
1.  Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Coba dan jelaskan errornya.
Jawab: Jika kita mencoba membuat objek secara langsung, misalnya:
       MantraAbstrak mantra = new MantraAbstrak("Mantra");
       Kode akan mengalami error karena MantraAbstrak merupakan abstract class. 
       Abstract class tidak bisa dibuat menjadi objek secara langsung. 
       Kita harus membuat objek dari class turunannya, seperti Expelliarmus atau 
       ExpectoPatronum.
2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Jawab: Abstract class digunakan sebagai class dasar bagi class turunannya. 
       Keuntungannya adalah kita bisa membuat aturan yang harus diikuti 
       oleh class turunan, seperti method efek(). Selain itu, method ucapkan() 
       bisa digunakan bersama oleh semua class turunan sehingga kode menjadi
       lebih rapi dan tidak perlu ditulis berulang kali.
*/