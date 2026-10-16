/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author USER
 */
import id.ac.del.rental.VehicleRental;
public class TestRental {
 public static void main(String[] args) {
 VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
 // Baris A
 v.plateNumber = "";
 // Baris B
 v.rentalRatePerDay = -500000;
 // Baris C
 v.discountRate = 0.20;
 // Baris D
 v.setRentalDays(-7);
 System.out.println("Total Biaya: Rp" + v.getTotalCost());
 }
}
