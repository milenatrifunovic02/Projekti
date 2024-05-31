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

    <title>Stranica za registraciju korisnika</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card border-dark mb-3" style="max-width: 25rem;">
                    <div class="card-header text-center"><h4>Stranica za registraciju</h4></div>
                    <div class="card-body text-dark text-center">
                        <p class="card-text">
                            <form action="php/registration.php" method="post">
                                <div class="form-group">
                                    <label for = "ime">Ime:</label>
                                    <input type="text" name="ime" class="form-control" placeholder="Unesite vaše ime" required>
                                </div>
                                <div class="form-group">
                                    <label for = "prezime">Prezime:</label>
                                    <input type="text" name="prezime" class="form-control" placeholder="Unesite vaše prezime" required>
                                </div>
                                <div class="form-group">
                                    <label for = "email">Email adresa:</label>
                                    <input type="email" name="email" class="form-control" placeholder="Unesite email adresu" required>
                                </div>
                                <div class="form-group">
                                    <label for = "password">Lozinka:</label>
                                    <input type="password" name="lozinka" class="form-control" placeholder="Unesite lozinku" required>
                                </div>
                                <div class="form-group">
                                    <label for = "password">Ponovite lozinku:</label>
                                    <input type="password" name="lozinkare" class="form-control" placeholder="Potvrdite lozinku" required>
                                </div>
                                <button type="submit" class="btn btn-primary" style="background-color:burlywood; color:black">Registruj se</button>
                                <br>
                                <button type="button" class="btn btn-link">
                                        <a href="index.php" style="color: black">Već imate nalog? Prijavite se</a>
                                    </button>
                            </form>
                        </p>
                    </div>
                    <div class="card-footer">
                        <?php
                            if(isset($_REQUEST["error"])){
                                if($_REQUEST["error"] == 1){
                                    echo '<div class="alert alert-danger" role="alert">';
                                    echo 'Unete šifre se ne poklapaju!';
                                    echo '</div>';
                                }else if($_REQUEST["error"] == 2){
                                    echo '<div class="alert alert-danger" role="alert">';
                                    echo 'Korisnik sa ovom email adresom već postoji!';
                                    echo '</div>';
                                }
                            }
                            if(isset($_REQUEST["success"])){
                                if($_REQUEST["success"] == 1){
                                    echo '<div class="alert alert-success" role="alert">';
                                    echo 'Registracija je uspela!';
                                    echo '</div>';            
                                }
                            }
                                
                        ?>
                    </div>
                </div>
            </div>
            <div class="col-2"></div>
        </div>
    </div>

    <script
    src = "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
    >

    </script>
</body>
</html> 