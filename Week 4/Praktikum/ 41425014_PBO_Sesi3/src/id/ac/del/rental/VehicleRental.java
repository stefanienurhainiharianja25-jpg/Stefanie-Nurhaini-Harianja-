/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author USER
 */
public class VehicleRental {
 public String plateNumber;
 protected double rentalRatePerDay;
 private int rentalDays;
 double discountRate;
 public VehicleRental(String plateNumber, double rate) {
 this.plateNumber = plateNumber;
 this.rentalRatePerDay = rate;
 }
 public void setRentalDays(int days) {
 this.rentalDays = days;
 }
 public double getTotalCost() {
 return (rentalRatePerDay * rentalDays) -
 (rentalRatePerDay * rentalDays * discountRate);
 }
}


/* 
Error tersebut terjadi karena atribut rentalRatePerDay pada class VehicleRental 
menggunakan access modifier protected, sedangkan class TestRental berada pada 
package yang berbeda. Pada modul, VehicleRental berada di package id.ac.del.rental, 
sedangkan TestRental berada di package id.ac.del.test. Ketika kode v.rentalRatePerDay = -500000; 
dijalankan, program mencoba mengakses atribut protected secara langsung dari package yang berbeda 
sehingga Java menolak akses tersebut dan menghasilkan error rentalRatePerDay has protected
access in id.ac.del.rental.VehicleRental.

Hal tersebut memang merupakan bagian dari analisis yang diminta pada
modul. Baris A tidak menghasilkan error karena plateNumber memiliki
modifier public, sehingga dapat diakses dari package berbeda. Baris B
menghasilkan error karena rentalRatePerDay memiliki modifier protected.
Baris C juga menghasilkan error karena discountRate tidak memiliki
modifier sehingga bersifat default atau package-private dan hanya dapat
diakses dari package yang sama. Sementara itu, Baris D tidak menghasilkan
error karena setRentalDays() merupakan method public, meskipun secara
logika method tersebut masih memiliki kelemahan karena menerima nilai negatif 
seperti -7.

Jadi, error yang muncul pada rentalRatePerDay bukan karena kode kamu salah,
tetapi karena program memang dibuat untuk menunjukkan aturan penggunaan access 
modifier pada package yang berbeda.

1) Analisis Kompilasi dan Hak Akses (Access Modifiers)
i) Saat TestRental.java dikompilasi, Baris B dan Baris C akan menyebabkan
compile-time error karena TestRental dan VehicleRental berada pada
package yang berbeda. Baris A tidak menyebabkan error karena
plateNumber menggunakan access modifier public, sehingga dapat
diakses dari class mana pun. Baris B menyebabkan error karena
rentalRatePerDay menggunakan modifier protected. Akses protected
dari package yang berbeda tidak dapat dilakukan secara langsung oleh class
biasa seperti TestRental. Baris C juga menyebabkan error karena
discountRate tidak memiliki access modifier sehingga bersifat default atau
package-private dan hanya dapat diakses oleh class yang berada dalam
package yang sama. Sementara itu, Baris D tidak menyebabkan compile-time
error karena setRentalDays() merupakan method public, sehingga dapat
dipanggil dari package berbeda. Atribut private sendiri hanya dapat
diakses dari dalam class tempat atribut tersebut didefinisikan.

2) Kelemahan Integritas Data (Data Hiding & Validation)
i) Walaupun Baris D menggunakan method setter, yaitu setRentalDays(-7),
masih terdapat cacat logika karena method tersebut tidak melakukan validasi
terhadap nilai yang diberikan. Method pada modul hanya berisi
this.rentalDays = days;, sehingga nilai negatif seperti -7 tetap diterima
dan disimpan ke dalam atribut rentalDays. Seharusnya setter tidak hanya
digunakan untuk mengubah nilai, tetapi juga melakukan validasi agar jumlah
hari sewa tidak boleh kurang dari nol. Dengan demikian, encapsulation akan
lebih baik karena data tidak dapat diubah ke kondisi yang tidak valid melalui
method tersebut.

ii) Nilai total biaya dapat menjadi negatif karena program menerima
rentalDays dengan nilai negatif. Rumus pada getTotalCost()
menggunakan perkalian rentalRatePerDay * rentalDays, sehingga apabila
jumlah hari bernilai negatif, hasil perhitungannya juga dapat menjadi negatif.
Selain itu, rentalRatePerDay dan discountRate pada kode awal masih
dapat berpotensi digunakan dengan nilai yang tidak sesuai. Untuk menjaga
keamanan data keuangan, class VehicleRental sebaiknya direfaktor dengan
menjadikan atribut-atribut penting seperti rentalRatePerDay, rentalDays,
dan discountRate sebagai private, kemudian menyediakan setter yang
melakukan validasi. Misalnya, rentalRatePerDay harus lebih besar atau sama
dengan nol, rentalDays tidak boleh negatif, dan discountRate harus
berada pada rentang yang sesuai. Dengan cara tersebut, perubahan data
harus melewati method yang memiliki aturan validasi sehingga kemungkinan
terjadinya data corruption dapat dikurangi. Modul sendiri mengarahkan
analisis pada masalah nilai hari sewa negatif dan keamanan data keuangan
tersebut.

Contoh perbaikan setRentalDays():
public void setRentalDays(int days) {
    if (days < 0) {
        System.out.println("Jumlah hari sewa tidak boleh negatif.");
        return;
    }

    this.rentalDays = days;
}

Dengan validasi tersebut, ketika program menjalankan:
v.setRentalDays(-7);
nilai -7 tidak akan disimpan ke dalam rentalDays.

3) Penerapan Interface (Dependency Injection)
i) Untuk mendukung berbagai skema diskon seperti MemberDiscount,
FlashSaleDiscount, dan CorporateDiscount, dapat dibuat interface
Discountable sebagai kontrak bersama. Interface tersebut memiliki method
calculateDiscount(double amount). Setiap class diskon kemudian dapat
mengimplementasikan interface tersebut dengan aturan perhitungan
diskonnya masing-masing. Dengan demikian, VehicleRental tidak perlu
mengetahui secara langsung jenis diskon yang digunakan. Modul secara
khusus meminta interface Discountable dengan method
calculateDiscount(double amount).

public interface Discountable {

    double calculateDiscount(double amount);
}

ii) Method getTotalCost() pada VehicleRental kemudian dapat menerima 
parameter bertipe Discountable. Contohnya adalah:
public double getTotalCost(Discountable discount) {

    double subtotal = rentalRatePerDay * rentalDays;

    double potongan = discount.calculateDiscount(subtotal);

    return subtotal - potongan;
}

Dengan bentuk tersebut, VehicleRental tidak bergantung langsung pada
MemberDiscount, FlashSaleDiscount, atau CorporateDiscount. Object
diskon dapat dikirim dari TestRental saat program dijalankan. Misalnya jika
dibuat class MemberDiscount yang mengimplementasikan Discountable,
object tersebut dapat diberikan ke getTotalCost(). Method
calculateDiscount() yang dijalankan akan mengikuti object yang
dikirimkan. Inilah penerapan polymorphism pada runtime dan dependency
injection yang diminta pada modul.

Contoh penggunaannya:
Discountable diskon = new MemberDiscount();

double total = v.getTotalCost(diskon);

System.out.println("Total Biaya: Rp" + total);

Jadi, inti dari Bagian C adalah bahwa access modifier digunakan untuk
membatasi akses data, validation digunakan untuk menjaga agar data sewa
dan keuangan tetap valid, sedangkan interface Discountable digunakan
agar sistem dapat menerima berbagai jenis diskon tanpa harus mengubah
logika utama VehicleRental.