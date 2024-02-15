@Tree
Feature: User tests the Tree page on the Ds algo application

	@Tree_S1
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Selguru" and "Se123!@#"
    And The user click on login button
    Then The user redirected to homepage

  @Tree_S2
  Scenario: The user is directed to "Tree" Page
    Given The user is on the "home page" after logged in
    When The user selects Tree item from the drop down menu
    Then The user should be directed to the "Tree" Page

  @Tree_S3
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the "Overview of Trees" of tree Page

  @Tree_S4
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the "overview of trees" after logged in
    When The user clicks "Try Here" button in a "tree" page
    Then The user should be redirected to a page having tryEditor with a Run button to test

  @Tree_S5
  Scenario Outline: The user is able to run code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @Tree_S6
  Scenario Outline: The user is presented with error message for invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "SyntaxError: name 'String1234' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @Tree_S7
  Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Terminologies button
    Then The user should be directed to the "Terminologies" of tree Page

  @Tree_S8
  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the "terminologies page" after logged in
    When The user clicks "Try Here" button in a "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @Tree_S9
  Scenario Outline: The user is able to run code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @Tree_S10
  Scenario Outline: The user is presented with error message for invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @Tree_S11
  Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the "Types of Trees" of tree Page

  @Tree_S12
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given The user is on the "types of trees" after logged in
    When The user clicks "Try Here" button in a "types of tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @Tree_S13
  Scenario Outline: The user is able to run code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @Tree_S14
  Scenario Outline: The user is presented with error message for invalid code in Editor for tree page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @Tree_S15
  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Tree Traversals button
    Then The user should be directed to the "Tree Traversals" of tree Page

  @Tree_S16
  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Traversal illustration button
    Then The user should be directed to the "Traversals-Illustration" of tree Page

  @Tree_S17
  Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary trees button
    Then The user should be directed to the "Binary Trees" of tree Page

@Tree_S18
  Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the types of binary trees button
    Then The user should be directed to the "Types of Binary Trees" of tree Page

  @Tree_S19
  Scenario: The user is able to navigate to Implementation in Python Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation in Python button
    Then The user should be directed to the "Implementation in Python" of tree Page

  @Tree_S20
  Scenario: The user is able to navigate to binary tree traversals Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary tree traversals button
    Then The user should be directed to the "Binary Tree Traversals" of tree Page

  @Tree_S21
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation of Binary Trees button
    Then The user should be directed to the "Implementation of Binary Trees" of tree Page

  @Tree_S22
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Applications of Binary Trees button
    Then The user should be directed to the "Applications of Binary trees" of tree Page

  @Tree_S23
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Search Trees Page
    Given The user is on the "Binary Search Trees" after logged in
    When The user clicks "Try Here" button in a "Binary Search Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @Tree_S24
  Scenario: The user is able to navigate to "Implementation of BST" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation of BST button
    Then The user should be directed to the "Implementation Of BST" of tree Page

  @Tree_S25
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    When The user clicks on the Practice Questions in Overview of Trees
    Then The user should be directed to Practice Questions of tree page Page