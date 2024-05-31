<?php

    include 'connection.php';

    session_start();

    $email = $_POST['email'];
    $password = $_POST['lozinka'];
    $lozinkaHash = $password;
    
    if(isset($_SESSION['KorisnikID'])){
        header("Location: ../data_page.php");
        exit();
    }
    
    $query = $conn->query("SELECT * FROM korisnici WHERE Email='$email' AND Lozinka='$lozinkaHash' ");

    if($query->num_rows == 1){
        $data = mysqli_fetch_object($query);
        $_SESSION['KorisnikID']=$data->KorisnikID;
        $_SESSION['Ime']=$data->Ime;
        $_SESSION['Prezime']=$data->Prezime;
        $_SESSION['Email']=$data->Email;
        
        header("Location: ../data_page.php");
    }
    else{
        header("Location: ../index.php?error=1");
    }

    $conn->close();
?>