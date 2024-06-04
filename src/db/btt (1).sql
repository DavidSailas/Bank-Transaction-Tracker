-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2024 at 11:44 AM
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
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `l_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `l_event` varchar(200) NOT NULL,
  `l_timestamp` datetime NOT NULL,
  `l_description` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`l_id`, `u_id`, `l_event`, `l_timestamp`, `l_description`) VALUES
(1, 1002, 'LOGIN_SUCCESS', '2024-06-04 15:50:02', 'Admin logged in successfully'),
(2, 1002, 'LOGIN_FAILURE', '2024-06-04 15:55:15', 'Invalid username or password'),
(3, 1002, 'LOGIN_SUCCESS', '2024-06-04 15:55:33', 'Admin logged in successfully'),
(4, 1002, 'LOGIN_SUCCESS', '2024-06-04 15:58:19', 'Admin logged in successfully'),
(5, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:34:12', 'Admin logged in successfully'),
(6, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:38:04', 'Admin logged in successfully'),
(7, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:41:56', 'Admin logged in successfully'),
(8, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:51:46', 'Admin logged in successfully'),
(9, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:54:43', 'Admin logged in successfully'),
(10, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:56:17', 'Admin logged in successfully'),
(11, 1002, 'LOGIN_FAILURE', '2024-06-04 16:57:17', 'Invalid username or password'),
(12, 1002, 'LOGIN_FAILURE', '2024-06-04 16:57:18', 'Invalid username or password'),
(13, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:57:27', 'Admin logged in successfully'),
(14, 1002, 'LOGIN_SUCCESS', '2024-06-04 16:58:14', 'Admin logged in successfully'),
(15, 1002, 'LOGIN_SUCCESS', '2024-06-04 17:07:46', 'Admin logged in successfully'),
(16, 1002, 'LOGIN_SUCCESS', '2024-06-04 17:13:42', 'Admin logged in successfully'),
(17, 1002, 'LOGIN_SUCCESS', '2024-06-04 17:20:20', 'Admin logged in successfully'),
(18, 1002, 'LOGOUT', '2024-06-04 17:20:46', 'User logged out'),
(19, 1006, 'LOGIN_SUCCESS', '2024-06-04 17:34:35', 'Admin logged in successfully'),
(20, 1006, 'LOGOUT', '2024-06-04 17:35:17', 'User logged out'),
(21, 1003, 'LOGIN_SUCCESS', '2024-06-04 17:38:45', 'User logged in successfully'),
(22, 1003, 'LOGOUT', '2024-06-04 17:39:56', 'User logged out'),
(23, 1022, 'LOGIN_SUCCESS', '2024-06-04 17:40:23', 'Admin logged in successfully'),
(24, 1022, 'LOGOUT', '2024-06-04 17:40:41', 'User logged out');

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
  `tran_type` varchar(100) NOT NULL,
  `tran_stats` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`tran_id`, `u_id`, `tran_amount`, `tran_date`, `tran_time`, `tran_type`, `tran_stats`) VALUES
(1, 1003, 1000, '2024-06-02', '20:53:07', 'DEPOSIT', 'SUCCESS'),
(2, 1029, 1000, '2024-06-02', '21:00:49', 'DEPOSIT', 'SUCCESS'),
(3, 1029, 150, '2024-06-02', '21:01:03', 'DEPOSIT', 'SUCCESS'),
(4, 1029, 150, '2024-06-02', '21:01:11', 'WITHDRAWAL', 'SUCCESS'),
(5, 1001, 100, '2024-06-02', '21:31:36', 'WITHDRAWAL', 'PENDING'),
(6, 1001, 100, '2024-06-02', '21:31:43', 'WITHDRAWAL', 'PENDING'),
(7, 1001, 100, '2024-06-03', '10:58:35', 'WITHDRAWAL', 'PENDING'),
(8, 1001, 1000, '2024-06-03', '14:54:21', 'DEPOSIT', 'SUCCESS'),
(9, 1001, 1000, '2024-06-03', '14:54:28', 'DEPOSIT', 'SUCCESS'),
(10, 1005, 10000, '2024-06-03', '15:09:29', 'DEPOSIT', 'SUCCESS'),
(11, 1005, 1000, '2024-06-03', '15:10:15', 'WITHDRAWAL', 'SUCCESS'),
(12, 1014, 100, '2024-06-03', '15:11:12', 'WITHDRAWAL', 'FAILED'),
(13, 1003, 1000, '2024-06-04', '17:38:52', 'DEPOSIT', 'SUCCESS'),
(14, 1003, 500, '2024-06-04', '17:39:39', 'WITHDRAWAL', 'SUCCESS');

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
  `u_image` varchar(100) NOT NULL,
  `u_bal` int(11) NOT NULL,
  `u_contact` varchar(20) NOT NULL,
  `u_code` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_u`
--

INSERT INTO `tbl_u` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_uname`, `u_pass`, `u_type`, `u_status`, `u_image`, `u_bal`, `u_contact`, `u_code`) VALUES
(1001, 'David Sailas', 'Villondo Romano', 'dasai@gmail.com', 'dasai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 2000, '', ''),
(1002, 'David', 'Villondo', 'ashai@gmail.com', 'ashai', '043e34a704b33e08d927e54bd45800259e2280970f0dfd01bc', 'Admin', 'Active', 'src/u_images/david.jfif', 0, '09817970638', '8c178b5ecc13fab314bf4961208e5f88e9df338471bf05d435'),
(1003, 'Ashlyn', 'Batol', 'aliya@gmail.com', 'aliya', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/ashlyn (2).jpg', 2500, '', ''),
(1004, 'Christine Jane', 'Abendan', 'kath@gmail.com', 'kath', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1005, 'Christian', 'Abendan', 'cjabendan@gmail.com', 'ike', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 9000, '', ''),
(1006, 'Sailas', 'Romano', 'sai@gmail.com', 'sai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1007, 'Mercelyn', 'Batol', 'sammy@gmail.com', 'sammy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1008, 'Angel', 'Bonutan', 'angel@gmail.com', 'angel', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1009, 'David Sailas', 'Romano', 'sailas@gmail.com', 'sailas', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1010, 'Tim Shammah', 'Romano', 'tim@gmail.com', 'tim', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1011, 'Cheryl', 'Romano', 'cheryl@gmail.com', 'cheryl', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1012, 'Brian ', 'Romano', 'brian@gmail.com', 'brian', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/brian.jpg', 0, '', ''),
(1013, 'Lovely Jireh', 'Romano', 'lovely@gmail.com', 'lovely', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1014, 'Niyumi', 'Romano', 'yumi@gmail.com', 'yumi', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1015, 'Janyn', 'Romano', 'janyn@gmail.com', 'janyn', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1016, 'Nimrod', 'Romano', 'nimrod@gmail.com', 'nimrod', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1017, 'Hannah Thea', 'Romano', 'thea@gmail.com', 'thea', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1018, 'Elijah', 'Romano', 'elay@gmail.com', 'elay', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1019, 'Venus', 'Romano', 'venus@gmail.com', 'Venus', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1020, 'Earl Justine', 'Bonutan', 'ej@gmail.com', 'ej', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1021, 'Mike David', 'Bonutan', 'estong@gmail.com', 'estong', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1022, 'David ', 'Gimenez', 'david@gmail.com', 'david', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1023, 'John Bert', 'Plameran', 'jb@gmail.com', 'jb', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1024, 'Vince Micheal', 'Bacarisas', 'bensoy@gmail.com', 'bensoy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1025, 'John Micheal', 'Dela Cuesta', 'jm@gmail.com', 'jm', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1026, 'Mark Ken ', 'Purisima', 'ken@gmail.com', 'ken', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', '', 0, '', ''),
(1027, 'Jaynu', 'Jangad', 'jaynu@gmail.com', 'jaynu', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', '', 0, '', ''),
(1028, 'Chebry', 'Romano', 'chebry@gmail.com', 'chebry', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', '', 0, '', ''),
(1029, 'Jeremy', 'Larosa', 'my@gmail.com', 'jeremy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', '', 1000, '', ''),
(1030, 'a', 'a', 'a@gmail.com', 'a', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', '', 0, '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `u_id` (`u_id`);

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
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `l_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `tran_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1031;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_u` (`u_id`);

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `tbl_transaction_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_u` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
