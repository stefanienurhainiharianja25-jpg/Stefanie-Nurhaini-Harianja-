/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta username dari pengguna
        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        // Meminta password dari pengguna
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // Mengecek apakah password memiliki angka
        boolean adaAngka = password.matches(".*\\d.*");

        // Mengecek username dan password
        if (!username.equals("admin")) {
            System.out.println("Login gagal! Username tidak valid.");
        } else if (password.length() < 6 || !adaAngka) {
            System.out.println("Login gagal! Password tidak valid.");
        } else {
            System.out.println("Login berhasil!");
        }
    }
}