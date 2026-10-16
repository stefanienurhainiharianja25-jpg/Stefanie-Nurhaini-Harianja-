/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

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

        // Meminta pengguna memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        // Menampilkan hasil operasi dasar
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));

        // Menghitung sisa pembagian
        // aku menambahkan modulus ini untuk mencari sisa hasil pembagian.
        System.out.println("Modulus: " + (a % b)); 

        // Menghitung perpangkatan
        // aku menambahkan karena Math.pow()adalah fungsi bawaan Java 
        // yang digunakan untuk menghitung pangkat.
        System.out.println("Pangkat: " + Math.pow(a, b));
    }
}