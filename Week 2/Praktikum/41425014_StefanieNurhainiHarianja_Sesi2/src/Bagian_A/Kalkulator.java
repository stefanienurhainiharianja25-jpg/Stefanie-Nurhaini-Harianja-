/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/**
 *
 * @author USER
 */
//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

//pertanyaan pematik:
//Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int?
// jawaban:nilai double lebih presisi karena menyimpan desimal, sedangkan hasil casting int hanya menyimpan bilangan bulat.
//Praktek 2: Mengapa pembagian int perlu di-casting ke double?
//Jawaban: Pembagian int perlu di-casting ke double agar hasil pembagian dapat menampilkan angka desimal dan lebih akurat.
//Praktek 2: Apa risiko jika pembagi = 0?
//Jawaban: Jika pembagi = 0, maka terjadi pembagian dengan nol. Pada kode tersebut, hasilnya bisa menjadi Infinity atau -Infinity, sehingga hasil pembagian tidak valid.