<?php 

include "Manusia.php";
include "Mahasiswa.php";
include "Sivitas.php";

$data = new Sivitas();

$data->setNama("Atta Arrezie Kurnia");
$data->setNim("2001408");
$data->setNik("000112333");
$data->setKelamin("Laki-Laki");
$data->setEmail("dataMahasiswanih@email.edu");
$data->setAsal("UPI");
$data->setFakultas("Depilkom");
$data->setProdi("Ilmu Komputer");

echo $data->getNama() . "<br/>";
echo $data->getNim() . "<br/>";
echo $data->getNik() . "<br/>";
echo $data->getKelamin() . "<br/>";
echo $data->getEmail() . "<br/>";
echo $data->getAsal() . "<br/>";
echo $data->getFakultas() . "<br/>";
echo $data->getProdi() . "<br/>";


 ?>