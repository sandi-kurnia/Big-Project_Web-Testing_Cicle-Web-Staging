@Blast-Feature
Feature: Functional Blast Testing

  Background:1.User already open chrome browser
             2.User access "https://staging.cicle.app"
             3.User must already sign in into app
             4.User must be entered into Sekolah QA Cilsy Headquarter Page
             5.User must be entered into Big Project Teams Page

  @CWS-17-Positive-Publish-a-Post
  Scenario:User Publish a Post by Input Text in Title and Description
    Given Navigate user to blast page
      When User click create blast button
        And User click type a tittle field
        And User input text in type a tittle field
        And User click tell your story here field
        And User input text in tell your story here field
        And User click publish button
      Then User success to publish a post

  @CWS-18-Negative-Publish-a-Post
  Scenario:User Publish a Post by Input Empty Text in Title
    Given Navigate user to blast page
      When User click create blast button
        And User click type a tittle field
        And User input empty text in type a tittle field
        And User click tell your story here field
        And User input text in tell your story here field
        And User click publish button
      Then User get notif field parameter not completed

  @CWS-19-Positive-Insert-Files
  Scenario:User Insert Files By Valid Url
    Given Navigate user to blast page
      When User click create blast button
        And User click type a tittle field
        And User input text in type a tittle field
        And User click tell your story here field
        And User input text in tell your story here field
        And User click insert files button
        And User click insert files by url button
        And User click insert file by url field
        And User insert files by valid url
        And User click add button in url menu
        And User click upload Insert Image
      Then User success to insert files by valid url on description

  @CWS-20-Negative-Insert-Files
  Scenario:User Insert Files By Empty Url
    Given Navigate user to blast page
      When User click create blast button
        And User click type a tittle field
        And User input text in type a tittle field
        And User click tell your story here field
        And User input text in tell your story here field
        And User click insert files button
        And User click insert files by url button
        And User click insert file by url field
        And User insert files by empty url
        And User click add button in url menu
      Then User failed to insert files by empty url on description

  @CWS-21-Positive-Upload-Files
  Scenario:User Insert Files By Upload Files
    Given Navigate user to blast page
      When User click create blast button
        And User click type a tittle field
        And User input text in type a tittle field
        And User click tell your story here field
        And User input text in tell your story here field
        And User click insert files button
        And User click upload files button
        And User click browse file button
        And User click upload button by browse file button
      Then User success to insert files by upload files on description

  @CWS-22-Positive-Cheers
  Scenario:User set cheers in blast by input text
    Given Navigate user to blast page
      When User click blast detail
        And User click cheers button
        And User click cheers field
        And User input text on cheers field
        And User click check cheers button
      Then User success to create cheers on post

  @CWS-23-Negative-Cheers
  Scenario:User set cheers in blast by input empty text
    Given Navigate user to blast page
      When User click blast detail
        And User click cheers button
        And User click cheers field
        And User input empty text on cheers field
        And User click check cheers button
      Then User failed to create cheers on blast

  @CWS-24-Positive-Cheers
  Scenario:User delete cheers on blast
    Given Navigate user to blast page
      When User click blast detail
        And User click bubble cheers
        And User click delete cheers
      Then User success to delete cheers

