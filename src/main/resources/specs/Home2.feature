 @VER-TC-12 @JREQ-VER-6 @AIO-FOLDER-Home
  Scenario: Careers - Contact US-  scénario Invalide
    Ce cas de test permet à l utilisateur de contacter l entreprise, de poser des questions ou de faire des suggestions en remplissant un formulaire et en l envoyant. L entreprise répond ensuite à sa demande.

    Given Je suis sur la page Home
    When Je clique sur Contact Us
    When Le formulaire est affiché
    And Entrer des données Invalides
    And Je clique sur Send
    Then Un message d erreur s affiche