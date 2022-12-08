@Board-Feature-Defect/Bug
Feature: Functional Board Testing

  Background:1.User already open chrome browser
  2.User access "https://staging.cicle.app"
  3.User must already sign in into app
  4.User must be entered into Sekolah QA Cilsy Headquarter Page
  5.User must be entered into Big Project Teams Page

  @CWS-25-Negative-Add-Board-List
  Scenario:User Add Board List by Input Empty Text using Spaces button As Empty Character
    Given Navigate user to board page
      When User click add list button
        And User click list name field
        And User input character using space button in board list name field
        And User click create button
      Then User failed to add new board list
    #   Then User success to add new board list

  @CWS-26-Negative-Add-Card-List
  Scenario: User Create Card Name by Input Empty Text using Spaces button As Empty Character
    Given Navigate user to board page
      When User click add card button
        And User click card name field
        And User input character using space button in card name field
        And User submit add card button
      Then User failed to create new card
    #   Then User success to create new card

