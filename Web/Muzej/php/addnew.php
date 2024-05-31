<?php
    include 'connection.php';

    $naziv = $_REQUEST["naziv"];
    $nazivMuzeja = $_REQUEST["nazivMuzeja"];
    $drzava = $_REQUEST["drzava"];
    $mestoPro = $_REQUEST["mestoPro"];
    $vremeOtkrica = $_REQUEST["vreme"];
    $opis = $_REQUEST["opis"];
    $godPrveIzlozbe = $_REQUEST["godina"];
    $datumDogadjaja = $_REQUEST["datum"];

    $query = $conn->query("INSERT INTO eksponati_datumi_i_dogadjaji (Naziv, Naziv_Muzeja, Drzava, Mesto_Pronalaska, Vreme_Otkrica, Opis, Godina_Prve_Izlozbe, Datum_poslednjeg_dogadjaja) 
                            VALUES ('$naziv', '$nazivMuzeja', '$drzava', '$mestoPro', '$vremeOtkrica', '$opis', '$godPrveIzlozbe', '$datumDogadjaja')");
                            
    header("Location: ../addNew.php?success=1");

    $conn->close();
?>