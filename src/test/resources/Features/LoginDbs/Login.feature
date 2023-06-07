Feature: DBS  - login
  As a user
  I want to perform login on DBS Indonesia
  and i can view my home page

  @Login_Successfully
  Scenario: User has success to login DBS
    Given user open DBS login page
    When user input email and password
    And user click button login
    Then user can views success notification
    And user direct to secure area page

  @Login_Unsuccessfully
  Scenario: User has failed to login DBS
    Given user open DBS login page
    When user input email and wrong password
    And user click button login
    Then user can views password invalid