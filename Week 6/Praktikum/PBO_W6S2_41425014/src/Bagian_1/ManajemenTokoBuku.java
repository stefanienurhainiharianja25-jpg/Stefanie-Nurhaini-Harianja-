/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author USER
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ManajemenTokoBuku {
    private ArrayList<Buku> daftarBuku;
    private Scanner scanner;

    public ManajemenTokoBuku() {
        daftarBuku = new ArrayList<>();
        scanner = new Scanner(System.in);
        inisialisasiData();
    }

    private void inisialisasiData() {
        // Tambahkan beberapa data buku contoh
        daftarBuku.add(new BukuFiksi("F001", "Harry Potter", "J.K. Rowling", 150000, 10, "Fantasi"));
        daftarBuku.add(new BukuNonFiksi("NF001", "Pemrograman Java", "Budi Santoso", 200000, 5, "Teknologi"));
        daftarBuku.add(new BukuTeks("T001", "Matematika SMA", "Sri Hartati", 120000, 8, "Pendidikan", "Matematika", 12));
    }

    public void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN TOKO BUKU CHAPTER ONE ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Transaksi Penjualan");
            System.out.println("5. Laporan Stok");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanSemuaBuku();
                    break;
                case 3:
                    cariBuku();
                    break;
                case 4:
                    transaksiPenjualan();
                    break;
                case 5:
                    tampilkanLaporanStok();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private void tambahBuku() {
        System.out.println("\n--- Tambah Buku Baru ---");
        System.out.println("Jenis Buku:");
        System.out.println("1. Buku Fiksi");
        System.out.println("2. Buku Non-Fiksi");
        System.out.println("3. Buku Teks");
        System.out.print("Pilihan: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        // Input data umum
        System.out.print("ID Buku: ");
        String id = scanner.nextLine();
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        // Polymorphism: membuat objek berdasarkan jenis
        switch (jenis) {
            case 1:
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                daftarBuku.add(new BukuFiksi(id, judul, penulis, harga, stok, genre));
                break;
            case 2:
                System.out.print("Kategori: ");
                String kategori = scanner.nextLine();
                daftarBuku.add(new BukuNonFiksi(id, judul, penulis, harga, stok, kategori));
                break;
            case 3:
                System.out.print("Kategori: ");
                kategori = scanner.nextLine();
                System.out.print("Mata Pelajaran: ");
                String mapel = scanner.nextLine();
                System.out.print("Tingkat Pendidikan: ");
                int tingkat = scanner.nextInt();
                scanner.nextLine(); // tambahan: bersihkan buffer
                daftarBuku.add(new BukuTeks(id, judul, penulis, harga, stok, kategori, mapel, tingkat));
                break;
        }
        System.out.println("Buku berhasil ditambahkan!");
    }

    private void transaksiPenjualan() {
        System.out.println("\n--- Transaksi Penjualan ---");
        tampilkanSemuaBuku();

        System.out.print("Masukkan ID Buku: ");
        String id = scanner.nextLine();

        Buku bukuDibeli = null;
        // Mencari buku berdasarkan ID
        for (Buku buku : daftarBuku) {
            // Asumsikan ada method getId() di class Buku
            if (buku.getIdBuku().equals(id)) {
                bukuDibeli = buku;
                break;
            }
        }

        if (bukuDibeli == null) {
            System.out.println("Buku tidak ditemukan!");
            return;
        }

        System.out.print("Jumlah beli: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        // Polymorphism: memanggil method dari interface Terjual
        if (bukuDibeli instanceof Terjual) {
            Terjual bukuTerjual = (Terjual) bukuDibeli;

            if (bukuDibeli.getStok() >= jumlah) {
                double diskon = bukuDibeli.hitungDiskon();
                double total = bukuTerjual.hitungTotalHarga(jumlah);

                // Tambahan sesuai narasi soal: Buku Teks menanyakan apakah pembeli guru
                if (bukuDibeli instanceof BukuTeks) {
                    System.out.print("Apakah pembeli guru? (y/n): ");
                    boolean isGuru = scanner.nextLine().equalsIgnoreCase("y");
                    diskon = ((BukuTeks) bukuDibeli).hitungDiskon(isGuru);
                    total = (bukuDibeli.getHarga() - diskon) * jumlah;
                }

                bukuTerjual.updateStok(jumlah);

                System.out.println("\n--- STRUK PEMBAYARAN ---");
                System.out.println("Judul: " + bukuDibeli.getJudul());
                System.out.println("Harga Satuan: Rp " + bukuDibeli.getHarga());
                System.out.println("Diskon: Rp " + diskon);
                System.out.println("Jumlah: " + jumlah);
                System.out.println("TOTAL: Rp " + total);
                System.out.println("Stok tersisa: " + bukuDibeli.getStok());
            } else {
                System.out.println("Stok tidak mencukupi! Stok tersedia: " + bukuDibeli.getStok());
            }
        }
    }

    // ===== Method di bawah ini dipanggil menu, tapi tidak ditulis di modul =====

    private void tampilkanSemuaBuku() {
        System.out.println("\n--- Daftar Semua Buku ---");
        for (Buku b : daftarBuku) {
            System.out.print("ID: " + b.getIdBuku() + " | Judul: " + b.getJudul()
                    + " | Penulis: " + b.getPenulis() + " | Harga: Rp " + b.getHarga()
                    + " | Stok: " + b.getStok());
            if (b instanceof BukuTeks) {
                System.out.println(" | Kategori: " + ((BukuTeks) b).getKategori());
            } else if (b instanceof BukuNonFiksi) {
                System.out.println(" | Kategori: " + ((BukuNonFiksi) b).getKategori());
            } else if (b instanceof BukuFiksi) {
                System.out.println(" | Genre: " + ((BukuFiksi) b).getGenre());
            }
        }
    }

    private void cariBuku() {
        System.out.print("Masukkan judul/penulis: ");
        String kunci = scanner.nextLine().toLowerCase();
        boolean ketemu = false;
        for (Buku b : daftarBuku) {
            if (b.getJudul().toLowerCase().contains(kunci)
                    || b.getPenulis().toLowerCase().contains(kunci)) {
                System.out.println(b.getIdBuku() + " | " + b.getJudul()
                        + " | " + b.getPenulis() + " | Stok: " + b.getStok());
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Buku tidak ditemukan!");
        }
    }

    private void tampilkanLaporanStok() {
        System.out.println("\n--- Laporan Stok ---");
        for (Buku b : daftarBuku) {
            System.out.println(b.getIdBuku() + " | " + b.getJudul() + " | Stok: " + b.getStok());
        }
    }
}

