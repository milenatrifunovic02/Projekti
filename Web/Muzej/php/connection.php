<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $database = "muzej";

    $conn = new mysqli($servername, $username, $password, $database);

    if ($conn->connect_error){
        die("Greška pri povezivanju sa bazom podataka: " . $conn->connect_error);
    }
?>