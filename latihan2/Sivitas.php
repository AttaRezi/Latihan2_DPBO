<?php 

/**
 * 
 */
class Sivitas extends Mahasiswa
{
	private $asalUniv;
	private $email;
	
	function __construct()
	{
		// code...
	}

	function setAsal($asalUniv){
		$this->asalUniv = $asalUniv;
	}

	function getAsal(){
		return $this->asalUniv;
	}

	function setEmail($email){
		$this->email = $email;
	}

	function getEmail(){
		return $this->email;
	}

}








 ?>