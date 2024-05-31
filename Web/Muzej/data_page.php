<?php
    include 'php/connection.php';

    session_start();

    $korisnikId = $_SESSION['KorisnikID'];
    $upit = "SELECT Ime, Prezime FROM korisnici WHERE KorisnikID = '$korisnikId' ";
    $rezultat = $conn->query($upit);

    if($rezultat && $rezultat->num_rows === 1){
        $korisnik = $rezultat->fetch_assoc();
        $imePrezime = $korisnik['Ime'] . ' ' . $korisnik['Prezime'];
    }else{
        $imePrezime = 'Nepoznati korisnik';
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <!-- css -->
    <link rel="stylesheet" href="./css/style.css">

    <!-- bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <title>Prikaz iz baze</title>
</head>
<body>
    <div class="container">
            <div class="row">
                <div class="col-2"></div>
                <div class="col-8">
                <div class="container centrirano">
                    <div class="card border-dark md-3" style="max-width: 25rem;">
                        <div class="card-header text-center">
                            <h2>Dobrodošli!</h2>
                        </div>
                        <div class="card-body text-dark text-center">
                            <h5 class="card-title">Pozdrav, <?php echo $imePrezime; ?></h5>
                            <p class="card-text">Uspešno ste se prijavili.</p>
                            <a href="./php/users.php" class="btn btn-link" style="color: black">Korisnici</a>
                            <br>
                            <a href="./php/exhibits.php" class="btn btn-link" style="color: black">Muzejski eksponati</a>
                        </div>
                        <div class="card-footer text-center">
                            <a href="./php/logout.php" class="btn btn-link" style="color: black">Odjava</a>
                        </div>
                    </div>
                </div>
                </div>
                <div class="col-2"></div>
            </div>
        </div>
    </div>
    <script
    src = "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
    >

    </script>
</body>
</html> 
<?php
    $conn->close();
?>