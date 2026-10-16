/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TantanganEkstra;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

class KendaraanEkspedisi {
    protected String nomorKendaraan;

    public KendaraanEkspedisi(String nomorKendaraan) {
        this.nomorKendaraan = nomorKendaraan;
    }

    public void angkutBarang() {
        System.out.println("Kendaraan mengangkut barang.");
    }
}

class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String nomorKendaraan) {
        super(nomorKendaraan);
    }

    @Override
    public void angkutBarang() {
        System.out.println(nomorKendaraan + " mengangkut barang menggunakan mobil van.");
    }
}

class TrukBox extends KendaraanEkspedisi {

    public TrukBox(String nomorKendaraan) {
        super(nomorKendaraan);
    }

    @Override
    public void angkutBarang() {
        System.out.println(nomorKendaraan + " mengangkut barang menggunakan truk box.");
    }
}

public class SimulasiTantanganPolimorfisme {

    public static void main(String[] args) {

        // Array menggunakan tipe parent
        KendaraanEkspedisi[] armada = {
            new MobilVan("VAN-01"),
            new TrukBox("TRUK-01"),
            new MobilVan("VAN-02")
        };

        // Satu perulangan dapat memanggil method dari berbagai child
        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.angkutBarang();
        }
    }
}