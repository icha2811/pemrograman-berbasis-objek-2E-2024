package datadosen;

import java.util.ArrayList;
import java.util.Scanner;

public class DataDosen {
    public static void main(String[] args) {
        ArrayList<Dosen> daftarDosen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Dosen Tetap");
            System.out.println("2. Tambah Dosen Tidak Tetap");
            System.out.println("3. Tampilkan Semua Data Dosen");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (pilihan == 4) {
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String namaTetap = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nikTetap = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurTetap = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelaminTetap = scanner.next().charAt(0);
                    scanner.nextLine();  // Consume newline
                    System.out.print("Gaji Pokok: ");
                    double gajiPokok = scanner.nextDouble();
                    System.out.print("Tunjangan: ");
                    double tunjangan = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    DosenTetap dosenTetap = new DosenTetap(namaTetap, nikTetap, umurTetap, jenisKelaminTetap, gajiPokok, tunjangan);
                    daftarDosen.add(dosenTetap);
                    break;

                case 2:
                    System.out.print("Nama: ");
                    String namaTidakTetap = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nikTidakTetap = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurTidakTetap = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelaminTidakTetap = scanner.next().charAt(0);
                    scanner.nextLine();  // Consume newline
                    System.out.print("Jam Mengajar: ");
                    int jamMengajar = scanner.nextInt();
                    System.out.print("Honor Per Jam: ");
                    double honorPerJam = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(namaTidakTetap, nikTidakTetap, umurTidakTetap, jenisKelaminTidakTetap, jamMengajar, honorPerJam);
                    daftarDosen.add(dosenTidakTetap);
                    break;

                case 3:
                    System.out.println("\nDaftar Dosen:");
                    for (Dosen dosen : daftarDosen) {
                        dosen.tampilkanInfo();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}
