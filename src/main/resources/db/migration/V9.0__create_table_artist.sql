CREATE TABLE `artist` (
  `id` bigint(20) NOT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
);

ALTER TABLE `artist`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `artist`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;