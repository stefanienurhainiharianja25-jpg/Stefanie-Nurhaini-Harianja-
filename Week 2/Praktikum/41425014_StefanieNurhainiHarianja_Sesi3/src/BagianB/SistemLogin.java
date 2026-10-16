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

import java.util.Scanner; 

public class SistemLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int percobaan = 1; // Menyimpan jumlah percobaan
        boolean berhasil = false; // Menyimpan status login

        System.out.println("=== Sistem Login ===");

        while (percobaan <= 3 && !berhasil) { // Maksimal 3 percobaan

            System.out.println("Percobaan " + percobaan + ":");
            System.out.print("Username: ");
            String username = scanner.nextLine(); // Input username
            System.out.print("Password: ");
            String password = scanner.nextLine(); // Input password

            // Mengecek username harus 5-10 karakter
            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka");
            }

            // Mengecek password minimal 8 karakter dan memiliki angka
            else if (password.length() < 8 || !mengandungAngka(password)) {
                System.out.println("Login gagal! Password salah.");
            }

            // Mengecek username dan password yang benar
            else if (username.equals("admin") && password.equals("password123")) {
                System.out.println("Login berhasil!");
                berhasil = true;
            }

            // Pada percobaan ke-3, akun langsung dikunci
            else if (percobaan == 3) {
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
            }

            // Jika password salah sebelum percobaan ke-3
            else {
                System.out.println("Login gagal! Password salah.");
            }
            percobaan++; // Menambah jumlah percobaan
        }
        scanner.close(); // Menutup Scanner
    }

    // Method untuk mengecek apakah password mengandung angka
    public static boolean mengandungAngka(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true; // Ditemukan angka
            }
        }

        return false; 
    }
}
