-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Хост: localhost
-- Время создания: Янв 31 2025 г., 11:47
-- Версия сервера: 5.6.20-log
-- Версия PHP: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `kafedra`
--
CREATE DATABASE IF NOT EXISTS `kafedra` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `kafedra`;

-- --------------------------------------------------------

--
-- Структура таблицы `books`
--

CREATE TABLE IF NOT EXISTS `books` (
`id` int(10) unsigned NOT NULL,
  `name` varchar(25) NOT NULL,
  `author` varchar(25) NOT NULL,
  `category` varchar(25) NOT NULL,
  `year` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Дамп данных таблицы `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `category`, `year`, `price`) VALUES
(1, '123', '123', '123', 123, 123),
(2, '2', '2', '2', 2, 2),
(3, 'gh', 'gfh', 'fgh', 54, 45);

-- --------------------------------------------------------

--
-- Структура таблицы `conference`
--

CREATE TABLE IF NOT EXISTS `conference` (
  `teacher` text COLLATE utf8_bin,
  `student` text COLLATE utf8_bin,
`AI` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=6 ;

--
-- Дамп данных таблицы `conference`
--

INSERT INTO `conference` (`teacher`, `student`, `AI`) VALUES
('23', '2', 2),
('gf', 'hkg', 3),
('1', '1', 4),
('4', '4', 5);

-- --------------------------------------------------------

--
-- Структура таблицы `groups`
--

CREATE TABLE IF NOT EXISTS `groups` (
  `smoker` text COLLATE utf8_bin,
  `teacher` text COLLATE utf8_bin,
  `weight` double DEFAULT NULL,
  `textbook_plant` text COLLATE utf8_bin,
`AI` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=15 ;

--
-- Дамп данных таблицы `groups`
--

INSERT INTO `groups` (`smoker`, `teacher`, `weight`, `textbook_plant`, `AI`) VALUES
('1', '1', 1, '1', 1),
('1', '1', 1, '1', 2),
('2', '2', 2, '2', 3),
('login', 'user', 50, 'Adres', 4),
('login', 'user', 50, 'Adres', 5),
('turok', 'teacher', 50, 'textbook_plant', 6),
('hfd', 'hdf', 4684, 'dsg', 7),
('hfd', 'hdf', 4684, 'dsg', 8),
('thrt', 'thr', NULL, 'rr', 14);

-- --------------------------------------------------------

--
-- Структура таблицы `kafedra`
--

CREATE TABLE IF NOT EXISTS `kafedra` (
  `name` text COLLATE utf8_bin,
  `groups` text COLLATE utf8_bin,
  `textbook_plants` text COLLATE utf8_bin,
`AI` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=8 ;

--
-- Дамп данных таблицы `kafedra`
--

INSERT INTO `kafedra` (`name`, `groups`, `textbook_plants`, `AI`) VALUES
('1', '1', '1', 1),
('2', '2', '2', 2),
('3', '3', '3', 3),
('name', 'groop', 'textbook_plant', 4),
('name', 'groop', 'textbook_plant', 5),
('names', 'groops', 'textbook_plants', 6),
('name', 'groop', 'textbook_plant', 7);

-- --------------------------------------------------------

--
-- Структура таблицы `smoker`
--

CREATE TABLE IF NOT EXISTS `smoker` (
  `groups` text COLLATE utf8_bin,
  `weight` double DEFAULT NULL,
  `textbook_plant` text COLLATE utf8_bin,
  `Name_mother_father` text COLLATE utf8_bin,
`AI` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=6 ;

--
-- Дамп данных таблицы `smoker`
--

INSERT INTO `smoker` (`groups`, `weight`, `textbook_plant`, `Name_mother_father`, `AI`) VALUES
('1', 1, '1', '1', 1),
('1', 1, '1', '1', 2),
('2', 2, '2', '2', 3),
('login', 50.5, 'Adres', 'name-mother-father', 4),
('groop', 50.5, 'textbook_plant', 'name-mother-father', 5);

-- --------------------------------------------------------

--
-- Структура таблицы `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `smoker` text COLLATE utf8_bin,
  `teacher` text COLLATE utf8_bin,
  `conference` text COLLATE utf8_bin,
  `mother_father` text COLLATE utf8_bin,
`AI` bigint(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=5 ;

--
-- Дамп данных таблицы `student`
--

INSERT INTO `student` (`smoker`, `teacher`, `conference`, `mother_father`, `AI`) VALUES
('1', '1', '1', '1', 1),
('2', '2', '2', '2', 2),
('3', '3', '3', '3', 3),
('smoker', 'teacher', 'conferencion', 'name-mother-father', 4);

-- --------------------------------------------------------

--
-- Структура таблицы `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `conference` text COLLATE utf8_bin,
  `student` text COLLATE utf8_bin,
  `weight` double DEFAULT NULL,
  `mother_father` text COLLATE utf8_bin,
`AI` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=6 ;

--
-- Дамп данных таблицы `teacher`
--

INSERT INTO `teacher` (`conference`, `student`, `weight`, `mother_father`, `AI`) VALUES
('1', '1', 1, '1', 1),
('2', '2', 2, '2', 2),
('3', '3', 3, '3', 3),
('conferencion', 'student', 50.5, 'name-mother-father', 4),
('conferencion', 'student', 50.5, 'name-mother-father', 5);

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` int(11) NOT NULL,
  `user` text COLLATE utf8_bin,
  `pass` text COLLATE utf8_bin,
  `Name_mother_father` text COLLATE utf8_bin,
  `Adres` text COLLATE utf8_bin,
  `login` text COLLATE utf8_bin
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=15 ;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `user`, `pass`, `Name_mother_father`, `Adres`, `login`) VALUES
(1, 'Email', '', NULL, NULL, NULL),
(2, 'Email', '', NULL, NULL, NULL),
(3, 'Email', '', NULL, NULL, NULL),
(4, 'Emailqqq', '', NULL, NULL, NULL),
(5, 'Email', '', 'name-mother-father', 'Adres', 'login'),
(6, 'q', 'q', 'q', 'q', 'q'),
(7, 'Email', '', 'name-mother-father', 'Adres', 'login'),
(8, 'Email', 'q', 'name-mother-father', 'Adres', 'login'),
(9, 'Email', 'w', 'name-mother-father', 'Adres', 'login'),
(10, 'Email', 'w', 'name-mother-father', 'Adres', 'login'),
(11, 'Email', '10', 'name-mother-father', 'Adres', 'login'),
(12, 'Email', 'q', 'name-mother-father', 'Adres', 'login'),
(13, 'Email', 'e', 'name-mother-father', 'Adres', 'logine'),
(14, 'login', 'pass', 'name-mother-father', 'street', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conference`
--
ALTER TABLE `conference`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `groups`
--
ALTER TABLE `groups`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `kafedra`
--
ALTER TABLE `kafedra`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `smoker`
--
ALTER TABLE `smoker`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
 ADD PRIMARY KEY (`AI`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `conference`
--
ALTER TABLE `conference`
MODIFY `AI` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `groups`
--
ALTER TABLE `groups`
MODIFY `AI` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `kafedra`
--
ALTER TABLE `kafedra`
MODIFY `AI` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `smoker`
--
ALTER TABLE `smoker`
MODIFY `AI` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
MODIFY `AI` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
MODIFY `AI` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
