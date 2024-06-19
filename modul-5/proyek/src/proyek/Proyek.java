package proyek;

import java.util.ArrayList;
import java.util.Scanner;

public class Proyek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Karyawan Tetap");
            System.out.println("2. Tambah Karyawan Kontrak");
            System.out.println("3. Tampilkan Semua Data Karyawan");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahKaryawanTetap(daftarKaryawan, scanner);
                    break;
                case 2:
                    tambahKaryawanKontrak(daftarKaryawan, scanner);
                    break;
                case 3:
                    tampilkanDataKaryawan(daftarKaryawan);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahKaryawanTetap(ArrayList<Karyawan> daftarKaryawan, Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Posisi: ");
        String posisi = scanner.nextLine();
        System.out.print("Gaji Bulanan (dalam juta): ");
        double gajiBulanan = scanner.nextDouble() * 1_000_000;
        scanner.nextLine(); 
        
        KaryawanTetap karyawanTetap = new KaryawanTetap(nama, usia, posisi, (int) gajiBulanan);
        daftarKaryawan.add(karyawanTetap);
    }

    private static void tambahKaryawanKontrak(ArrayList<Karyawan> daftarKaryawan, Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Posisi: ");
        String posisi = scanner.nextLine();
        System.out.print("Upah Per Jam: ");
        int upahPerJam = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Jumlah Jam Kerja: ");
        int jumlahJamKerja = scanner.nextInt();
        scanner.nextLine(); 
        
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
        daftarKaryawan.add(karyawanKontrak);
    }

    private static void tampilkanDataKaryawan(ArrayList<Karyawan> daftarKaryawan) {
        System.out.println("Data Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData();
        }
    }
}
