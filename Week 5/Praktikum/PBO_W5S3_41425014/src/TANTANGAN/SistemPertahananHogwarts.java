/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TANTANGAN;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.ArrayList;
import java.util.List;

abstract class MantraPerlindungan {
    public abstract void aktifkan();

    public abstract void nonaktifkan();
}

// Class Protego
class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Class Fidelius
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan oleh Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Class MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif di area " + area + ".");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan di area " + area + ".");
    }
}

// Class SistemPertahanan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil ditambahkan.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n=== Mengaktifkan Semua Mantra ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== Menonaktifkan Semua Mantra ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Class utama
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan sistem = new SistemPertahanan();

        Protego protego = new Protego();
        Fidelius fidelius = new Fidelius("Dumbledore");
        MantraAntiApparition antiApparition =
                new MantraAntiApparition("Hogwarts");

        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);

        sistem.aktifkanSemuaMantra();
        sistem.nonaktifkanSemuaMantra();
    }
}

/*
penjelasan singkat:
MantraPerlindungan: abstract class yang menentukan bahwa setiap mantra harus memiliki method aktifkan() dan nonaktifkan().
Protego, Fidelius, dan MantraAntiApparition: class yang memiliki cara aktivasi dan penonaktifan masing-masing.
SistemPertahanan: menyimpan banyak mantra menggunakan ArrayList, lalu menjalankan semua mantra dengan perulangan for.
Polymorphism: semua jenis mantra dapat disimpan sebagai MantraPerlindungan, tetapi setiap mantra menjalankan efeknya sendiri.
*/