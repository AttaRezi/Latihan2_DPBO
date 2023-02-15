import java.util.Scanner;
import java.util.ArrayList;


public class Main{
	public static void main(String[] args) {
		
		//attribute mahasiswa
		String nim;
		String prodi;
		String fakultas;

		//atribut manusia
		String nama;
		String nik;
		String kelamin;

		//atribut sivitas
		String asal;
		String email;

		//inisiasi scanner
		Scanner sc = new Scanner(System.in);

		//arraylist sivitas
		ArrayList<Sivitas> list = new ArrayList<>();


		char another;
		int choice = 0; 
		//"another" mrpkn variabel yg dibutuhkan dalam proses untuk melanjutkan program
		//"choice" mrpkn variable untuk pemilihan menu

		int mulai = 1;
		//mulai gui
		while(mulai > 0)
		{
			System.out.flush();

			System.out.println();
			System.out.println(" ####### DATA MAHASISWA #######");
	        System.out.println("\n\n                                          ");
	 
	        System.out.println("\n 1. CREATE DATA MAHASISWA");
	        System.out.println("\n 2. READ RECORD");
	        System.out.println("\n 3. Exit");
	        System.out.println("\n\n");
	        System.out.println(" Select Your Choice : ");

	        //proses pemilihan menu
			try
			{
				choice = sc.nextInt();	
			}
			catch (Exception e)
			{
				System.out.println("Menu tidak tersedia");
			}
			System.out.println("\n\n");
			

			switch(choice)
			{

			//proses menu no.1
			case 1 :
				another = 'Y';

				while((another == 'Y' || another == 'y'))
				{
					
					//proses input 
					System.out.println("Masukkan Nik Mahasiswa : ");
					nik = sc.next();

					System.out.println("Masukkan Nim Mahasiswa : ");
					nim = sc.next();

					sc.nextLine();
					System.out.println("Masukkan Nama Mahasiswa : ");
					nama = sc.nextLine();

					System.out.println("Masukkan Jenis Kelamin Mahasiswa : ");
					kelamin = sc.next();

					System.out.println("Masukkan Prodi Yang Diambil : ");
					prodi = sc.next();

					System.out.println("Masukkan Nama Fakultas Dari Prodi Yang Diambil : ");
					fakultas = sc.next();

					System.out.println("Masukkan Asal Universitas Mahasiswa : ");
					asal = sc.next();

					System.out.println("Masukkan Email UPi Mahasiswa : ");
					email = sc.next();

					Sivitas temp = new Sivitas(); //set temp attribut
					temp.setNik(nik);
					temp.setNim(nim);
					temp.setNama(nama);
					temp.setKelamin(kelamin);
					temp.setProdi(prodi);
					temp.setFakultas(fakultas);
					temp.setAsal(asal);
					temp.setEmail(email);

					//insert temp object into the list
					list.add(temp);


					System.out.println();
					System.out.println("Add Another Record (Y/N) ");

					//proses menanyakan apakah akan lanjut atau tidak
			
					try
					{
						another = sc.next().charAt(0);	
					}
					catch (Exception e)
					{
						System.out.println("Tolong masukkan Y/N!");
					}

					System.out.println("\n");

				}
				break;

			//proses read tabel list
			case 2 :

				System.out.println("=== View the list in the Database ===");
				System.out.println("\n");

				//print list tabel mahasiswa
				for (int i = 0; i < list.size(); i++) {
					System.out.println("| " + list.get(i).getNik() + " | " + list.get(i).getNim() + " | " + list.get(i).getNama() + " | " + list.get(i).getKelamin() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas() + " | " + list.get(i).getAsal() + " | " + list.get(i).getEmail() + " |");
				}
				System.out.println("\n");
				System.out.println("\n");

				break;


			//proses exit
			case 5 :
				System.out.println("\n");
	            System.out.println("   THANK YOU!");
	            System.out.println("\n");

	            mulai = 0;

	           System.exit(0);
			}
			
		}
	}
}