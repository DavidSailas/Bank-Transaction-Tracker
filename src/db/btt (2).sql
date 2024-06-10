-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2024 at 01:56 PM
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
-- Table structure for table `tbl_communication`
--

CREATE TABLE `tbl_communication` (
  `c_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `c_type` varchar(225) NOT NULL,
  `c_status` varchar(225) NOT NULL,
  `c_content` text NOT NULL,
  `c_date_time` datetime NOT NULL,
  `c_from` varchar(225) NOT NULL,
  `c_to` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_communication`
--

INSERT INTO `tbl_communication` (`c_id`, `u_id`, `c_type`, `c_status`, `c_content`, `c_date_time`, `c_from`, `c_to`) VALUES
(1, 1002, 'Message', 'unread', 'sample', '2024-06-10 01:36:24', 'ashai@gmail.com', 'dasai@gmail.com');

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
(24, 1022, 'LOGOUT', '2024-06-04 17:40:41', 'User logged out'),
(25, 1002, 'LOGIN_SUCCESS', '2024-06-06 19:19:48', 'Admin logged in successfully'),
(26, 1002, 'LOGOUT', '2024-06-06 19:20:27', 'User logged out'),
(27, 1012, 'LOGIN_SUCCESS', '2024-06-06 19:21:17', 'User logged in successfully'),
(28, 1012, 'LOGOUT', '2024-06-06 19:22:01', 'User logged out'),
(29, 1022, 'LOGIN_SUCCESS', '2024-06-06 19:34:28', 'Admin logged in successfully'),
(30, 1022, 'LOGOUT', '2024-06-06 19:35:42', 'User logged out'),
(31, 1015, 'LOGIN_SUCCESS', '2024-06-06 20:05:25', 'User logged in successfully'),
(32, 1015, 'USER_DEPOSIT', '2024-06-06 20:05:44', 'Deposit of ₱10000.0 successful.'),
(33, 1015, 'LOGOUT', '2024-06-06 20:07:05', 'User logged out'),
(34, 1006, 'LOGIN_SUCCESS', '2024-06-06 20:07:15', 'Admin logged in successfully'),
(35, 1006, 'LOGOUT', '2024-06-06 20:10:27', 'User logged out'),
(36, 1009, 'LOGIN_SUCCESS', '2024-06-06 20:13:11', 'Admin logged in successfully'),
(37, 1009, 'LOGOUT', '2024-06-06 20:13:43', 'User logged out'),
(38, 1009, 'LOGIN_SUCCESS', '2024-06-06 20:16:57', 'Admin logged in successfully'),
(39, 1009, 'LOGOUT', '2024-06-06 20:17:27', 'User logged out'),
(40, 1009, 'LOGIN_SUCCESS', '2024-06-06 20:21:28', 'Admin logged in successfully'),
(41, 1014, 'LOGIN_SUCCESS', '2024-06-06 20:27:30', 'User logged in successfully'),
(42, 1014, 'USER_DEPOSIT', '2024-06-06 20:27:37', 'Deposit of ₱1000.0 successful.'),
(43, 1014, 'LOGOUT', '2024-06-06 20:34:57', 'User logged out'),
(44, 1009, 'LOGIN_SUCCESS', '2024-06-06 20:35:15', 'Admin logged in successfully'),
(45, 1022, 'LOGIN_FAILURE', '2024-06-06 20:39:28', 'Invalid username or password'),
(46, 1022, 'LOGIN_FAILURE', '2024-06-06 20:39:29', 'Invalid username or password'),
(47, 1022, 'LOGIN_FAILURE', '2024-06-06 20:39:29', 'Invalid username or password'),
(48, 1022, 'LOGIN_FAILURE', '2024-06-06 20:39:29', 'Invalid username or password'),
(49, 1022, 'LOGIN_FAILURE', '2024-06-06 20:39:29', 'Invalid username or password'),
(50, 1022, 'LOGIN_SUCCESS', '2024-06-06 20:39:37', 'Admin logged in successfully'),
(51, 1009, 'LOGOUT', '2024-06-06 20:45:59', 'User logged out'),
(52, 1009, 'LOGIN_SUCCESS', '2024-06-06 20:55:31', 'Admin logged in successfully'),
(53, 1001, 'LOGIN_SUCCESS', '2024-06-07 22:47:36', 'User logged in successfully'),
(54, 1001, 'LOGOUT', '2024-06-07 22:50:49', 'User logged out'),
(55, 1009, 'LOGIN_SUCCESS', '2024-06-07 23:09:55', 'Admin logged in successfully'),
(56, 1009, 'LOGOUT', '2024-06-07 23:10:09', 'User logged out'),
(57, 1001, 'LOGIN_SUCCESS', '2024-06-07 23:10:40', 'User logged in successfully'),
(58, 1001, 'USER_WITHDRAWAL', '2024-06-07 23:11:07', 'Withdrawal of ₱500.00 successful.'),
(59, 1001, 'LOGOUT', '2024-06-07 23:15:19', 'User logged out'),
(60, 1001, 'LOGIN_SUCCESS', '2024-06-07 23:15:37', 'User logged in successfully'),
(61, 1001, 'USER_WITHDRAWAL', '2024-06-07 23:15:52', 'Withdrawal of ₱10,000.00 successful.'),
(62, 1001, 'USER_DEPOSIT', '2024-06-07 23:17:16', 'Deposit of ₱500.00 successful.'),
(63, 1001, 'LOGOUT', '2024-06-07 23:17:46', 'User logged out'),
(64, 1016, 'LOGIN_SUCCESS', '2024-06-07 23:21:57', 'User logged in successfully'),
(65, 1016, 'USER_DEPOSIT', '2024-06-07 23:22:08', 'Deposit of ₱10,000.00 successful.'),
(66, 1016, 'USER_DEPOSIT', '2024-06-07 23:22:15', 'Deposit of ₱5,000.00 successful.'),
(67, 1016, 'USER_WITHDRAWAL', '2024-06-07 23:22:23', 'Withdrawal of ₱1,000.00 successful.'),
(68, 1016, 'USER_DEPOSIT', '2024-06-07 23:22:30', 'Deposit of ₱10,000.00 successful.'),
(69, 1017, 'LOGIN_SUCCESS', '2024-06-07 23:24:48', 'User logged in successfully'),
(70, 1017, 'USER_DEPOSIT', '2024-06-07 23:25:24', 'Deposit of ₱10,000.50 successful.'),
(71, 1017, 'LOGOUT', '2024-06-07 23:26:15', 'User logged out'),
(72, 1001, 'LOGIN_SUCCESS', '2024-06-07 23:44:42', 'User logged in successfully'),
(73, 1001, 'USER_DEPOSIT', '2024-06-07 23:45:06', 'Deposit of ₱10,000.00 successful.'),
(74, 1001, 'USER_TRANSFER', '2024-06-07 23:46:07', 'Transfer of ₱5,000.00 to account 123456789012 successful.'),
(75, 1001, 'LOGOUT', '2024-06-07 23:46:24', 'User logged out'),
(76, 1002, 'LOGIN_SUCCESS', '2024-06-07 23:46:34', 'Admin logged in successfully'),
(77, 1002, 'LOGOUT', '2024-06-07 23:46:55', 'User logged out'),
(78, 1006, 'LOGIN_SUCCESS', '2024-06-07 23:47:06', 'Admin logged in successfully'),
(79, 1006, 'LOGOUT', '2024-06-07 23:48:03', 'User logged out'),
(80, 1009, 'LOGIN_FAILURE', '2024-06-07 23:52:36', 'Invalid username or password'),
(81, 1009, 'LOGIN_SUCCESS', '2024-06-07 23:52:49', 'Admin logged in successfully'),
(82, 1009, 'LOGOUT', '2024-06-07 23:56:11', 'User logged out'),
(83, 1006, 'LOGIN_SUCCESS', '2024-06-08 00:01:14', 'Admin logged in successfully'),
(84, 1006, 'LOGOUT', '2024-06-08 00:01:53', 'User logged out'),
(85, 1002, 'LOGIN_FAILURE', '2024-06-08 21:11:29', 'Invalid username or password'),
(86, 1002, 'LOGIN_SUCCESS', '2024-06-08 21:11:39', 'Admin logged in successfully'),
(87, 1006, 'LOGIN_SUCCESS', '2024-06-08 21:17:08', 'Admin logged in successfully'),
(88, 1009, 'LOGIN_SUCCESS', '2024-06-08 21:33:33', 'Admin logged in successfully'),
(89, 1022, 'LOGIN_SUCCESS', '2024-06-08 21:55:36', 'Admin logged in successfully'),
(90, 1009, 'LOGIN_SUCCESS', '2024-06-08 22:02:21', 'Admin logged in successfully'),
(91, 1009, 'LOGOUT', '2024-06-08 22:02:46', 'User logged out'),
(92, 1002, 'LOGIN_SUCCESS', '2024-06-08 22:09:09', 'Admin logged in successfully'),
(93, 1002, 'LOGIN_SUCCESS', '2024-06-09 14:27:54', 'Admin logged in successfully'),
(94, 1002, 'LOGOUT', '2024-06-09 14:36:26', 'User logged out'),
(95, 1022, 'LOGIN_SUCCESS', '2024-06-09 16:29:22', 'Admin logged in successfully'),
(96, 1002, 'LOGIN_SUCCESS', '2024-06-09 16:33:54', 'Admin logged in successfully'),
(97, 1006, 'LOGIN_SUCCESS', '2024-06-09 16:35:11', 'Admin logged in successfully'),
(98, 1022, 'LOGIN_SUCCESS', '2024-06-09 16:40:33', 'Admin logged in successfully'),
(99, 1022, 'LOGOUT', '2024-06-09 16:40:38', 'User logged out'),
(100, 1001, 'LOGIN_SUCCESS', '2024-06-09 16:40:46', 'User logged in successfully'),
(101, 1001, 'LOGOUT', '2024-06-09 16:43:43', 'User logged out'),
(102, 1002, 'LOGIN_FAILURE', '2024-06-09 16:54:50', 'Invalid username or password'),
(103, 1002, 'LOGIN_SUCCESS', '2024-06-09 16:55:03', 'Admin logged in successfully'),
(104, 1006, 'LOGIN_SUCCESS', '2024-06-09 17:01:18', 'Admin logged in successfully'),
(105, 1022, 'LOGIN_SUCCESS', '2024-06-09 17:06:08', 'Admin logged in successfully'),
(106, 1002, 'LOGIN_SUCCESS', '2024-06-09 17:32:44', 'Admin logged in successfully'),
(107, 1002, 'LOGOUT', '2024-06-09 17:33:00', 'User logged out'),
(108, 1006, 'LOGIN_FAILURE', '2024-06-09 17:33:07', 'Invalid username or password'),
(109, 1006, 'LOGIN_SUCCESS', '2024-06-09 17:33:14', 'Admin logged in successfully'),
(110, 1001, 'LOGIN_SUCCESS', '2024-06-09 19:10:16', 'User logged in successfully'),
(111, 1001, 'LOGIN_SUCCESS', '2024-06-09 19:12:48', 'User logged in successfully'),
(112, 1002, 'LOGIN_SUCCESS', '2024-06-09 19:17:04', 'Admin logged in successfully'),
(113, 1002, 'LOGIN_SUCCESS', '2024-06-09 19:23:20', 'Admin logged in successfully'),
(114, 1002, 'LOGIN_SUCCESS', '2024-06-09 19:25:44', 'Admin logged in successfully'),
(115, 1001, 'LOGIN_SUCCESS', '2024-06-09 19:30:05', 'User logged in successfully'),
(116, 1001, 'LOGOUT', '2024-06-09 19:30:31', 'User logged out'),
(117, 1001, 'LOGIN_SUCCESS', '2024-06-09 19:30:43', 'User logged in successfully'),
(118, 1002, 'LOGIN_FAILURE', '2024-06-09 23:38:53', 'Invalid username or password'),
(119, 1002, 'LOGIN_SUCCESS', '2024-06-09 23:39:01', 'Admin logged in successfully'),
(120, 1006, 'LOGIN_SUCCESS', '2024-06-09 23:42:00', 'Admin logged in successfully'),
(121, 1009, 'LOGIN_SUCCESS', '2024-06-09 23:43:33', 'Admin logged in successfully'),
(122, 1022, 'LOGIN_SUCCESS', '2024-06-09 23:45:31', 'Admin logged in successfully'),
(123, 1002, 'LOGIN_SUCCESS', '2024-06-09 23:49:19', 'Admin logged in successfully'),
(124, 1009, 'LOGIN_SUCCESS', '2024-06-09 23:53:54', 'Admin logged in successfully'),
(125, 1006, 'LOGIN_SUCCESS', '2024-06-09 23:56:22', 'Admin logged in successfully'),
(126, 1006, 'LOGIN_SUCCESS', '2024-06-09 23:59:53', 'Admin logged in successfully'),
(127, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:03:58', 'Admin logged in successfully'),
(128, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:06:38', 'Admin logged in successfully'),
(129, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:10:43', 'Admin logged in successfully'),
(130, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:12:41', 'Admin logged in successfully'),
(131, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:23:45', 'Admin logged in successfully'),
(132, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:26:15', 'Admin logged in successfully'),
(133, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:31:55', 'Admin logged in successfully'),
(134, 1002, 'LOGIN_SUCCESS', '2024-06-10 00:44:26', 'Admin logged in successfully'),
(135, 1006, 'LOGIN_SUCCESS', '2024-06-10 00:45:30', 'Admin logged in successfully'),
(136, 1006, 'LOGIN_SUCCESS', '2024-06-10 00:47:47', 'Admin logged in successfully'),
(137, 1022, 'LOGIN_SUCCESS', '2024-06-10 00:49:28', 'Admin logged in successfully'),
(138, 1002, 'LOGIN_SUCCESS', '2024-06-10 01:35:53', 'Admin logged in successfully'),
(139, 1002, 'LOGOUT', '2024-06-10 01:38:38', 'User logged out'),
(140, 1001, 'LOGIN_SUCCESS', '2024-06-10 01:55:17', 'User logged in successfully');

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
  `tran_stats` varchar(20) NOT NULL,
  `tran_refno` varchar(20) NOT NULL,
  `tran_name` varchar(50) NOT NULL,
  `tran_no` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`tran_id`, `u_id`, `tran_amount`, `tran_date`, `tran_time`, `tran_type`, `tran_stats`, `tran_refno`, `tran_name`, `tran_no`) VALUES
(1, 1003, 1000, '2024-06-02', '20:53:07', 'DEPOSIT', 'SUCCESS', '7263849572', '', ''),
(2, 1029, 1000, '2024-06-02', '21:00:49', 'DEPOSIT', 'SUCCESS', '6354829401', '', ''),
(3, 1029, 150, '2024-06-02', '21:01:03', 'DEPOSIT', 'SUCCESS', '7283948562', '', ''),
(4, 1029, 150, '2024-06-02', '21:01:11', 'WITHDRAWAL', 'SUCCESS', '6374859203', '', ''),
(5, 1001, 100, '2024-06-02', '21:31:36', 'WITHDRAWAL', 'PENDING', '5293847566', '', ''),
(6, 1001, 100, '2024-06-02', '21:31:43', 'WITHDRAWAL', 'PENDING', '8304859274', '', ''),
(7, 1001, 100, '2024-06-03', '10:58:35', 'WITHDRAWAL', 'PENDING', '9293847569', '', ''),
(8, 1001, 1000, '2024-06-03', '14:54:21', 'DEPOSIT', 'SUCCESS', '5203849560', '', ''),
(9, 1001, 1000, '2024-06-03', '14:54:28', 'DEPOSIT', 'SUCCESS', '6482736952', '', ''),
(10, 1005, 10000, '2024-06-03', '15:09:29', 'DEPOSIT', 'SUCCESS', '3268495710', '', ''),
(11, 1005, 1000, '2024-06-03', '15:10:15', 'WITHDRAWAL', 'SUCCESS', '6104957265', '', ''),
(12, 1014, 100, '2024-06-03', '15:11:12', 'WITHDRAWAL', 'FAILED', '7384957268', '', ''),
(13, 1003, 1000, '2024-06-04', '17:38:52', 'DEPOSIT', 'SUCCESS', '3564536415', '', ''),
(14, 1003, 500, '2024-06-04', '17:39:39', 'WITHDRAWAL', 'SUCCESS', '7867411659', '', ''),
(15, 1012, 10000, '2024-06-06', '19:21:33', 'DEPOSIT', 'SUCCESS', '7377358791', '', ''),
(16, 1012, 1000, '2024-06-06', '19:21:49', 'DEPOSIT', 'SUCCESS', '8068558336', '', ''),
(17, 1015, 10000, '2024-06-06', '20:05:42', 'DEPOSIT', 'SUCCESS', '9603098825', '', ''),
(18, 1014, 1000, '2024-06-06', '20:27:35', 'DEPOSIT', 'SUCCESS', '5745972272', '', ''),
(19, 1001, 500, '2024-06-07', '23:11:06', 'WITHDRAWAL', 'SUCCESS', '7916754345', '', ''),
(20, 1001, 10000, '2024-06-07', '23:15:50', 'WITHDRAWAL', 'SUCCESS', '6917851080', '', ''),
(21, 1001, 500, '2024-06-07', '23:17:14', 'DEPOSIT', 'SUCCESS', '6453413678', '', ''),
(22, 1016, 10000, '2024-06-07', '23:22:06', 'DEPOSIT', 'SUCCESS', '5670717184', '', ''),
(23, 1016, 5000, '2024-06-07', '23:22:14', 'DEPOSIT', 'SUCCESS', '3823756570', '', ''),
(24, 1016, 1000, '2024-06-07', '23:22:22', 'WITHDRAWAL', 'SUCCESS', '6432238481', '', ''),
(25, 1016, 10000, '2024-06-07', '23:22:29', 'DEPOSIT', 'SUCCESS', '1994720454', '', ''),
(26, 1017, 10001, '2024-06-07', '23:25:22', 'DEPOSIT', 'SUCCESS', '6935828402', '', ''),
(27, 1001, 10000, '2024-06-07', '23:45:04', 'DEPOSIT', 'SUCCESS', '0849486426', '', ''),
(28, 1001, 5000, '2024-06-07', '23:46:06', 'TRANSFER', 'SUCCESS', '3903737653', 'david', '123456789012');

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
(1001, 'David Sailas', 'Villondo Romano', 'dasai@gmail.com', 'dasai', '54b444b782a52174b5504592602d5a59d6a5245a854e1b3056', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 17001, '09123456789', 'ba3253876aed6bc22d4a6ff53d8406c6ad864195ed144ab5c8'),
(1002, 'David', 'Villondo', 'ashai@gmail.com', 'ashai', '043e34a704b33e08d927e54bd45800259e2280970f0dfd01bc', 'Admin', 'Active', 'src/u_images/david.jfif', 0, '09817970638', '8c178b5ecc13fab314bf4961208e5f88e9df338471bf05d435'),
(1003, 'Ashlyn', 'Batol', 'aliya@gmail.com', 'aliya', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/ashlyn (2).jpg', 2500, '', ''),
(1004, 'Christine Jane', 'Abendan', 'kath@gmail.com', 'kath', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1005, 'Christian', 'Abendan', 'cjabendan@gmail.com', 'ike', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 9000, '', ''),
(1006, 'Sailas', 'Romano', 'sai@gmail.com', 'sai', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '09770560793', ''),
(1007, 'Mercelyn', 'Batol', 'sammy@gmail.com', 'sammy', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1008, 'Angel', 'Bonutan', 'angel@gmail.com', 'angel', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1009, 'David Sailas', 'Romano', 'sailas@gmail.com', 'sailas', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1010, 'Tim Shammah', 'Romano', 'tim@gmail.com', 'tim', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1011, 'Cheryl', 'Romano', 'cheryl@gmail.com', 'cheryl', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1012, 'Brian ', 'Romano', 'brian@gmail.com', 'brian', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_images/brian.jpg', 11000, '', ''),
(1013, 'Lovely Jireh', 'Romano', 'lovely@gmail.com', 'lovely', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1014, 'Niyumi', 'Romano', 'yumi@gmail.com', 'yumi', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 16000, '', ''),
(1015, 'Janyn', 'Romano', 'janyn@gmail.com', 'janyn', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 110000, '', ''),
(1016, 'Nimrod', 'Romano', 'nimrod@gmail.com', 'nimrod', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 24000, '', ''),
(1017, 'Hannah Thea', 'Romano', 'thea@gmail.com', 'thea', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 10001, '', ''),
(1018, 'Elijah', 'Romano', 'elay@gmail.com', 'elay', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1019, 'Venus', 'Romano', 'venus@gmail.com', 'Venus', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Active', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1020, 'Earl Justine', 'Bonutan', 'ej@gmail.com', 'ej', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Pending', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1021, 'Mike David', 'Bonutan', 'estong@gmail.com', 'estong', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'User', 'Archived', 'src/u_default/blank_pfp.jpg', 0, '', ''),
(1022, 'David ', 'Gimenez', 'david@gmail.com', 'david', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active', 'src/u_default/blank_pfp.jpg', 0, '09810567345', ''),
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
-- Indexes for table `tbl_communication`
--
ALTER TABLE `tbl_communication`
  ADD PRIMARY KEY (`c_id`),
  ADD KEY `u_id` (`u_id`);

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
-- AUTO_INCREMENT for table `tbl_communication`
--
ALTER TABLE `tbl_communication`
  MODIFY `c_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `l_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `tran_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1031;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_communication`
--
ALTER TABLE `tbl_communication`
  ADD CONSTRAINT `tbl_communication_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_u` (`u_id`);

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
