package latihan;
import java.util.Scanner;
public class Main extends Perhitungan{
	
	public static void main (String[] Args) {
		//TODO Auto-generated method stub
		
		// inisialisasi
		int angka1;
		int loop;
		Scanner input1 = new Scanner(System.in);
		Scanner loop_input = new Scanner(System.in);
		
		// data diri
		System.out.print("Nama  : Fida Van Syaeli");
		System.out.print("\nKelas : Reguler D");
		System.out.print("\nProdi : Teknik Informatika");
		System.out.println("\n============================");
		
		System.out.print("\nMasukan Perulangan : ");
		loop = loop_input.nextInt();
		
		// looping function
		for(int i=1;i<=loop;i++) {
			// input user
			System.out.print("\nMasukan Perhitungan yang ingin dilakukan : \n"
					+"1. Penambahan"
					+"\n2. Pengurangan"
					+"\n3. Perkalian"
					+"\n4. Pembagian"
					+"\nMasukan Angka : ");
			angka1 = input1.nextInt();
			
			// pengkondisian
			if (angka1 == 1) {
				penambahan();
			} else if (angka1 == 2) {
				pengurangan();
			} else if (angka1 == 3) {
				perkalian();
			} else if (angka1 == 4) {
				pembagian();
			} else {
				System.out.println("Angka yang anda masukan Salah");
			}
		}
		
	}

}
