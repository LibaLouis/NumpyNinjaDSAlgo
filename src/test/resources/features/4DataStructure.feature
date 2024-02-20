@DataStructures-Introduction
Feature: DataStructures-Introduction feature
  
  @DataStructures1
  	Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Sarishshital" and "niti@345"
    And The user click on login button
    Then The user redirected to homepage

   @DataStructures2
  	Scenario: Navigating to DataStructures-Introduction page   
    Given The user is on the "home page" after logged in
    When The user clicks on the Get Started button on Graph or select Stack item from the drop down menu
    Then The user is redirected to "DataStructures-Introduction" Page
    
   @DataStructures3
     Scenario: Navigating DataStructures-Introduction page
     Given The user is in "DataStructures-Introduction" page
     When The user clicks on the Time Complexity link
     Then The user is redirected to "Time Complexity" page
     When The user clicks the Try here link
     Then The user is redirected to "Try Editor" page
    
   @DataStructures4
 	  Scenario Outline: The user is able to run code in Editor 
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @DataStructures5
  	Scenario Outline: The user is presented with error message for invalid code in Editor 
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
   @DataStructures6
    Scenario: The user is able to click and navigate to Practice Questions
    Given The user is on the "Time Complexity" after logged in
    When the user clicks on Practice Questions link
    Then The user is directed to "Practice Questions" page
    