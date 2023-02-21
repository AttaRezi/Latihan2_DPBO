from Human import Human
from Mahasiswa import Mahasiswa
from Sivitas import Sivitas

#instansi variabel
dataMahasiswa = Sivitas()

dataMahasiswa.setNama("Atta Arrezie Kurnia");
dataMahasiswa.setNim("2001408");
dataMahasiswa.setNik("000112333");
dataMahasiswa.setKelamin("Laki-Laki");
dataMahasiswa.setEmail("dataMahasiswanih@email.edu");
dataMahasiswa.setAsalUniv("UPI");
dataMahasiswa.setFakultas("Depilkom");
dataMahasiswa.setProdi("Ilmu Komputer");

print(">> Data Mahasiswa Cumlaude <<");
print("Nama        :", dataMahasiswa.getNama());
print("Nim         :", dataMahasiswa.getNim());
print("Nik         :", dataMahasiswa.getNik());
print("Kelamin     :", dataMahasiswa.getKelamin());
print("E-Mail      :", dataMahasiswa.getEmail());
print("Universitas :", dataMahasiswa.getAsalUniv());
print("Fakultas    :", dataMahasiswa.getFakultas());
print("Prodi       :", dataMahasiswa.getProdi());