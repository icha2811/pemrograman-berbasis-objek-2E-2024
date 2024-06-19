/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datadosen;


class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;

    // Constructor
    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // Implementation of hitungGaji method
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    // Implementation of tampilkanInfo method
    @Override
    public void tampilkanInfo() {
        System.out.println("===== Informasi Dosen Tetap =====");
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}


    

