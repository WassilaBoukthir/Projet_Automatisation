 @VER-TC-2 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Rechercher Featured Jobs par Country
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    And Je saisis un pays valide uniquement dans le champ Country
    And Je clique sur SEARCH
    Then Le tableau Offers Jobs s affiche avec le pays sélectionné
    When Je saisis un pays différent de Tunisia dans le champ Country
    And Je clique sur SEARCH
    Then Un message d erreur s affiche

  @VER-TC-3 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario Outline: Rechercher Featured Jobs par Job Type
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    And Je saisis <un type de Job> valide
    And Je clique sur SEARCH
    Then Le tableau Offers Jobs s affiche avec le Job Type en question
    When Je saisis "other" ou "administrative" dans le champ Job Type
    And Je clique sur SEARCH
    Then Un message d erreur s affiche

    Examples:
      | un type de Job   |
      | ADMINISTRATIVE   |
      | BUSINESS        |
      | IT              |
      | OTHER           |

  @VER-TC-4 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario Outline: Rechercher Featured Jobs par Keywords & Country & Job Type
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    When Je saisis <Job Type>, <Keywords> et <COUNTRY> valides
    And Je clique sur SEARCH
    Then Le tableau Offers Jobs s affiche avec le Job Type, la Référence et le Country en question
    When Je saisis un Country et Keywords invalides avec un Job Type valide
    Then Un message d erreur s affiche

    Examples:
      | Job Type       | Keywords     | COUNTRY  |
      | ADMINISTRATIVE | LGO-Jan2025  | TUNISIA  |
      | BUSINESS       | BA-Jan-2025  |          |
      | IT             | SCA-Jan-2025 |          |
      | OTHER          | SADJ-Jan-2025|          |

  @VER-TC-5 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Consulter par Lead Generation Officer
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    Then Le tableau Offers Jobs s affiche
    When Je clique sur l offre Job "Lead Generation Officer"
    Then La page Lead Generation Officer s affiche correctement

  @VER-TC-6 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Consulter par Business Analyst
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    Then Le tableau Offers Jobs s affiche
    When Je clique sur l offre Job "Business Analyst"
    Then La page Business Analyst s affiche correctement

  @VER-TC-7 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Consulter par Senior Cloud Architect
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    Then Le tableau Offers Jobs s affiche
    When Je clique sur l offre Job "Senior Cloud Architect"
    Then La page Senior Cloud Architect s affiche correctement

  @VER-TC-8 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Consulter par Senior Analyst Developer Java/J2EE
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    Then Le tableau Offers Jobs s affiche
    When Je clique sur l offre Job "Senior Analyst Developer Java/J2EE"
    Then La page Senior Analyst Developer Java/J2EE s affiche correctement

  @VER-TC-9 @JREQ-VER-4 @AIO-FOLDER-Careers
  Scenario: Careers - Direct Application - Scénario Nominal
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Direct Application
    Then Un formulaire est affiché
    And J entre des données valides
    When Je clique sur Apply
    Then Le formulaire est envoyé avec succès

  @VER-TC-10 @JREQ-VER-4 @AIO-FOLDER-Careers
  Scenario: Careers - Direct Application - Scénario Invalide
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Direct Application
    Then Le formulaire est affiché
    And J entre des données invalides
    When Je clique sur Apply
    Then Un message d erreur s affiche

