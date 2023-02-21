class Human:

	#private attribute Manusia
	__nik = ""
	__nama = ""
	__kelamin =""


	def __init__(self, nik="", nama="", kelamin=""):
		self.__nik = nik
		self.__nama = nama
		self.__kelamin = kelamin
	


	#setter and getter#

	def setNama(self, nama):
		# mengeset nilai nama Mahasiswa
		self.__nama = nama
	

	def getNama(self):
		#mengembalikan nilai nama mahasiswa
		return self.__nama
	

	def setNik(self, nik):
		# mengeset nilai nik Mahasiswa
		self.__nik = nik
	

	def getNik(self):
		#mengembalikan nilai nik mahasiswa
		return self.__nik
	

	def setKelamin(self, kelamin):
		# mengeset nilai kelamin Mahasiswa
		self.__kelamin = kelamin
	

	def getKelamin(self):
		#mengembalikkan nilai kelamin mahasiswa
		return self.__kelamin
	