<?php 

/**
 * 
 */
class Mahasiswa extends Manusia
{
	private $nim;
	private $prodi;
	private $fakultas;

	function __construct()
	{
		// code...
	}

	function setNim($nim){
		$this->nim = $nim;
	}

	function getNim(){
		return $this->nim;
	}

	function setProdi($prodi)
	{
		$this->prodi = $prodi;
	}

	function getProdi(){
		return $this->prodi;
	}

	function setFakultas($fakultas){
		$this->fakultas = $fakultas;
	}

	function getFakultas(){
		return $this->fakultas;
	}

	function __destruct(){
		
	}
}

 ?>