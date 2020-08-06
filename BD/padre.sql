-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-08-2020 a las 11:07:50
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `padre`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hijos`
--

CREATE TABLE `hijos` (
  `id` int(10) UNSIGNED NOT NULL,
  `padre_id` int(10) UNSIGNED NOT NULL,
  `nombre_H` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido_H` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `padres`
--

CREATE TABLE `padres` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hijos_padre_id_foreign` (`padre_id`);

--
-- Indices de la tabla `padres`
--
ALTER TABLE `padres`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `hijos`
--
ALTER TABLE `hijos`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `padres`
--
ALTER TABLE `padres`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD CONSTRAINT `hijos_padre_id_foreign` FOREIGN KEY (`padre_id`) REFERENCES `padres` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
