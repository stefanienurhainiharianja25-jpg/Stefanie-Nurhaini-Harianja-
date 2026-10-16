/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_1b;

/**
 *
 * @author USER
 */
class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private char gradeHuruf;

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        updateGradeHuruf();
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Getter Nilai Kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Setter Nilai Kuis
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0 && nilaiKuis <= 100) {
            this.nilaiKuis = nilaiKuis;
            updateGradeHuruf();
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis
                    + " (Harus antara 0 - 100)");
        }
    }

    // Getter Nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Setter Nilai UTS
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0 && nilaiUTS <= 100) {
            this.nilaiUTS = nilaiUTS;
            updateGradeHuruf();
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS
                    + " (Harus antara 0 - 100)");
        }
    }

    // Menghitung nilai akhir
    public double getNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    // Getter Grade Huruf
    public char getGradeHuruf() {
        return gradeHuruf;
    }

    // Method private untuk menghitung grade huruf
    private void updateGradeHuruf() {
        double nilaiAkhir = getNilaiAkhir();

        if (nilaiAkhir >= 85) {
            gradeHuruf = 'A';
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
        } else {
            gradeHuruf = 'E';
        }
    }

    // Cetak laporan
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + getNim());
        System.out.println("Nama       : " + getNama());
        System.out.println("Nilai Kuis : " + getNilaiKuis());
        System.out.println("Nilai UTS  : " + getNilaiUTS());
        System.out.println("Nilai Akhir: " + getNilaiAkhir());
        System.out.println("Grade Huruf: " + getGradeHuruf());
    }
}
