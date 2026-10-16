/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner; // Mengimpor Scanner untuk membaca input dari pengguna

public class GradeSystem { // Membuat class dengan nama Gradesystem
    public static void main(String[] args) { // Method utama yang pertama kali dijalankan
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input
        double[] grades = new double[5]; // Membuat array grades untuk menyimpan 5 nilai
        double total = 0; // Variabel untuk menyimpan jumlah seluruh nilai

        // Input nilai
        for(int i = 0; i < 5; i++) { // Perulangan sebanyak 5 kali untuk memasukkan nilai
            System.out.print("Masukkan nilai ke-" + (i+1) + ": "); // Menampilkan permintaan input nilai
            grades[i] = scanner.nextDouble(); // Membaca nilai yang dimasukkan dan menyimpannya ke array
            total += grades[i]; // Menambahkan nilai ke total
        }

        // Hitung rata-rata
        double average = total / 5; // Menghitung rata-rata dari total nilai dibagi 5
        System.out.println("Rata-rata nilai: " + average); // Menampilkan hasil rata-rata

        // Kategorisasi
        char grade; // Membuat variabel grade untuk menyimpan kategori nilai berupa huruf
        if(average >= 85) grade = 'A'; // Jika rata-rata minimal 85, maka mendapat grade A
        else if(average >= 70) grade = 'B'; // Jika rata-rata minimal 70, maka mendapat grade B
        else if(average >= 60) grade = 'C'; // Jika rata-rata minimal 60, maka mendapat grade C
        else if(average >= 50) grade = 'D'; // Jika rata-rata minimal 50, maka mendapat grade D
        else grade = 'E'; // Jika rata-rata di bawah 50, maka mendapat grade E

        System.out.println("Grade: " + grade); // Menampilkan grade yang diperoleh


        // Tampilkan nilai tertinggi dan terendah
        double max = grades[0]; // Menganggap nilai pertama sebagai nilai tertinggi sementara
        double min = grades[0]; // Menganggap nilai pertama sebagai nilai terendah sementara

        for(int i = 1; i < 5; i++) { // Membandingkan nilai mulai dari indeks kedua sampai kelima
            if(grades[i] > max) max = grades[i]; // Jika nilai lebih besar dari max, maka menjadi nilai tertinggi
            if(grades[i] < min) min = grades[i]; // Jika nilai lebih kecil dari min, maka menjadi nilai terendah
        }

        System.out.println("Nilai tertinggi: " + max); // Menampilkan nilai tertinggi
        System.out.println("Nilai terendah: " + min); // Menampilkan nilai terendah
    }
}

// Pertanyaan Pemantik
// JAWABAN: Pada program tersebut belum ada validasi untuk membatasi nilai 0 sampai 100. Jadi, jika pengguna memasukkan nilai lebih dari seratus 
//          program tetap menerima dan menghitungnya sebagai nilai yang valid.
// Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
// JAWABAN: Kita bisa meminta pengguna memasukkan jumlah nilai terlebih dahulu. Setelah itu, ukuran array dan perulangannya disesuaikan dengan 
//          jumlah nilai yang dimasukkan. Jadi, program tidak hanya bisa menerima 5 nilai tetapi bisa menerima jumlah nilai sesuai kebutuhan.