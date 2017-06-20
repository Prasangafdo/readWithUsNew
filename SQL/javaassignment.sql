-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2017 at 07:12 AM
-- Server version: 5.6.26
-- PHP Version: 5.5.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaassignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('Prasanga', '1111'),
('Prasanga', '1111');

-- --------------------------------------------------------

--
-- Table structure for table `bookborrowing`
--

CREATE TABLE IF NOT EXISTS `bookborrowing` (
  `borrowID` int(11) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `bookTitle` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `edition` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `memberID` int(11) NOT NULL,
  `borrowedDate` date NOT NULL,
  `returnDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bookborrowreports`
--

CREATE TABLE IF NOT EXISTS `bookborrowreports` (
  `reportID` int(11) NOT NULL,
  `ISBN` varchar(30) NOT NULL,
  `MemberID` int(11) NOT NULL,
  `BorrowedDate` date NOT NULL,
  `ReturnedDate` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookborrowreports`
--

INSERT INTO `bookborrowreports` (`reportID`, `ISBN`, `MemberID`, `BorrowedDate`, `ReturnedDate`) VALUES
(1, '12321', 1, '2017-06-14', '2017-06-15'),
(2, '12321', 1, '2017-06-07', '2017-06-15'),
(3, '12321', 1, '2017-06-22', '2017-06-30'),
(4, '12321', 1, '2017-06-22', '2017-06-30'),
(5, '972374983sdf23', 1, '2017-06-15', '2017-06-22');

-- --------------------------------------------------------

--
-- Table structure for table `bookreg`
--

CREATE TABLE IF NOT EXISTS `bookreg` (
  `ISBN` varchar(25) NOT NULL,
  `TITLE` varchar(30) NOT NULL,
  `AUTHOR` varchar(40) NOT NULL,
  `PUBLISHER` varchar(20) NOT NULL,
  `EDITION` int(11) NOT NULL,
  `CATEGORY` varchar(25) NOT NULL,
  `YEAR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookreg`
--

INSERT INTO `bookreg` (`ISBN`, `TITLE`, `AUTHOR`, `PUBLISHER`, `EDITION`, `CATEGORY`, `YEAR`) VALUES
('12321', 'Updated book', 'Auth up', 'Publisher up', 2, 'Classic', 2000),
('12332131vsd', 'New Title', 'Auth', 'ddd', 123, 'cat', 2003),
('972374983sdf23', 'The Merchant of Venice', 'William Shakespeare ', 'Dan Moses Schreier', 1, 'romantic comedy', 1599);

-- --------------------------------------------------------

--
-- Table structure for table `bookreservation`
--

CREATE TABLE IF NOT EXISTS `bookreservation` (
  `ReservationID` int(11) NOT NULL,
  `MemberID` int(11) NOT NULL,
  `ISBN` varchar(25) NOT NULL,
  `RESERVEDDATE` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bookreservationreports`
--

CREATE TABLE IF NOT EXISTS `bookreservationreports` (
  `reportID` int(11) NOT NULL,
  `ISBN` varchar(30) NOT NULL,
  `MemberID` int(11) NOT NULL,
  `ReservedDate` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookreservationreports`
--

INSERT INTO `bookreservationreports` (`reportID`, `ISBN`, `MemberID`, `ReservedDate`) VALUES
(1, '', 1, '2017-06-22'),
(2, '12321', 1, '2017-06-14'),
(3, '12321', 1, '2017-06-13'),
(4, '12321', 1, '2017-06-20'),
(5, '12321', 1, '2017-06-20'),
(6, '12321', 1, '2017-06-20');

-- --------------------------------------------------------

--
-- Table structure for table `finerecords`
--

CREATE TABLE IF NOT EXISTS `finerecords` (
  `memberID` int(11) NOT NULL,
  `ISBN` varchar(30) NOT NULL,
  `Fines` int(11) NOT NULL,
  `FineID` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finerecords`
--

INSERT INTO `finerecords` (`memberID`, `ISBN`, `Fines`, `FineID`) VALUES
(1, '12321', 70, 5),
(1, '972374983sdf23', 20, 6);

-- --------------------------------------------------------

--
-- Table structure for table `memberreg`
--

CREATE TABLE IF NOT EXISTS `memberreg` (
  `FNAME` varchar(20) NOT NULL,
  `LNAME` varchar(20) NOT NULL,
  `DOB` date NOT NULL,
  `ADDRESS` varchar(40) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `GENDER` varchar(6) NOT NULL,
  `MEMBERID` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `memberreg`
--

INSERT INTO `memberreg` (`FNAME`, `LNAME`, `DOB`, `ADDRESS`, `NIC`, `GENDER`, `MEMBERID`) VALUES
('Prasanga', 'Fernando', '1996-12-15', '102 Andiambalama', '960273397V', 'Male', 1);

-- --------------------------------------------------------

--
-- Table structure for table `reservedbooks`
--

CREATE TABLE IF NOT EXISTS `reservedbooks` (
  `ReservedID` int(11) NOT NULL,
  `ISBN` varchar(25) NOT NULL,
  `BOOKTITLE` varchar(30) NOT NULL,
  `AUTHOR` varchar(40) NOT NULL,
  `PUBLISHER` varchar(20) NOT NULL,
  `EDITION` varchar(10) NOT NULL,
  `CATEGORY` varchar(15) NOT NULL,
  `YEAR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookborrowing`
--
ALTER TABLE `bookborrowing`
  ADD PRIMARY KEY (`borrowID`);

--
-- Indexes for table `bookborrowreports`
--
ALTER TABLE `bookborrowreports`
  ADD PRIMARY KEY (`reportID`);

--
-- Indexes for table `bookreg`
--
ALTER TABLE `bookreg`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indexes for table `bookreservation`
--
ALTER TABLE `bookreservation`
  ADD PRIMARY KEY (`ReservationID`);

--
-- Indexes for table `bookreservationreports`
--
ALTER TABLE `bookreservationreports`
  ADD PRIMARY KEY (`reportID`);

--
-- Indexes for table `finerecords`
--
ALTER TABLE `finerecords`
  ADD PRIMARY KEY (`FineID`);

--
-- Indexes for table `memberreg`
--
ALTER TABLE `memberreg`
  ADD PRIMARY KEY (`MEMBERID`);

--
-- Indexes for table `reservedbooks`
--
ALTER TABLE `reservedbooks`
  ADD PRIMARY KEY (`ReservedID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookborrowing`
--
ALTER TABLE `bookborrowing`
  MODIFY `borrowID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bookborrowreports`
--
ALTER TABLE `bookborrowreports`
  MODIFY `reportID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `bookreservation`
--
ALTER TABLE `bookreservation`
  MODIFY `ReservationID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bookreservationreports`
--
ALTER TABLE `bookreservationreports`
  MODIFY `reportID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `finerecords`
--
ALTER TABLE `finerecords`
  MODIFY `FineID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `memberreg`
--
ALTER TABLE `memberreg`
  MODIFY `MEMBERID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `reservedbooks`
--
ALTER TABLE `reservedbooks`
  MODIFY `ReservedID` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
