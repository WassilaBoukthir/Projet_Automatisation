Feature: Careers

  @VER-TC-1 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Rechercher Featured Jobs par Keywords
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    When Je saisis une <référence valide> dans le champ Keywords
    And Je clique sur SEARCH
    Then Le tableau Offers Jobs s affiche uniquement avec la référence en question
    When Je saisis une <référence invalide> dans le champ Keywords
    And Je clique sur SEARCH
    Then Un message d erreur s affiche
    
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
      | un type de Job  |
      | ADMINISTRATIVE  |
      | BUSINESS        |
      | IT              |
      | OTHER           |

 