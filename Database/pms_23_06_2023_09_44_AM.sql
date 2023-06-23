-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2023 at 06:13 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pms`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` bigint(20) NOT NULL,
  `body` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `post_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `menusetting`
--

CREATE TABLE `menusetting` (
  `id` int(12) NOT NULL,
  `menucode` varchar(10) NOT NULL,
  `menuname` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `menusetting`
--

INSERT INTO `menusetting` (`id`, `menucode`, `menuname`) VALUES
(8, '004', 'prs-project'),
(10, '006', 'prs-project'),
(11, '007', 'prs-project'),
(12, '007', 'prs-project');

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `id` bigint(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `prs_coresprofobj`
--

CREATE TABLE `prs_coresprofobj` (
  `id` int(10) NOT NULL,
  `usercode` varchar(256) NOT NULL,
  `correspondence` varchar(256) NOT NULL,
  `profile` varchar(256) NOT NULL,
  `objective` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prs_coresprofobj`
--

INSERT INTO `prs_coresprofobj` (`id`, `usercode`, `correspondence`, `profile`, `objective`) VALUES
(9, '1', '1/67, 7th Street, Marthandam', 'A highly skilled and detail-oriented software developer with 7 years of experience in full-stack web development. ', 'To secure a challenging software developer position in a dynamic organization where I can leverage my technical expertise and passion for coding to contribute to the development of innovative software solutions. '),
(12, '3', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `prs_education`
--

CREATE TABLE `prs_education` (
  `id` int(10) NOT NULL,
  `usercode` varchar(266) NOT NULL,
  `ug` varchar(266) NOT NULL,
  `pg` varchar(266) NOT NULL,
  `hsc` varchar(266) NOT NULL,
  `sslc` varchar(266) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prs_education`
--

INSERT INTO `prs_education` (`id`, `usercode`, `ug`, `pg`, `hsc`, `sslc`) VALUES
(8, '3', '1999', '2005', '1998', '1996'),
(9, '3', '2001', '2005', '1998', '1996'),
(10, '3', '2001', '2005', '1998', '1996');

-- --------------------------------------------------------

--
-- Table structure for table `prs_experience`
--

CREATE TABLE `prs_experience` (
  `id` int(10) NOT NULL,
  `usercode` varchar(266) NOT NULL,
  `companyname` varchar(266) NOT NULL,
  `fromdate` varchar(266) NOT NULL,
  `todate` varchar(266) NOT NULL,
  `designation` varchar(266) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prs_experience`
--

INSERT INTO `prs_experience` (`id`, `usercode`, `companyname`, `fromdate`, `todate`, `designation`) VALUES
(7, '1', 'XYZ Technologies', '25-04-2009', '09-09-2015', 'Software Developer'),
(8, '3', 'CTS', '4-05-2022', '9-10-2022', 'PAT'),
(9, '3', 'Cognizantt', '4-05-2022', '9-10-2023', 'PAT'),
(11, '4', 'TCS', '12345678', '9-10-2022', 'PAT');

-- --------------------------------------------------------

--
-- Table structure for table `prs_project`
--

CREATE TABLE `prs_project` (
  `id` int(10) NOT NULL,
  `usercode` varchar(266) NOT NULL,
  `pname` varchar(266) NOT NULL,
  `techused` varchar(266) NOT NULL,
  `description` varchar(266) NOT NULL,
  `responsibility` varchar(266) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prs_project`
--

INSERT INTO `prs_project` (`id`, `usercode`, `pname`, `techused`, `description`, `responsibility`) VALUES
(6, '1', 'E-commerce Website Optimization', 'Content Delivery Network (CDN)', 'Developed and implemented performance optimizations for a large-scale e-commerce website, resulting in significant improvements in page load times and overall user experience. ', 'Performance Analyst'),
(7, '3', 'IDP rpoject', 'spring', '', ''),
(8, '4', 'IDP', 'spring,React', '', ''),
(10, '4', 'IDP', 'spring,React,spring security', 'all about the implementation of spring concepts and react', '');

-- --------------------------------------------------------

--
-- Table structure for table `prs_technical`
--

CREATE TABLE `prs_technical` (
  `id` int(10) NOT NULL,
  `usercode` varchar(266) NOT NULL,
  `type` varchar(266) NOT NULL,
  `description` varchar(266) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prs_technical`
--

INSERT INTO `prs_technical` (`id`, `usercode`, `type`, `description`) VALUES
(6, '1', ' Programming languages', 'Proficient in programming languages: Java, JavaScript, and Python.'),
(7, '1', ' Front-end development', 'Strong experience with front-end development using HTML, CSS, and JavaScript frameworks such as React.js.');

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL,
  `name` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'admin'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `submenusetting`
--

CREATE TABLE `submenusetting` (
  `id` int(12) NOT NULL,
  `menucode` varchar(10) NOT NULL,
  `submenuname` varchar(500) NOT NULL,
  `url` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `submenusetting`
--

INSERT INTO `submenusetting` (`id`, `menucode`, `submenuname`, `url`) VALUES
(2, '001', 'Correspondence Profile ', 'prs_coresprofobj.jsp?option=view&id=0'),
(3, '001', 'Education Setting', 'prs_education.jsp?option=view&id=0'),
(5, '001', 'Technical Expertise', 'prs_technical.jsp?option=view&id=0'),
(6, '001', 'Project Details', 'prs_project.jsp?option=view&id=0'),
(10, '002', 'okijhbgb', 'erfgf'),
(11, '002', 'okijhbgb', 'erfgf');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `name`, `password`, `username`) VALUES
(1, 'rufina25@gmail.com', 'rufina', '$2a$10$gsNpjXxA.WuXh7PCx8sag.HxSlP8oN0kHk5w5g2iLeqJ9lm4g4.lK', 'rufina01'),
(2, 'hari@gmail.com', NULL, '$2a$10$DC/NrR8bTB6AZA16e.IHreotezS2Adv7I0hJxgukYIzntooF9Y0K.', 'hari'),
(3, 'rufina252@gmail.com', NULL, '$2a$10$2i8w2/RgVgxFsYCrQAR2teLeIkXHHhn/hR0xyzLSHfKn.PUyP9YRG', 'rufina');

-- --------------------------------------------------------

--
-- Table structure for table `usersetting`
--

CREATE TABLE `usersetting` (
  `id` int(12) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `mobileno` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usersetting`
--

INSERT INTO `usersetting` (`id`, `username`, `password`, `email`, `mobileno`) VALUES
(38, 'ffh', ' nmkk', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKh4c7lvsc298whoyd4w9ta25cr` (`post_id`);

--
-- Indexes for table `menusetting`
--
ALTER TABLE `menusetting`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKmchce1gm7f6otpphxd6ixsdps` (`title`),
  ADD KEY `FKijnwr3brs8vaosl80jg9rp7uc` (`category_id`);

--
-- Indexes for table `prs_coresprofobj`
--
ALTER TABLE `prs_coresprofobj`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prs_education`
--
ALTER TABLE `prs_education`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prs_experience`
--
ALTER TABLE `prs_experience`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prs_project`
--
ALTER TABLE `prs_project`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prs_technical`
--
ALTER TABLE `prs_technical`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `submenusetting`
--
ALTER TABLE `submenusetting`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  ADD UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`);

--
-- Indexes for table `usersetting`
--
ALTER TABLE `usersetting`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users_roles`
--
ALTER TABLE `users_roles`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKj6m8fwv7oqv74fcehir1a9ffy` (`role_id`);

--
-- Indexes for table `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `menusetting`
--
ALTER TABLE `menusetting`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `prs_coresprofobj`
--
ALTER TABLE `prs_coresprofobj`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `prs_education`
--
ALTER TABLE `prs_education`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `prs_experience`
--
ALTER TABLE `prs_experience`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `prs_project`
--
ALTER TABLE `prs_project`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `prs_technical`
--
ALTER TABLE `prs_technical`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `submenusetting`
--
ALTER TABLE `submenusetting`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `usersetting`
--
ALTER TABLE `usersetting`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `FKh4c7lvsc298whoyd4w9ta25cr` FOREIGN KEY (`post_id`) REFERENCES `posts` (`id`);

--
-- Constraints for table `posts`
--
ALTER TABLE `posts`
  ADD CONSTRAINT `FKijnwr3brs8vaosl80jg9rp7uc` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`);

--
-- Constraints for table `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FK2o0jvgh89lemvvo17cbqvdxaa` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKj6m8fwv7oqv74fcehir1a9ffy` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`);

--
-- Constraints for table `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `FKh8ciramu9cc9q3qcqiv4ue8a6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
