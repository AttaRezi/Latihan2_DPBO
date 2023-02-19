#include <iostream>
#include <string>

#include "Mahasiswa.cpp"

//Using standard namespace
using namespace std;


class Sivitas : public Mahasiswa{
	//private attribut sivitas
	private:
		string asalUniv;
		string email;

	public:
		Sivitas(){
			
		}

		Sivitas(string asalUniv, string email){
			this->asalUniv = asalUniv;
			this->email = email;
		}

		// setter getter //

		void setAsal(string asalUniv) {
			// mengeset nilai asalUniv Mahasiswa
			this->asalUniv = asalUniv;
		}

		string getAsal() {
			//mengembalikkan nilai asalUniv mahasiswa
			return this->asalUniv;
		}

		void setEmail(string email) {
			// mengeset nilai email Mahasiswa
			this->email = email;
		}

		string getEmail() {
			//mengembalikkan nilai email mahasiswa
			return this->email;
		}

		~Sivitas(){
			//destruktor kosong
		}
	
};