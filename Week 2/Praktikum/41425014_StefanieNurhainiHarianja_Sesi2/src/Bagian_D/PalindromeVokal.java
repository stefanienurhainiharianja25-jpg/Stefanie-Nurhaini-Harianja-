/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_D;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner;

public class PalindromeVokal {
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah kata
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Membalik kata yang sudah dimasukkan
        // Contoh: "katak" akan tetap menjadi "katak"
        String balik = new StringBuilder(kata).reverse().toString();

        // Mengecek apakah kata asli sama dengan kata yang sudah dibalik
        // Jika sama, berarti kata tersebut adalah palindrome
        if (kata.equalsIgnoreCase(balik)) {
            System.out.println("Kata tersebut adalah palindrome.");
        } else {
            System.out.println("Kata tersebut bukan palindrome.");
        }

        // Membuat variabel untuk menghitung jumlah huruf vokal
        // Nilai awalnya adalah 0
        int jumlahVokal = 0;

        // Melakukan perulangan untuk mengecek setiap huruf dalam kata
        for (int i = 0; i < kata.length(); i++) {

            // Mengambil satu huruf dari kata
            // Kemudian mengubahnya menjadi huruf kecil
            char huruf = Character.toLowerCase(kata.charAt(i));

            // Mengecek apakah huruf tersebut termasuk huruf vokal
            // Huruf vokal yang dicek adalah a, i, u, e, dan o
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' ||
                huruf == 'e' || huruf == 'o') {

                // Jika huruf merupakan vokal, jumlah vokal ditambah 1
                jumlahVokal++;
            }
        }

        // Menampilkan jumlah huruf vokal yang ditemukan
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }
}
