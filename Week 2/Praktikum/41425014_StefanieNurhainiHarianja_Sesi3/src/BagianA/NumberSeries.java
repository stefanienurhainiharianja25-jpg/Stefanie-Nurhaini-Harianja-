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

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah deret Fibonanci: ");
        int n = scanner.nextInt();
        
     //Generate Fibonanci series
     System.out.println("Deret Fibonanci:");
     int a = 0, b = 1;
     for(int i = 0; i < n; i++) {
         System.out.print(a + " ");
         int next = a + b;
         a = b;
         b = next;
     }
     System.out.println();
     
     // Chek prime number
     System.out.print("Maukkan bilangan untuk dicek prima: ");
     int num = scanner.nextInt();
     boolean isPrime = true;
     
     if(num <= 1){
         isPrime = false;
     }else {
         for(int i = 2; i <= Math.sqrt(num); i++){
             if(num % i == 0){
                 isPrime = false;
                 break;
             }
         }
     } 
     System.out.println(num + (isPrime ? " adalah bilangan prima" : "bukan bilangan prima"));
    } 
}

// Pertanyaan Pemantik
// Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
// JAWABAN: Untuk jumlah Fibonacci yang besar, kita bisa menyimpan hasil yang sudah dihitung agar tidak menghitungnya lagi dari awal. 
//          Dengan begitu, program bisa berjalan lebih cepat. 