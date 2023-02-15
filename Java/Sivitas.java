
//class Sivitas Akademik
public class Sivitas extends Mahasiswa{

	//private attribut sivitas
	private String asalUniv;
	private String email;

	Sivitas(){
		//konstruktor kosong
	}

	Sivitas(String asalUniv, String email){
		this.asalUniv = asalUniv;
		this.email = email;
	}

	// setter getter //

	public void setAsal(String asalUniv) {
		// mengeset nilai asalUniv Mahasiswa
		this.asalUniv = asalUniv;
	}

	public String getAsal() {
		//mengembalikkan nilai asalUniv mahasiswa
		return this.asalUniv;
	}

	public void setEmail(String email) {
		// mengeset nilai email Mahasiswa
		this.email = email;
	}

	public String getEmail() {
		//mengembalikkan nilai email mahasiswa
		return this.email;
	}


}