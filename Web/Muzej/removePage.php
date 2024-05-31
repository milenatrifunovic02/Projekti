<?php 
    include 'php/connection.php';

    session_start();
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

    <title>Uklanjanje podatka iz baze podataka</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card border-dark mb-3" id="cardtable">
                    <div class="card-header text-center"><h4>Uklanjanje podatka iz baze</h4></div>
                        <div class="card-body text-dark text-center">
                            <p class="card-text">
                                <form method="post" action="./php/remove.php">
                                    <label for="Uklanjanje">Unesite ID eksponata koji želite da uklonite:</label>
                                    <input type="number" name="ukloni" value='<?php echo $_POST['remove_id']; ?>'>
                                    <button type="submit" class="btn btn-primary" style="background-color:burlywood; color:black">Ukloni</button>
                                    <a href="./php/exhibits.php" class="btn btn-link" style="color: black">Nazad</a>
                                </form>
                            </p>
                        </div>
                        <div class="card-footer text-center">
                        <?php 
                                if(isset($_REQUEST["error"])){
                                    if($_REQUEST["error"] == 1){
                                        echo '<div class="alert alert-danger" role="alert">';
                                        echo 'Došlo je do greške pri uklanjanju!';
                                        echo '</div>';
                                    } 
                                }
                                if(isset($_REQUEST["success"])){
                                    if($_REQUEST["success"] == 1){
                                        echo '<div class="alert alert-success" role="alert">';
                                        echo 'Uspešno ste uklonili podatak!';
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











