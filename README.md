# ProjetTestAutomatisé

## Description
Le projet **"ProjetTestAutomatisé"** est une solution d'automatisation de tests pour une application Web. Il utilise **Cucumber**, **JUnit**, et **Selenium** pour exécuter des scénarios de tests en BDD (Behavior Driven Development). Ce projet permet de tester les pages de l'application, avec une prise de captures d'écran à chaque échec de test grâce à la fonction `takeScreenShot`.

## Structure du projet
Le projet est structuré comme suit :

### 1. **Paquets principaux**
- `com.projettestautomatisé.bdd` : Contient les définitions des étapes de test, notamment la classe `StepDefinition.java` qui associe les étapes des scénarios avec les méthodes de test en Java.
  
- `com.projettestautomatisé.po` : Contient les classes représentant les objets de pages (Page Object Pattern) :
  - **`CareersPage.java`** : Représente la page de carrières.
  - **`HomePage.java`** : Représente la page d'accueil.
  - **`PageObject.java`** : Classe de base pour d'autres objets de pages.

### 2. **Fichiers de test (Feature Files)**
- **`Careers.feature`** : Scénarios de tests concernant la page des carrières.
- **`home.feature`** : Scénarios de tests pour la page d'accueil.
- **`Direct_Application.feature`** : Scénarios pour la fonctionnalité de candidature directe.

### 3. **Technologies utilisées**
- **JUnit** : Utilisé pour structurer et exécuter les tests.
- **Cucumber** : Permet de définir les tests de manière compréhensible avec des scénarios écrits en Gherkin.
- **Selenium** : Utilisé pour l'automatisation du navigateur et pour interagir avec les éléments de la page.
- **Prise de Capture d'Écran** : Fonction `takeScreenShot` qui prend des captures d'écran lorsque des tests échouent, permettant de visualiser l'état du test à ce moment-là.

## Prérequis

Avant de pouvoir exécuter ce projet, vous devez avoir les outils suivants installés sur votre machine :

- [Java](https://www.java.com/fr/download/) (version recommandée : 11 ou supérieure)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse IDE](https://www.eclipse.org/downloads/) ou un autre IDE compatible avec Maven et JUnit
- [Git](https://git-scm.com/)
- [Selenium](https://www.selenium.dev/)
- [Cucumber](https://cucumber.io/)

## Installation

1. **Cloner le projet** :
   ```bash
   git clone https://github.com/WassilaBoukthir/ProjetTestAutomatisé.git
   
2. **Ouvrir le projet dans Eclipse ou un autre IDE compatible avec Maven**.

Si vous utilisez Eclipse, vous pouvez importer le projet en suivant ces étapes :
   -->Allez dans File > Import > Existing Maven Projects.
   -->Sélectionnez le répertoire où vous avez cloné le projet et cliquez sur Finish.
   
3. **Si vous utilisez un autre IDE compatible avec Maven (comme IntelliJ IDEA)**
 Vous pouvez simplement ouvrir le répertoire du projet et il sera automatiquement détecté comme un projet Maven.
Installer les dépendances : Ouvrez le terminal et exécutez la commande suivante à la racine du projet pour télécharger toutes les dépendances nécessaires :

  -->  **mvn clean install**
   
## Fonctionnalités
   * Tests d'automatisation : Les tests sont écrits en Gherkin dans des fichiers .feature. Ces tests sont ensuite exécutés avec Cucumber et JUnit.
   * Page Object Model (POM) : Les pages de l'application sont modélisées dans des classes Java sous com.projettestautomatisé.po pour une meilleure gestion et réutilisation du code.
   * Prise de capture d'écran : Chaque fois qu'un test échoue, une capture d'écran est prise automatiquement à l'aide de la fonction **takeScreenShot** de Selenium.

## Auteurs
Wassila Boukthir - Développeur Principal
GitHub
