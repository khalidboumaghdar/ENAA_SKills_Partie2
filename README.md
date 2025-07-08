# 📚 ENAA - Plateforme de Suivi d’Acquisition des Compétences

## 🧠 Contexte
Ce projet a pour but de permettre aux formateurs et apprenants de gérer les **briefs pédagogiques**, les **rendus**, et la **validation des compétences**, selon une architecture **microservices**.

---

## 🏗️ Architecture Microservices

### 🔹 Services :
- **Brief-Service** : Gestion des briefs pédagogiques
- **Apprenant-Service** : Gestion des apprenants et des rendus
- **Validation-Service** : Gestion des validations des compétences

### 🔁 Communication :
- **FeignClient** (ou RestTemplate) pour les appels inter-services
- Chaque service possède sa propre base de données (**MySQL / PostgreSQL**)

### 🐳 Conteneurisation :
- Utilisation de **Docker** et **docker-compose**

---

## 🧩 Fonctionnalités

### 👨‍🏫 Formateur :
- Créer un brief pédagogique
- Associer des compétences à un brief
- Valider les compétences d’un apprenant
- Consulter l’état des compétences validées

### 👨‍🎓 Apprenant :
- S’inscrire sur la plateforme
- Déposer un rendu
- Consulter les validations de ses compétences

### 👨‍💼 Administrateur :
- Consulter toutes les validations des apprenants

---

## 📦 Technologies

| Côté | Tech |
|------|------|
| Backend | Spring Boot, Spring Data JPA |
| Base de données | MySQL, PostgreSQL |
| Tests | JUnit |
| Conteneurisation | Docker, Docker Compose |
| Communication services | FeignClient / RestTemplate |
---

## 🧮  Diagramme
<img width="544" alt="image" src="https://github.com/user-attachments/assets/42412112-0875-4f0f-a550-c86dcd268ceb" />
<img width="610" alt="image" src="https://github.com/user-attachments/assets/68d860a0-941c-432b-86df-121018eec1a0" />
<img width="474" alt="image" src="https://github.com/user-attachments/assets/571442fd-46ba-427c-984d-2540a96ce237" />
---

## ⚙️ Installation

### Prérequis
- Docker & Docker Compose
- Java 17+
- Maven

### Étapes
1. Cloner le projet :
   ```bash
   git clone https://github.com/votre-utilisateur/enaa-competences.git
   cd enaa-competences

