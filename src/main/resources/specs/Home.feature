@Home
Feature: Home

  @VER-TC-11 @JREQ-VER-6 @AIO-FOLDER-Home
  Scenario: Careers - Contact US -  scénario Nominal
    Ce cas de test permet à l utilisateur de contacter l entreprise, de poser des questions ou de faire des suggestions en remplissant un formulaire et en l envoyant. L entreprise répond ensuite à sa demande.

    Given Je suis sur la page Home
    When Je clique sur Contact US
    Then Le formulaire est affiché
    When Entrer des données valides
    And Je clique sur Send
    Then Le formulaire est envoyée avec succès
