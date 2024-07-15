CREATE TABLE `chercheur` (
   `id_chercheur` int NOT NULL AUTO_INCREMENT,
   `nom_chercheur` text,
   `prenom_chercheur` text,
   `email_chercheur` text,
   `tel_chercheur` int DEFAULT NULL,
   `photo_chercheur` blob,
   `responsablite_chercheur` text,
   `responsabilite_pedagogique_chercheur` text,
   `type_chercheur` text,
   `mdp` varchar(22) DEFAULT NULL,
   `id_equipe` int DEFAULT NULL,
   `id_labo` int DEFAULT NULL,
   PRIMARY KEY (`id_chercheur`),
   KEY `chercheur_ibfk_1_idx` (`id_equipe`,`id_labo`),
   KEY `chercheur_ibfk_2` (`id_labo`),
   CONSTRAINT `chercheur_ibfk_2` FOREIGN KEY (`id_labo`) REFERENCES `labo` (`id_labo`) ON DELETE CASCADE ON UPDATE CASCADE,
   CONSTRAINT `chercheur_ibfk_3` FOREIGN KEY (`id_equipe`) REFERENCES `equipe` (`id_equipe`) ON DELETE CASCADE ON UPDATE CASCADE
 ) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci