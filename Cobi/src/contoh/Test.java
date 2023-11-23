package contoh;

import java.util.Scanner;

public class Test {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input data dari user untuk karyawan
	        System.out.println("Masukkan data karyawan:");
	        System.out.print("NIK: ");
	        String nik = scanner.nextLine();
	        System.out.print("Nama: ");
	        String nama = scanner.nextLine();
	        System.out.print("Jabatan: ");
	        String jabatan = scanner.nextLine();
	        System.out.print("Golongan: ");
	        int golongan = scanner.nextInt();

	        // Buat objek Manager
	        Manager manager = new Manager(nik, nama, jabatan, golongan);

	        // Input data kehadiran dari user
	        System.out.print("Masukkan jumlah kehadiran: ");
	        int kehadiran = scanner.nextInt();
	        manager.setKehadiran(kehadiran);

	        // Hitung tunjangan kehadiran, jabatan, dan golongan
	        float tunjanganKehadiran = manager.tunjanganKehadiran(manager.getKehadiran());
	        float tunjanganJabatan = manager.tunjanganJabatan(manager.getJabatan());
	        float tunjanganGolongan = manager.tunjanganGolongan(manager.getGolongan());

	        // Hitung gaji total
	        float gajiTotal = manager.gajiTotal();

	        // Tampilkan hasil
	        System.out.println("\n=== Detail Karyawan ===");
	        System.out.println("NIK: " + manager.getNik());
	        System.out.println("Nama: " + manager.getNama());
	        System.out.println("Jabatan: " + manager.getJabatan());
	        System.out.println("Golongan: " + manager.getGolongan());
	        System.out.println("\n=== Tunjangan ===");
	        System.out.println("Tunjangan Kehadiran: " + tunjanganKehadiran);
	        System.out.println("Tunjangan Jabatan: " + tunjanganJabatan);
	        System.out.println("Tunjangan Golongan: " + tunjanganGolongan);
	        System.out.println("\n=== Gaji Total ===");
	        System.out.println("Gaji Total: " + gajiTotal);

	        scanner.close();
	    }
	}


