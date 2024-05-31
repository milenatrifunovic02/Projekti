-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2023 at 01:41 PM
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
-- Database: `brod`
--

-- --------------------------------------------------------

--
-- Table structure for table `brod`
--

CREATE TABLE `brod` (
  `ID` int(3) NOT NULL,
  `Namena` text NOT NULL,
  `Posada` text NOT NULL,
  `Gorivo` text NOT NULL,
  `Nosivost` int(250) NOT NULL,
  `Brzina` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brod`
--

INSERT INTO `brod` (`ID`, `Namena`, `Posada`, `Gorivo`, `Nosivost`, `Brzina`) VALUES
(1, 'PUTNICKI', 'MORNARI', 'DIZEL', 15, 20),
(2, 'TANKER', 'MORNARI', 'DIZEL', 20, 12),
(3, 'TERETNI', 'MORNARI', 'DIZEL', 26, 24),
(4, 'VOJNI', 'OFICIRI', 'N_REAKTOR', 10, 25),
(5, 'PUTNICKI', 'MORNARI', 'STRUJA', 14, 16);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brod`
--
ALTER TABLE `brod`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brod`
--
ALTER TABLE `brod`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
