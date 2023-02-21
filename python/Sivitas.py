from Mahasiswa import Mahasiswa

class Sivitas(Mahasiswa):
	#private attribute Manusia
	__asalUniv = ""
	__email = ""
	


	def __init__(self, asalUniv="", email=""):
		self.__asalUniv = asalUniv
		self.__email = email
		
	


	#setter and getter#

	def setEmail(self, email):
		# mengeset nilai email Mahasiswa
		self.__email = email
	

	def getEmail(self):
		#mengembalikan nilai email mahasiswa
		return self.__email
	

	def setAsalUniv(self, asalUniv):
		# mengeset nilai asalUniv Mahasiswa
		self.__asalUniv = asalUniv
	

	def getAsalUniv(self):
		#mengembalikan nilai asalUniv mahasiswa
		return self.__asalUniv
	