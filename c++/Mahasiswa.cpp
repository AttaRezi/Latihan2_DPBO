class Mahasiswa : public Human
{
private:
	string nim;
	string prodi;
	string fakultas;

public:
	Mahasiswa() {
		// konstruktor kosong
	}

	Mahasiswa(string nim, string prodi, string fakultas) {
		// konstruktor langsung isi atribut
		this.nim = nim;
		this.prodi = prodi;
		this.fakultas = fakultas;
	}

	//setter and getter//

	void setNim(string nim) {
		// mengeset nilai nim Mahasiswa
		this.nim = nim;
	}

	string getNim() {
		//mengembalikan nilai nim mahasiswa
		return this.nim;
	}

	void setProdi(string prodi) {
		// mengeset nilai prodi Mahasiswa
		this.prodi = prodi;
	}

	string getProdi() {
		//mengembalikkan nilai prodi mahasiswa
		return this.prodi;
	}

	void setFakultas(string fakultas) {
		// mengeset nilai fakultas Mahasiswa
		this.fakultas = fakultas;
	}

	string getFakultas() {
		//mengembalikkan nilai fakultas mahasiswa
		return this.fakultas;
	}

	~Mahasiswa(){
		//destruktor kosong
	}
	
};