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

   <title>Stranica za dodavanje novih eksponata</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card border-dark mb-3" style="max-width: 35rem;">
                    <div class="card-header text-center"><h4>Unos novog eksponata i njegovih informacija</h4></div>
                        <div class="card-body text-dark text-center">
                            <p class="card-text">
                                <form action="php/addnew.php" method="post">
                                    <div class="form-group">
                                        <label for = "naziv">Naziv eksponata:</label>
                                        <input type="text" name="naziv" class = "form-control" placeholder="Unesite naziv eksponata" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "nazivMuzeja">Naziv muzeja:</label>
                                        <input type="text" name="nazivMuzeja" class="form-control" placeholder="Unesite naziv muzeja" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "drzava">Država:</label>
                                        <input type="text" name="drzava" class="form-control" placeholder="Unesite naziv države" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "mestoPro">Mesto pronalaska:</label>
                                        <input type="text" name="mestoPro" class="form-control" placeholder="Unesite mesto pronalaska" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "vreme">Vreme otkrića:</label>
                                        <input type="text" name="vreme" class="form-control" placeholder="Unesite vreme otkrića" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "opis">Opis:</label>
                                        <input type="text" name="opis" class="form-control" placeholder="Unesite opis" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "godina">Godina I izložbe:</label>
                                        <input type="text" name="godina" class="form-control" placeholder="Unesite godinu I izložbe" required>
                                    </div>
                                    <div class="form-group">
                                        <label for = "datum">Datum poslednjeg događjaja:</label>
                                        <input type="text" name="datum" class="form-control" placeholder="Unesite datum događaja" required>
                                    </div>
                                    <button type="submit" class="btn btn-primary" style="background-color:burlywood; color:black">Potvrdi</button>
                                    <button type="button" class="btn btn-link">
                                        <a href="php/exhibits.php" style="color: black">Nazad</a>
                                    </button>
                                </form>                
                            </p>
                        </div>
                        <div class="card-footer">
                            <?php 
                                if(isset($_REQUEST["success"])){
                                    if($_REQUEST["success"] == 1){
                                        echo '<div class="alert alert-success" role="alert">';
                                        echo 'Unos novog podatka je uspeo!';
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