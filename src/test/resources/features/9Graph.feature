@Graph
Feature: Graph: Launch the DS-Algo portal and test Graph module
  
 @Graph_S1 
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Selguru" and "Se123!@#"
    And The user click on login button
    Then The user redirected to homepage

  @Graph_S2
  Scenario: The user is able to navigate to home page
    Given The user is on the "home page" after logged in
    When The user clicks on the Get Started button on Graph or select Stack item from the drop down menu
    Then The user is redirected to the "Graph" page
    
  @Graph_S3
  Scenario: The user is able to navigate to Graph page
    Given The user is on the "Graph url" after logged in
    When The user clicks on the Graph link on Graph page
    Then The user should be redirected to "Graph Graph url" page
    
  @Graph_S4
  Scenario: The user should be redirected to tryeditor page with run button to test python code
    Given The user is on the "Graph url" after logged in
    And The user clicks on the Graph link on Graph page
    When The user clicks on "Tryhere" button on "Graph Graph url" page
    Then The user should be redirected to tryEditor page with Run button
   
  @Graph_S5
  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @Graph_S6
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
  @Graph_S7
  Scenario: The user is able to navigate to graph page and click on Graph Representations link
    Given The user is on the "Graph url" after logged in
    When The user clicks on Graph Representations link
    Then The user is navigated to "Graph Representations url" page

  @Graph_S8
  Scenario: The user should be redirected to tryeditor page with run button to test python code
     Given The user is on the "Graph url" after logged in
    When The user clicks on Graph Representations link
    And The user clicks on "Tryhere" button on "Graph Representations url" page
    Then The user should be redirected to tryEditor page with Run button

  @Graph_S9
  Scenario Outline: The user is able to run code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @Graph_S10
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @Graph_S11
  Scenario: The user is able to navigate to graph url and click on Practice Questions
    Given The user is on the "Graph url" after logged in
    When The user clicks on the Graph link on Graph page
    And the user clicks on Practice Questions link
    Then The user is directed to "graph practice url" page
    