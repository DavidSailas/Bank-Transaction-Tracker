-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 04:13 AM
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
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `tran_id` int(100) NOT NULL,
  `u_id` int(50) NOT NULL,
  `tran_amount` int(11) NOT NULL,
  `tran_date` date NOT NULL,
  `tran_time` time NOT NULL,
  `tran_type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(1002, 'David', 'Villondo', 'ashai@gmail.com', 'ashai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_images/david.jfif'),
(1003, 'Ashlyn', 'Batol', 'aliya@gmail.com', 'aliya', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/ashlyn (2).jpg'),
(1004, 'Christine Jane', 'Abendan', 'kath@gmail.com', 'kath', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1005, 'Christian', 'Abendan', 'cjabendan@gmail.com', 'ike', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1006, 'Sailas', 'Romano', 'sai@gmail.com', 'sai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', ''),
(1007, 'Mercelyn', 'Batol', 'sammy@gmail.com', 'sammy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1008, 'Angel', 'Bonutan', 'angel@gmail.com', 'angel', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1009, 'David Sailas', 'Romano', 'sailas@gmail.com', 'sailas', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', ''),
(1010, 'Tim Shammah', 'Romano', 'tim@gmail.com', 'tim', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1011, 'Cheryl', 'Romano', 'cheryl@gmail.com', 'cheryl', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1012, 'Brian ', 'Romano', 'brian@gmail.com', 'brian', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/brian.jpg'),
(1013, 'Lovely Jireh', 'Romano', 'lovely@gmail.com', 'lovely', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1014, 'Niyumi', 'Romano', 'yumi@gmail.com', 'yumi', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1015, 'Janyn', 'Romano', 'janyn@gmail.com', 'janyn', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1016, 'Nimrod', 'Romano', 'nimrod@gmail.com', 'nimrod', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1017, 'Hannah Thea', 'Romano', 'thea@gmail.com', 'thea', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1018, 'Elijah', 'Romano', 'elay@gmail.com', 'elay', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1019, 'Venus', 'Romano', 'venus@gmail.com', 'Venus', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1020, 'Earl Justine', 'Bonutan', 'ej@gmail.com', 'ej', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1021, 'Mike David', 'Bonutan', 'estong@gmail.com', 'estong', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1022, 'David ', 'Gimenez', 'david@gmail.com', 'david', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', ''),
(1023, 'John Bert', 'Plameran', 'jb@gmail.com', 'jb', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1024, 'Vince Micheal', 'Bacarisas', 'bensoy@gmail.com', 'bensoy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1025, 'John Micheal', 'Dela Cuesta', 'jm@gmail.com', 'jm', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1026, 'Mark Ken ', 'Purisima', 'ken@gmail.com', 'ken', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', ''),
(1027, 'Jaynu', 'Jangad', 'jaynu@gmail.com', 'jaynu', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', ''),
(1028, 'Chebry', 'Romano', 'chebry@gmail.com', 'chebry', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`tran_id`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tbl_u`
--
ALTER TABLE `tbl_u`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `tran_id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1029;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `tbl_transaction_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_u` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
