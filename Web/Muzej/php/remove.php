<?php
    include 'connection.php';

    //if($_SERVER["REQUEST_METHOD"] == "POST"){
    //    $eksponatId = $_POST["ID_Eksponata"];
    //    var_dump($eksponatId);
    //}
    if(isset($_POST['ukloni'])){
        $remove_id = $_POST['ukloni'];
    }
    $upit = $conn->query("DELETE FROM eksponati_datumi_i_dogadjaji WHERE ID_Eksponata = '$remove_id'");

    header("Location: ../php/exhibits.php?error=1");

    $conn->close();
?>