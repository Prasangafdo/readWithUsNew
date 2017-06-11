-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2017 at 01:49 PM
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
('2', 'ttwewer', 'wfasf', 'sfsfa', 234, 'fasd', 1232),
('55', 'newTitle', 'qwqw', 'dsfdss', 5, 'wqwq', 123);

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `memberreg`
--

INSERT INTO `memberreg` (`FNAME`, `LNAME`, `DOB`, `ADDRESS`, `NIC`, `GENDER`, `MEMBERID`) VALUES
('Prasanga', 'Fernando', '1996-12-15', '102 Andiambalama', '960273397V', 'Male', 1),
('Nathan', 'De Lima', '1995-06-06', 'Negombo', '9509456466v', 'Male', 3);

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
-- AUTO_INCREMENT for table `bookreservation`
--
ALTER TABLE `bookreservation`
  MODIFY `ReservationID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `memberreg`
--
ALTER TABLE `memberreg`
  MODIFY `MEMBERID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `reservedbooks`
--
ALTER TABLE `reservedbooks`
  MODIFY `ReservedID` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
