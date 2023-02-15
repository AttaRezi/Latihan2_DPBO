//class mahasiswa meneruskan attribut manusia
public class Mahasiswa extends Human
{
	private String nim;
	private String prodi;
	private String fakultas;

	Mahasiswa() {
		// konstruktor kosong
	}

	Mahasiswa(String nim, String prodi, String fakultas) {
		// konstruktor langsung isi atribut
		this.nim = nim;
		this.prodi = prodi;
		this.fakultas = fakultas;
	}

	//setter and getter//

	public void setNim(String nim) {
		// mengeset nilai nim Mahasiswa
		this.nim = nim;
	}

	public String getNim() {
		//mengembalikan nilai nim mahasiswa
		return this.nim;
	}

	public void setProdi(String prodi) {
		// mengeset nilai prodi Mahasiswa
		this.prodi = prodi;
	}

	public String getProdi() {
		//mengembalikkan nilai prodi mahasiswa
		return this.prodi;
	}

	public void setFakultas(String fakultas) {
		// mengeset nilai fakultas Mahasiswa
		this.fakultas = fakultas;
	}

	public String getFakultas() {
		//mengembalikkan nilai fakultas mahasiswa
		return this.fakultas;
	}

}