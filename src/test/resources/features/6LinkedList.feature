@LinkedList
Feature: Testing LinkedList page
   @LinkedList01
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Selguru" and "Se123!@#"
    And The user click on login button
    Then The user redirected to homepage

  @LinkedList02
  Scenario: User navigated to "linked list" page
    Given The user is on the Home page after logged in
    When The user clicks getstarted for LinkedList module
    Then The user redirected to "Linked List"  Page

  @LinkedList03
  Scenario: User navigated to "Introduction" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    Then The user should be directed to "Introduction" of Linked List Page

  @LinkedList04
  Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the "Introduction" after logged in
    When The user clicks "try here" button in the "introduction" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  @LinkedList05
 	Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList06
  Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList07
  Scenario: User navigated to "creating linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks creating linked list link
    Then The user should be directed to "Creating Linked LIst" of Linked List Page

  @LinkedList08
  Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Creating a Linked List" after logged in
    When The user clicks "try here" button in the "creating linked list" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList09
  Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList10
 	Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList11
  Scenario: User navigated to "Types of linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Types of Linked List button
    Then The user should be directed to "Types of Linked List" of Linked List Page

  @LinkedList12
  Scenario: User navigated to tryEditor page with Run button from Types of Linked List
    Given The user is on the "Types of Linked list" after logged in
    When The user clicks "Try Here" button in the "types of linked list" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList13
  Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList14
  Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList15
  Scenario: user navigated to "Implementation linked list in python" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Implement Linked List in Python button
    Then The user should be directed to "Implement Linked List in Python" of Linked List Page

  @LinkedList16
  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the "Implement Linked List in Python" after logged in
    When The user clicks "Try Here" button in the "implemented linked list in python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList17
  Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList18
 Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList19
  Scenario: user navigated to "Traversal" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Traversal button
    Then The user should be directed to "Traversal" of Linked List Page

  @LinkedList20
  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the "Traversal" after logged in
    When The user clicks "Try Here" button in the "traversal" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList21
  Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList22
  Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList23
  Scenario: user navigated to "Insertion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Insertion button
    Then The user should be directed to "Insertion" of Linked List Page

  @LinkedList24
  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given The user is on the "Insertion" after logged in
    When The user clicks "Try Here" button in the "Insertion" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList25
  Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList26
  Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList27
  Scenario: user navigated to "Deletion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Deletion button
    Then The user should be directed to "Deletion" of Linked List Page

  @LinkedList28
  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the "Deletion" after logged in
    When The user clicks "Try Here" button in the "Deletion" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList29
 Scenario Outline: The user is able to run code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
  @LinkedList30
  Scenario Outline: The user is presented with error message for invalid code in Editor for linked list page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'String' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList31
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    And The user clicks on the Practice Questions
    Then The user should be directed to Practice Questions of Linked List Page
