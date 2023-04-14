Feature: Sauce Demo Test Connexion

	@TEST_POEI23-365
	Scenario Outline: Sauce Demo Test Connexion
		Given I open authentication
		When I add username "<login>"
		And I add password  "<password>"
		And I click to validate
		Then Im in homepage

		Examples:
			|login          |password|
			|standard_user  |secret_sauce|

