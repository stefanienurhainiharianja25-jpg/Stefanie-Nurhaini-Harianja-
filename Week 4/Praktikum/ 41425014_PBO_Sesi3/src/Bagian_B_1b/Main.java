/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_1b;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {

        StudentGrade student = new StudentGrade("11425001", "Marsha");

        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: "
                + student.getNim() + " - " + student.getNama());

        student.setNilaiKuis(110);

        student.setNilaiKuis(85);

        student.setNilaiUTS(90);

        student.cetakLaporan();
    }
}
