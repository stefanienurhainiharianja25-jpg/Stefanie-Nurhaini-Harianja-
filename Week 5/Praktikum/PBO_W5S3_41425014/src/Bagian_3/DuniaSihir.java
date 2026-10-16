/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_3;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // TAMBAHAN: Mengucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println("\n" + nama + " mengucapkan semua mantra:");

        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");

        // Menambahkan mantra Lumos
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // TAMBAHAN: Mengucapkan semua mantra sekaligus
        harry.ucapkanSemuaMantra();
    }
}/*
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
Jawab: Abstract class Mantra menjadi dasar bagi mantra Expelliarmus, 
       ExpectoPatronum, dan Lumos. Setiap mantra memiliki efek yang berbeda.
       Dengan polymorphism, class Penyihir bisa menggunakan tipe Mantra untuk 
       menyimpan dan menjalankan berbagai jenis mantra tanpa harus membuat 
       method khusus untuk setiap mantra.
2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah
kelas Penyihir? Apakah mudah? Mengapa?
Jawab: Kita cukup membuat class mantra baru yang mewarisi Mantra dan mengisi 
       method efek() sesuai fungsinya. Class Penyihir tidak perlu diubah karena 
       sudah bisa menerima semua objek yang bertipe Mantra. Jadi, penambahan 
       mantra baru menjadi lebih mudah dan kode lebih fleksibel.
*/

