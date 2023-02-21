from Human import Human

class Mahasiswa(Human):

	#private attribute Manusia
	__nim = ""
	__prodi = ""
	__fakultas =""


	def __init__(self, nim="", prodi="", fakultas=""):
		self.__nim = nim
		self.__prodi = prodi
		self.__fakultas = fakultas
	


	#setter and getter#

	def setProdi(self, prodi):
		# mengeset nilai prodi Mahasiswa
		self.__prodi = prodi
	

	def getProdi(self):
		#mengembalikan nilai prodi mahasiswa
		return self.__prodi
	

	def setNim(self, nim):
		# mengeset nilai nim Mahasiswa
		self.__nim = nim
	

	def getNim(self):
		#mengembalikan nilai nim mahasiswa
		return self.__nim
	

	def setFakultas(self, fakultas):
		# mengeset nilai fakultas Mahasiswa
		self.__fakultas = fakultas
	

	def getFakultas(self):
		#mengembalikkan nilai fakultas mahasiswa
		return self.__fakultas
	
	
