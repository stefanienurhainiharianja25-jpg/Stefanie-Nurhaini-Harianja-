/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author USER
 */
public class BukuFiksi extends Buku implements Terjual {
    private String genre;

    public BukuFiksi(String idBuku, String judul, String penulis,
                     double harga, int stok, String genre) {
        super(idBuku, judul, penulis, harga, stok); // panggil constructor Buku
        this.genre = genre;
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public double hitungDiskon() {
        if (genre.equalsIgnoreCase("Fantasi")) {
            return getHarga() * 0.10;
        }
        return getHarga() * 0.05;
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

