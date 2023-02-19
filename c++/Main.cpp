#include <bits/stdc++.h>

#include "Sivitas.cpp"

using namespace std;


int main(int argc, char const *argv[]){
	//attribute mahasiswa
	string nim;
	string prodi;
	string fakultas;

	//atribut manusia
	string nama;
	string nik;
	string kelamin;

	//atribut sivitas
	string asal;
	string email;

	//arraylist sivitas
	list<Sivitas> llist;


	char another;
	int choice = 0; 
	//"another" mrpkn variabel yg dibutuhkan dalam proses untuk melanjutkan program
	//"choice" mrpkn variable untuk pemilihan menu


	while(1)
	{
		system("cls"); //clear cmd supaya terlihat rapih


		cout << "\t\t  ####### DATA MAHASISWA #######";
	    cout <<"\n\n                                          ";
	    cout << "\n\n";
	    cout << "\n \t\t\t 1. CREATE DATA MAHASISWA";
		cout << "\n \t\t\t 2. READ RECORD";
		cout << "\n \t\t\t 3. Exit";
		cout << "\n\n";
		cout << "\t\t\t Select Your Choice : ";

		//proses pemilihan menu
		cin >> choice;
			

		switch(choice)
		{

		//proses menu no.1
		case 1 :
			another = 'Y';

			while((another == 'Y' || another == 'y'))
			{
				system("cls"); 
					
				//proses input 
				cout << "Masukkan Nik Mahasiswa : ";
				cin >> nik;

				cout << "Masukkan Nim Mahasiswa : ";
				cin >> nim;

				cout << "Masukkan Nama Mahasiswa : ";
				cin >> nama;



				cout << "Masukkan Jenis Kelamin Mahasiswa : ";
				cin >> kelamin;

				cout << "Masukkan Prodi Yang Diambil : ";
				cin >> prodi;

				cout << "Masukkan Nama Fakultas Dari Prodi Yang Diambil : ";
				cin >> fakultas;

				cout << "Masukkan Asal Universitas Mahasiswa : ";
				cin >> asal;

				cout << "Masukkan Email UPi Mahasiswa : ";
				cin >> email;

				Sivitas temp; //set temp attribut
				temp.setNik(nik);
				temp.setNim(nim);
				temp.setNama(nama);
				temp.setKelamin(kelamin);
				temp.setProdi(prodi);
				temp.setFakultas(fakultas);
				temp.setAsal(asal);
				temp.setEmail(email);

				//insert temp object into the list
				llist.push_back(temp);

				cout << "\n Add Another Record (Y/N) ";

				//proses menanyakan apakah akan lanjut atau tidak
				cin >> another;

			}
			break;

		//proses read tabel list
		case 2 :
			system("cls");

			cout << "=== View the list in the Database ===";
			cout << "\n";

			//print list tabel mahasiswa
			for (list<Sivitas>::iterator it = llist.begin(); it != llist.end(); it++) {
				cout << "| " << it->getNik() << " | " << it->getNim() << " | " << it->getNama() << " | " << it->getKelamin() << " | " << it->getProdi() << " | " << it->getFakultas() << " | " << it->getAsal() << " | " << it->getEmail() << " |" <<'\n';
			}
			cout << "\n\n";
   			system("pause");

			break;


		//proses exit
		case 3 :
			cout << "\n\n";
	        cout << "\t\t     THANK YOU!";
	        cout << "\n\n";
	        exit(0);
		}
			
	}			

	system("pause");
	return 0;
}
