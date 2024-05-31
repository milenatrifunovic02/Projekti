<?php
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

    <title>Spisak korisnika</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card border-dark mb-3">
                    <div class="card-header text-center"><h4>Prikaz eksponata, datuma i događaja</h4></div>
                        <div class="card-body text-dark text-center">
                            <p class="card-text">
                            <div class="container centertabela">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <td><h5>ID</h5></td>
                                            <td><h5>Ime</h5></td>
                                            <td><h5>Prezime</h5></td>
                                            <td><h5>Email</h5></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <?php
                                            $upit = "SELECT * FROM korisnici";
                                            $rezultat = mysqli_query($conn, $upit); 
                                            
                                            if(!$rezultat){
                                                die('Greška pri dobijanju podataka iz baze: ' . mysqli_error($conn));
                                            }
                                        ?>
                                        <?php while ($korisnik = mysqli_fetch_assoc($rezultat)) { ?>
                                            <tr>
                                                <td><?php echo $korisnik['KorisnikID']; ?></td>
                                                <td><?php echo $korisnik['Ime']; ?></td>
                                                <td><?php echo $korisnik['Prezime']; ?></td>
                                                <td><?php echo $korisnik['Email']; ?></td>
                                            </tr> 
                                        <?php } ?>
                                    </tbody>
                                </table>
                            </p>
                        </div>
                        <div class="card-footer text-center">
                            <a href="../data_page.php" class="btn btn-link" style="color: black; border: 1px solid">Nazad</a>
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