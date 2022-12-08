@Board-Feature
  Feature: Functional Board Testing

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Big Project Teams Page

  @CWS-1-Positive-Add-Board-List
    Scenario:User Add Board List by Input Text in Board List Name
      Given Navigate user to board page
        When User click add list button
            And User click list name field
            And User input text in list name field
            And User click create button
          Then User success to add new board list

  @CWS-2-Negative-Add-Board-List
  Scenario:User Add Board List by Input Empty Text Board List Name
      Given Navigate user to board page
        When User click add list button
            And User click list name field
            And User input empty text in list name field
            And User click create button
          Then User failed to add new board list

  @CWS-3-Positive-Add-Card-List
    Scenario: User Create Card Name by Input Text Card Name
      Given Navigate user to board page
        When User click add card button
            And User click card name field
            And User input valid card name field
            And  User submit add card button
          Then User success to create new card

  @CWS-4-Negative-Add-Card-List
    Scenario: User Create Card Name by Input Empty Card Name
      Given Navigate user to board page
        When User click add card button
            And User click card name field
            And User input empty card name field
            And User submit add card button
          Then User failed to create new card

    @CWS-5-Positive-Create-Label
    Scenario: User Create New Label by Input Text Name and Click Color of Label
      Given Navigate user to board page
        When User click card user
            And User click label button
            And User click add label button
            And User click name label field
            And User input valid name label
            And User click color of label
            And User click create label button
          Then User success to create new label

    @CWS-6-Negative-Create-Label
    Scenario: User Create New Label by Input Empty Name and Click Color of Label
      Given Navigate user to board page
        When User click card user
            And User click label button
            And User click add label button
            And User click name label field
            And User input empty name label
            And User click color of label
            And User click create label button
          Then User failed to create new label

    @CWS-7-Positive-Add-Comment
      Scenario: User Add New Comment by Input Text in Tell Your Comment Here Field
      Given Navigate user to board page
          When User click card user
            And User add new comment field
            And User tell your story field
            And User input valid comment
            And User click post button
          Then User success to add new comment

    @CWS-8-Negative-Add-Comment
    Scenario: User Add New Comment by Input Empty Text in Tell Your Comment Here Field
      Given Navigate user to board page
          When User click card user
            And User add new comment field
            And User tell your story field
            And User input empty comment
            And User click post button
          Then User failed to add new comment

    @CWS-9-Positive-Add-Attachment
    Scenario: User Attaches Image Using Valid URL in Card Name Comment field
      Given Navigate user to board page
        When User click card user
          And User add new comment field
          And User click insert files button in comment card
          And User click files by url button
          And User click files by url field
          And User input valid url field
          And User click add button
          And User click insert upload files by url button
      Then User can view that image showing in card name comment field

    @CWS-10-Negative-Add-Attachment
    Scenario: User Attaches Image Using Invalid URL in Card Name Comment field
      Given Navigate user to board page
        When User click card user
          And User add new comment field
          And User click insert files button in comment card
          And User click files by url button
          And User click files by url field
          And User input invalid url field
          And User click add button
      Then User failed to attaches image using invalid url








