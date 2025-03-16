 @VER-TC-5 @JREQ-VER-3 @AIO-FOLDER-Careers
  Scenario: Consulter par Lead Generation Officer
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Featured Jobs
    Then Le tableau Offers Jobs s affiche
    When Je clique sur l offre Job "Lead Generation Officer"
    Then La page Lead Generation Officer s affiche correctement