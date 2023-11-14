
Feature: Signin Feature

## Sign in with Valid Usernam and Valid Password
    Scenario Outline: Verify username in homepage match username in signin page
    Given Navigate to Katalon Signin page
    When User enter valid <username> and valid <password>
    And User click Sign in button
    And User click avatar icon on the top of the screen
    Then Username MUST MATCH the <username> in step 2

    #Examples:      
      #| username                    | password        |
      #| namson01092001.it@gmail.com | 4&-!shG2EFeqFTc | 
  
      
      
      