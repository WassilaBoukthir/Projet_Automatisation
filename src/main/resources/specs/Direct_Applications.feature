 Feature: Careers
 
  @VER-TC-9 @JREQ-VER-4 @AIO-FOLDER-Careers
  Scenario: Careers - Direct Application - Scénario Nominal
    Given Je suis sur la page Home
    When Je clique sur Careers
    And Je clique sur Direct Application
    Then Un formulaire est affiché
    And J entre des données valides
    When Je clique sur Apply
    Then Le formulaire est envoyé avec succès