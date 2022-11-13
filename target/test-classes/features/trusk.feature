@paraleltesting
Feature: Trusk
@trusk1
  Scenario: Accéder au site web de Trusk
    Given Aller dans la page de Google
    When Chercher le mot clé "Trusk"
    Then Vérifier que le premier résultat de recherche est "Trusk livre tout, tout de suite"
    And Cliquer dessus
    And Vérifier que le résultat est bien "https://trusk.com/fr/"

  @trusk2
  Scenario: Vérifier que les liens DEVENIR TRUSKER et TRUSK BUSINESS fonctionnent et se dirigent vers la bonne page.

    Given Aller la page de Trusk
    When Cliquer desus le DEVENIR TRUSKER
    Then Verifier le lien et la page "https://trusk.com/fr/truskers"
    And Retour à la page Trusk
    And Cliquer sur le TRUSK BUSINESS
    And Vérifier le lien et la page "https://trusk.com/fr/business"