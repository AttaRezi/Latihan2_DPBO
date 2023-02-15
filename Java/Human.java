public class Human
{

	//private attribute Manusia
	private String nik;
	private String nama;
	private String kelamin;

	Human(){
		//konstruktor kosong
	}

	Human(String nik, String nama, String kelamin){
		this.nik = nik;
		this.nama = nama;
		this.kelamin = kelamin;
	}


	//setter and getter//

	public void setNama(String nama) {
		// mengeset nilai nama Mahasiswa
		this.nama = nama;
	}

	public String getNama() {
		//mengembalikan nilai nama mahasiswa
		return this.nama;
	}

	public void setNik(String nik) {
		// mengeset nilai nik Mahasiswa
		this.nik = nik;
	}

	public String getNik() {
		//mengembalikan nilai nik mahasiswa
		return this.nik;
	}

	public void setKelamin(String kelamin) {
		// mengeset nilai kelamin Mahasiswa
		this.kelamin = kelamin;
	}

	public String getKelamin() {
		//mengembalikkan nilai kelamin mahasiswa
		return this.kelamin;
	}


}




