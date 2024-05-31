-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2023 at 06:44 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `muzej`
--

-- --------------------------------------------------------

--
-- Table structure for table `eksponati_datumi_i_dogadjaji`
--

CREATE TABLE `eksponati_datumi_i_dogadjaji` (
  `ID_Eksponata` int(5) NOT NULL,
  `Naziv` varchar(30) NOT NULL,
  `Naziv_Muzeja` varchar(40) NOT NULL,
  `Drzava` varchar(20) NOT NULL,
  `Mesto_Pronalaska` varchar(30) NOT NULL,
  `Vreme_Otkrica` varchar(20) NOT NULL,
  `Opis` text NOT NULL,
  `Godina_Prve_Izlozbe` int(5) NOT NULL,
  `Datum_poslednjeg_dogadjaja` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `eksponati_datumi_i_dogadjaji`
--

INSERT INTO `eksponati_datumi_i_dogadjaji` (`ID_Eksponata`, `Naziv`, `Naziv_Muzeja`, `Drzava`, `Mesto_Pronalaska`, `Vreme_Otkrica`, `Opis`, `Godina_Prve_Izlozbe`, `Datum_poslednjeg_dogadjaja`) VALUES
(1, 'Mona Liza', 'Luvr', 'Francuska', '', 'c. 1503 - 1506', 'Slika Leonarda da Vinčija.', 1797, '2022-09-15'),
(2, 'Kamen iz Rozete', 'Britanski muzej', 'UK', 'Egipat', '196 p.n.e', 'Kamen sa urezanim natpisima za dešifriranje hijeroglifa.', 1802, '2023-03-10'),
(3, 'Apollo 11 - Mesečeva stena', 'Nacionalni muzej avijacije i astronauke ', 'SAD', 'Mesec', '1969', 'Koman stene sa Meseca donesen tokom misije Apollo 11', 1970, '2021-07-20'),
(4, 'Mehanizam sa Antikitere', 'Arheološki muzej Atena', 'Grčka', 'Ostrvo Antikitera', 'c. 100-150 pr. Kr.', 'Antički mehanizam koji je korišćen za predviđanje astronomskih događaja i kalendara. ', 1901, '2022-11-05');

-- --------------------------------------------------------

--
-- Table structure for table `korisnici`
--

CREATE TABLE `korisnici` (
  `KorisnikID` int(5) NOT NULL,
  `Ime` varchar(20) NOT NULL,
  `Prezime` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Lozinka` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `korisnici`
--

INSERT INTO `korisnici` (`KorisnikID`, `Ime`, `Prezime`, `Email`, `Lozinka`) VALUES
(1, 'Milena', 'Trifunović', 'milena123@gmail.com', '123456'),
(2, 'Lola', 'Miljković', 'lolam@gmail.com', 'l123456m'),
(3, 'Marta', 'Barili', 'mbarili@gmail.com', 'barili123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eksponati_datumi_i_dogadjaji`
--
ALTER TABLE `eksponati_datumi_i_dogadjaji`
  ADD PRIMARY KEY (`ID_Eksponata`);

--
-- Indexes for table `korisnici`
--
ALTER TABLE `korisnici`
  ADD PRIMARY KEY (`KorisnikID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `eksponati_datumi_i_dogadjaji`
--
ALTER TABLE `eksponati_datumi_i_dogadjaji`
  MODIFY `ID_Eksponata` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `korisnici`
--
ALTER TABLE `korisnici`
  MODIFY `KorisnikID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
