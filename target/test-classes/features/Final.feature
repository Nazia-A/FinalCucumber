Feature: Validate functionality on https://techfios.com/test/104/

  Scenario: @SkyBlueBackground
    Given "Set SkyBlue Background" button exists
    When I click on the button
    Then the background color changes to sky blue

  Scenario: @WhiteBackground
    Given "Set SkyWhite Background" button exists
    When I click on the button
    Then the background color changes to white