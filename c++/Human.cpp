class Human
{
private:
	string nik;
	string nama;
	string kelamin;


public:
	Human(){
		//konstruktor kosong
	}

	Human(string nik, string nama, string kelamin){
		this.nik = nik;
		this.nama = nama;
		this.kelamin = kelamin;
	}


	//setter and getter//

	void setNama(string nama) {
		// mengeset nilai nama Mahasiswa
		this.nama = nama;
	}

	string getNama() {
		//mengembalikan nilai nama mahasiswa
		return this.nama;
	}

	void setNik(string nik) {
		// mengeset nilai nik Mahasiswa
		this.nik = nik;
	}

	string getNik() {
		//mengembalikan nilai nik mahasiswa
		return this.nik;
	}

	void setKelamin(string kelamin) {
		// mengeset nilai kelamin Mahasiswa
		this.kelamin = kelamin;
	}

	string getKelamin() {
		//mengembalikkan nilai kelamin mahasiswa
		return this.kelamin;
	}

	~Human(){
		//destruktor kosong
	}
	
};