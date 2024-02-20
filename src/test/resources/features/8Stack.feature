@Stack
Feature: Stack: Luanch the DS-Algo portal and test Stack module
  
 	@Stack_S1
  Scenario: The user is logged in to DS Algo portal
   Given The user is on Signin page of DS Algo portal
   When The user enter valid "Selguru" and "Se123!@#"
   And The user click on login button
   Then The user redirected to homepage

  @Stack_S2
  Scenario: The user is directed to "Stack" Page
    Given The user is on the "home page" after logged in
    When The user selects Stack item from the drop down menu
    Then The user should be directed to "Stack" Page

  @Stack_S3
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be directed to "Operations in Stack" Page

 	@Stack_S4
  Scenario Outline: The user is navigating to a page having tryEditor from Operations in Stack page to enter valid code
    Given The user is on the "Operations in Stack page" after logged in
    When The user clicks "Try Here" button in "stack" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |


  @Stack_S5
   Scenario Outline: The user is presented with error message for invalid code in Editor 
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

 	@Stack_S6
  Scenario: The user is able to navigate to "Implementation" Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Implementation button
    Then The user should be directed to Implementation Page

  @Stack_S7
  Scenario Outline: The user is navigating to Implementation page having an tryEditor to run valid code
    Given The user is on the "Stack Implementation page" after logged in
    When The user clicks "Try Here" button in "stack Implementation" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |


 	@Stack_S8
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @Stack_S9
  Scenario: The user is able to navigate to "Applications" in stack Page
    Given The user is on the "Stackpage" after logged in
    When The user clicks on the Applications button
    Then The user should be directed to Applications Page

  @Stack_S10
  Scenario Outline: The user is navigating to Applications page having an tryEditor to run valid code
    Given The user is on the "Application stack page" after logged in
    When The user clicks "Try Here" button in "stack Applications" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |


  @Stack_S11
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

 	@Stack_S12
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Practice Questions button
    Then The user should be directed to Practice Questions  Page    