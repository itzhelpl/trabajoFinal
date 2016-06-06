-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 06-06-2016 a las 17:29:26
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `hemodialisis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datoperson`
--

CREATE TABLE IF NOT EXISTS `datoperson` (
  `IdPac` varchar(15) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Dom` varchar(25) NOT NULL,
  `FecNac` varchar(20) NOT NULL,
  `NoAfil` varchar(15) NOT NULL,
  `Tel` varchar(15) NOT NULL,
  `FecIngre` varchar(20) NOT NULL,
  `FecSub` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
