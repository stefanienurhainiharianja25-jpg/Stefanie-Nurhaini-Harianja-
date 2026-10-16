/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author USER
 */
public class BukuTeks extends BukuNonFiksi {
    private String mataPelajaran;
    private int tingkatPendidikan;

    public BukuTeks(String idBuku, String judul, String penulis, double harga,
                    int stok, String kategori, String mataPelajaran, int tingkatPendidikan) {
        super(idBuku, judul, penulis, harga, stok, kategori);
        this.mataPelajaran = mataPelajaran;
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getMataPelajaran() { return mataPelajaran; }
    public void setMataPelajaran(String m) { this.mataPelajaran = m; }
    public int getTingkatPendidikan() { return tingkatPendidikan; }
    public void setTingkatPendidikan(int t) { this.tingkatPendidikan = t; }

    // Overloading: nama sama, parameter beda
    public double hitungDiskon(boolean isGuru) {
        double diskon = super.hitungDiskon();   // diskon Non-Fiksi
        if (isGuru) {
            diskon += getHarga() * 0.05;        // tambahan 5%
        }
        return diskon;
    }
}