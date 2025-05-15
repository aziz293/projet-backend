# projet-backend
# Gestion simplifiée d'une bibliothèque

## Description

Ce projet est une API REST pour gérer les livres et leurs auteurs dans une bibliothèque. Il utilise Spring Boot, Spring Data JPA, et H2 Database.

## Prérequis

- Java 17+
- Maven
- IDE (Visual Studio Code)
- MySQL

## Installation

1. Cloner le dépôt :

```bash
git clone https://github.com/aziz293/projet-backend.git

## Construire le projet avec Maven :
mvn clean install

##Exécution
Exécuter la classe ProjetBackendApplication dans votre IDE.

##Ou utiliser la commande Maven :
mvn spring-boot\:run

## Exemples d'appels d'API

##✅ Créer un auteur (Windows cmd)
curl -X POST -H "Content-Type: application/json" -d "{\"nom\":\"Doe\",\"prenom\":\"John\"}" http://localhost:8080/auteurs

##✅ Lister tous les auteurs
curl http://localhost:8080/auteurs

##✅ Créer un livre
curl -X POST -H "Content-Type: application/json" -d "{\"titre\":\"Spring Boot\",\"isbn\":\"123456789\",\"auteur\":{\"id\":1}}" http://localhost:8080/livres

##✅ Lister tous les livres
curl http://localhost:8080/livres

##✅ Lister les livres d’un auteur
curl http://localhost:8080/livres/auteur/1

##✅ Modifier un livre
curl -X PUT -H "Content-Type: application/json" -d "{\"titre\":\"Spring Boot Updated\",\"isbn\":\"987654321\"}" http://localhost:8080/livres/1
##✅ Supprimer un livre
curl -X DELETE http://localhost:8080/livres/1

## Fonctionnalités implémentées
#Créer un auteur
#Lister tous les auteurs
#Créer un livre lié à un auteur
#Lister tous les livres
#Afficher les livres d'un auteur donné
#Modifier un livre
#Supprimer un livre