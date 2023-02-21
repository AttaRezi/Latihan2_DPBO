<?php 

class Manusia{

	private $nama;
	private $nik;
	private $kelamin;

	function __construct(){
		//code...
	}

	function setNama($nama){
		$this->nama = $nama;
	}

	function getNama(){
		return $this->nama;
	}

	function setNik($nik){
		$this->nik = $nik;
	}

	function getNik(){
		return $this->nik;
	}


	function setKelamin($kelamin){
		$this->kelamin = $kelamin;
	}

	function getKelamin(){
		return $this->kelamin;
	}

	function __destruct()
	{
		// code...
	}
}


 ?>