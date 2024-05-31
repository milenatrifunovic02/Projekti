<?php
    session_start();

    if(isset($_SESSION['KorisnikID'])){
        session_unset();
        session_destroy();
    }

    header("Location: ../index.php");
    exit();

    $conn->close();
?>