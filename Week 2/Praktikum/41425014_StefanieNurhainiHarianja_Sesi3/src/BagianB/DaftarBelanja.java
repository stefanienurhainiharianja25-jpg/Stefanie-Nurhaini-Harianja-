/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner; // Mengimpor Scanner untuk menerima input dari pengguna

public class DaftarBelanja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input

        String[] daftarBelanja = new String[100]; // Membuat array untuk menyimpan maksimal 100 item
        int jumlahItem = 0; // Menyimpan jumlah item yang ada di dalam daftar

        int pilihan; // Variabel untuk menyimpan pilihan menu pengguna

        do {
            // Menampilkan menu utama
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            pilihan = scanner.nextInt(); // Membaca pilihan pengguna
            scanner.nextLine(); // Membersihkan enter setelah nextInt()

            switch (pilihan) {

                case 1:
                    // Menambahkan item ke dalam daftar
                    if (jumlahItem < daftarBelanja.length) {
                        System.out.print("Masukkan item: ");
                        String item = scanner.nextLine(); // Membaca nama item

                        daftarBelanja[jumlahItem] = item; // Menyimpan item ke array
                        jumlahItem++; // Menambah jumlah item

                        System.out.println(item + " berhasil ditambahkan!");
                    } else {
                        System.out.println("Daftar belanja sudah penuh!");
                    }
                    break;

                case 2:
                    // Menghapus item berdasarkan posisi
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                    } else {
                        System.out.print("Hapus item pada posisi: ");
                        int posisi = scanner.nextInt(); // Membaca posisi item
                        scanner.nextLine(); // Membersihkan enter

                        // Mengecek apakah posisi yang dimasukkan valid
                        if (posisi >= 1 && posisi <= jumlahItem) {

                            String itemDihapus = daftarBelanja[posisi - 1]; // Menyimpan item yang akan dihapus

                            // Menggeser item setelahnya ke posisi sebelumnya
                            for (int i = posisi - 1; i < jumlahItem - 1; i++) {
                                daftarBelanja[i] = daftarBelanja[i + 1];
                            }

                            daftarBelanja[jumlahItem - 1] = null; // Mengosongkan posisi terakhir
                            jumlahItem--; // Mengurangi jumlah item

                            System.out.println(itemDihapus + " berhasil dihapus!");

                        } else {
                            System.out.println("Posisi tidak valid!");
                        }
                    }
                    break;

                case 3:
                    // Menampilkan semua item dalam daftar
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                    } else {
                        System.out.println("Daftar belanja:");

                        // Loop untuk menampilkan setiap item
                        for (int i = 0; i < jumlahItem; i++) {
                            System.out.println((i + 1) + ". " + daftarBelanja[i]);
                        }
                    }
                    break;

                case 4:
                    // Mencari item dalam daftar
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                    } else {
                        System.out.print("Cari item: ");
                        String cari = scanner.nextLine(); // Membaca item yang ingin dicari

                        boolean ditemukan = false; // Menandakan apakah item ditemukan

                        // Loop untuk mencari item
                        for (int i = 0; i < jumlahItem; i++) {

                            // Membandingkan item tanpa membedakan huruf besar/kecil
                            if (daftarBelanja[i].equalsIgnoreCase(cari)) {
                                System.out.println(
                                    cari + " ditemukan pada posisi " + (i + 1)
                                );
                                ditemukan = true; // Item ditemukan
                                break; // Menghentikan pencarian
                            }
                        }

                        // Jika item tidak ditemukan
                        if (!ditemukan) {
                            System.out.println(cari + " tidak ditemukan dalam daftar.");
                        }
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    // Jika pilihan tidak tersedia di menu
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5); // Program terus berjalan selama pengguna belum memilih 5

        scanner.close(); // Menutup Scanner
    }
}