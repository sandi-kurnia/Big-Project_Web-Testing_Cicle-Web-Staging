@GroupChat-Feature
Feature: Functional GroupChat Testing

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Big Project Teams Page

  @CWS-11-Positive-Send-Message
  Scenario:User Send Message in Group Chat by Input Text
   Given Navigate user to group chat page
    When User click type message here field
      And User input text in type message here field
      And User click send button
    Then User can view that message success to send in group chat

  @CWS-12-Negative-Send-Message
  Scenario:User Send Message in Group Chat without Input Text
    Given Navigate user to group chat page
      When User click type message here field
        And User input empty text in type message here field
        And User click send button
      Then User failed to send message in group chat

  @CWS-13-Positive-Delete-Message
  Scenario:User Delete Message in Group Chat
    Given Navigate user to group chat page
      When User click text ballon message
        And User click Option button on ballon message
        And User click delete message button
      Then User get pop up notification delete message
        When User click delete button
      Then User success to delete message

  @CWS-14-Positive-Attaches-file
  Scenario:User Attaches with Supported Format File in Group Chat
    Given Navigate user to group chat page
      When User click type message here field
        And User Upload Supported File
      Then User successful to attach file in group chat

  @CWS-15-Negative-Attaches-file
  Scenario:User Attaches with Unsupported Format File in Group Chat
    Given Navigate user to group chat page
      When User click type message here field
        And User Upload unsupported File
      Then User failed to attach file in group chat

  @CWS-16-Positive-Download-Image
  Scenario:User Download Image in Group Chat
    Given Navigate user to group chat page
        When User click download image on ballon message
      Then User able to view downloaded image









