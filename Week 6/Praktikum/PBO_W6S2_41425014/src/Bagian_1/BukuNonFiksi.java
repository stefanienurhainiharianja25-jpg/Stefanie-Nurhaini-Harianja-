/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author USER
 */
public class BukuNonFiksi extends Buku implements Terjual {
    private String kategori;

    public BukuNonFiksi(String idBuku, String judul, String penulis,
                        double harga, int stok, String kategori) {
        super(idBuku, judul, penulis, harga, stok);
        this.kategori = kategori;
    }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    @Override
    public double hitungDiskon() {
        if (kategori.equalsIgnoreCase("Teknologi")) {
            return getHarga() * 0.15;
        }
        return getHarga() * 0.08;
    }

    @Override
    public void updateStok(int jumlahTerjual) {
        setStok(getStok() - jumlahTerjual);
    }

    @Override
    public double hitungTotalHarga(int jumlah) {
        return (getHarga() - hitungDiskon()) * jumlah;
    }
}