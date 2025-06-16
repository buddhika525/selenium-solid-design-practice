Feature: Login to the app

Scenario: successful login scenario

Given user goes to "Saucedemo site"
When user types "standard_user" as Username and types "secret_sauce" as password
When user clicks on the Login button
Then user should be directed to "Products" page