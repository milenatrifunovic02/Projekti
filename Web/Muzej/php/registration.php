<?php
    include 'connection.php';

   if($_SERVER['REQUEST_METHOD'] === 'POST'){
    $password = $_POST['lozinka'];
    $passwordre = $_POST['lozinkare'];

        if($password != $passwordre){
            header("Location: ../register.php?error=1");
        }else{
            $ime = $_POST['ime'];
            $prezime = $_POST['prezime'];
            $email = $_POST['email'];

            $upit = "SELECT * FROM korisnici WHERE Email = '$email'";
            $rezultat = mysqli_query($conn, $upit);

            if(mysqli_num_rows($rezultat) > 0){
                header("Location: ../register.php?error=2");
            }else {
                $lozinkaHash = md5($password);
                $insertUpit = "INSERT INTO korisnici (Ime, Prezime, Email, Lozinka)
                VALUES ('$ime', '$prezime', '$email', '$lozinkaHash')";
                $rezultat = mysqli_query($conn, $insertUpit);

                if($rezultat){
                    header("Location: ../index.php?success=1");
                }else {
                    echo "Došlo je do greške.";
                }
            }      
        }
    }    

    $conn->close();
?>