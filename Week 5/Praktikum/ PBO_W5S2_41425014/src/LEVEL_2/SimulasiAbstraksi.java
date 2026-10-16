/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEVEL_2;

/**
 *
 * @author USER
 */
//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    public abstract void angkutBarang(String namaBarang);
}

class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat " + namaBarang +
                " ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat " + namaBarang +
                " di bagasi belakang untuk distribusi kota.");
    }
}
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TX", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}


/* eksperimen 1
  Setelah komentar pada baris:
  KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
  dibuka, Java akan memberikan error seperti:
  KendaraanEkspedisi is abstract; cannot be instantiated
  Mengapa error?
  Karena KendaraanEkspedisi adalah abstract class, sehingga tidak boleh dibuat
  objek secara langsung menggunakan new. Abstract class hanya digunakan sebagai 
  class induk yang diwarisi oleh subclass seperti TrukBox dan MobilVan.

  eksperimen 2
  Buat class:
  class MotorKurir extends KendaraanEkspedisi {}
  Akan muncul error karena MotorKurir belum menplementasikan method abstract:
  angkutBarang(String namaBarang)
  MotorKurir wajib memilih salah satu:
  Implement angkutBarang()membuat method tersebut di MotorKurir.
  Menjadikan MotorKurir sebagai abstract class.
*/