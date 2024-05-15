-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2024 at 04:42 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `btt`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_u`
--

CREATE TABLE `tbl_u` (
  `u_id` int(10) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_uname` varchar(50) NOT NULL,
  `u_pass` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_u`
--

INSERT INTO `tbl_u` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_uname`, `u_pass`, `u_type`, `u_status`, `u_image`) VALUES
(1001, 'David', 'Romano', 'dasai@gmail.com', 'dasai', '12345678', 'Admin', 'Active', ''),
(1002, 'David', 'Villondo', 'ashai@gmail', 'ashai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', ''),
(1003, 'Ashlyn', 'Batol', 'aliya@gmail.com', 'aliya', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1004, 'Christine Jane', 'Abendan', 'kath@gmail.com', 'kath', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1005, 'Christian', 'Abendan', 'cjabendan@gmail.com', 'ike', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_u`
--
ALTER TABLE `tbl_u`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1006;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;