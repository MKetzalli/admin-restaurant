-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-09-2019 a las 23:53:37
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdrestaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventarios`
--

CREATE TABLE IF NOT EXISTS `inventarios` (
  `Cve_Producto` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Sucursal` varchar(30) NOT NULL,
  `Producto` varchar(30) NOT NULL,
  `Cantidad` int(10) unsigned NOT NULL,
  `Marca` varchar(30) DEFAULT NULL,
  `Proveedor` varchar(30) NOT NULL,
  PRIMARY KEY (`Cve_Producto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `inventarios`
--

INSERT INTO `inventarios` (`Cve_Producto`, `Sucursal`, `Producto`, `Cantidad`, `Marca`, `Proveedor`) VALUES
(1, 'Roma', 'Chile Morron', 4, '', 'Local'),
(2, 'Insurgentes', 'Frijol', 3, 'FelizJol', 'Walmart'),
(3, 'Insurgentes', 'Refresco', 40, 'Coca-Cola', 'Walmart');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
  `No_Empleado` int(11) NOT NULL AUTO_INCREMENT,
  `Sucursal` varchar(30) NOT NULL,
  `Nombre` text NOT NULL,
  `Apellido` text NOT NULL,
  `Edad` int(11) NOT NULL,
  `Sueldo` float NOT NULL,
  PRIMARY KEY (`No_Empleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`No_Empleado`, `Sucursal`, `Nombre`, `Apellido`, `Edad`, `Sueldo`) VALUES
(1, 'Insurgentes', 'Emanuel', 'Rosales', 32, 7050),
(2, 'Insurgentes', 'Alberto', 'Gutierrez', 22, 5010.5),
(3, 'Roma', 'Maria', 'Sanchez', 24, 5010);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `Producto` varchar(30) NOT NULL,
  `Precio` float unsigned NOT NULL,
  `Marca` varchar(30) DEFAULT NULL,
  `Cve_Venta` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Cve_Venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`Producto`, `Precio`, `Marca`, `Cve_Venta`) VALUES
('Tamal Oaxaqueño', 43.5, '', 1),
('Enchiladas Verdes', 50, '', 2),
('Refresco', 15, 'Coca-Cola', 3),
('Chile Relleno', 63, '', 4),
('Jugo', 15, 'Del Valle', 5);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
