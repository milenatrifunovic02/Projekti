<?php 
    session_start();
    include 'connection.php';
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <!-- css -->
    <link rel="stylesheet" href="../css/style.css">

    <!-- bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <title>Prikaz muzejskih eksponata, datuma i događaja</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card border-dark mb-3" id="cardtable">
                    <div class="card-header text-center"><h4>Prikaz eksponata, datuma i događaja</h4></div>
                        <div class="card-body text-dark text-center">
                            <p class="card-text">
                            <div class="container centertabela">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <td><h5>ID</h5></td>
                                            <td><h5>Naziv</h5></td>
                                            <td><h5>Naziv muzeja</h5></td>
                                            <td><h5>Država</h5></td>
                                            <td><h5>Mesto pronalaska</h5></td>
                                            <td><h5>Vreme otkrića</h5></td>
                                            <td><h5>Opis</h5></td>
                                            <td><h5>Godina I izložbe</h5></td>
                                            <td><h5>Datum poslednjeg događaja</h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <?php
                                        $upit = "SELECT * FROM eksponati_datumi_i_dogadjaji";
                                        $rezultat = mysqli_query($conn, $upit); 
                                        
                                        if(!$rezultat){
                                            die('Greška pri dobijanju podataka iz baze: ' . mysqli_error($conn));
                                        }
                                        ?>
                                        <?php while ($eksponat = mysqli_fetch_assoc($rezultat)) { ?>
                                            <tr>
                                                <td><?php echo $eksponat['ID_Eksponata']; ?></td>
                                                <td><?php echo $eksponat['Naziv']; ?></td>
                                                <td><?php echo $eksponat['Naziv_Muzeja']; ?></td>
                                                <td><?php echo $eksponat['Drzava']; ?></td>
                                                <td><?php echo $eksponat['Mesto_Pronalaska']; ?></td>
                                                <td><?php echo $eksponat['Vreme_Otkrica']; ?></td>
                                                <td><?php echo $eksponat['Opis']; ?></td>
                                                <td><?php echo $eksponat['Godina_Prve_Izlozbe']; ?></td>
                                                <td><?php echo $eksponat['Datum_poslednjeg_dogadjaja']; ?></td>
                                            </tr> 
                                        <?php }?>
                                    </tbody>
                                </table>
                            </p>
                        </div>
                        <div class="card-footer text-center">
                            <a href="../addnew.php" class="btn btn-link" style="color: black">Dodaj</a>
                            <a href="../removePage.php" class="btn btn-link" style="color: black">Ukloni</a>
                            <a href="../data_page.php" class="btn btn-link" style="color: black">Nazad</a>
                            <?php
                                if(isset($_REQUEST["error"])){
                                    if($_REQUEST["error"] == 1){
                                        echo '<div class="alert alert-danger" role="alert">';
                                        echo 'Unos obrisan!';
                                        echo '</div>';
                                    }
                                }
                            ?>
                        </div>                    
                    </div>
                </div>
            </div>
            <div class="col-2"></div>
        </div>
    </div>

    <script src = "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js">

    </script>
</body>
</html>
<?php
    $conn->close();
?>