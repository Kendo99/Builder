Feature: Checkout

    @tag5
    Scenario Outline: Enter details into login page
        Given I launch the webpage
        When I select the modal window
        And I enter a "<username>" and "<password>"
        And I login
        Then I should be successfully logged in
        Examples:
            | username | password |
            | Dick     | Turpin   |

    @tag5 @ignore
    Scenario: Enter name and address details for a signup form
        And I enter a valid first name and last name
        And I enter a valid address
        And I enter a valid zipcode
        When I click on the sign up button
        Then I should see a successful receipt page

    @tag5 @ignore
    Scenario Outline: Checkout a banana
    Given the price of a "<fruit>" is "<cost>"
    When I checkout quantity "<quantity>"
    Then the total price should be "<totalPrice>"

    Examples:
      | fruit  | cost | quantity | totalPrice |
      | banana | 40   | 1        | 40         |
      | apple  | 80   | 3        | 240        |

    @tag5 @ignore
    Scenario: Enter data and Submit form
    And I enter a valid first name
    And I enter a valid last name
    And I enter a valid email address
    And I enter comments
    When I click on the submit button
    Then the information should successfully be submitted via the contact us form


    #Scenario Outline: Checkout bananas
    #Given the price of a "banana" is 40c
    # here will be invokved
    #When I checkout <count> "banana"
    #Then the total price should be <total>c
    #And its a bla

     # Examples:
     # | count | total |
     # | 1     |  40   |
     # | 2     |  80   |


  #Scenario Outline: Transfer of savings
  #Given I have <amountOne> in my <currentAccount>
  #And there is <amountTwo> in my <savingsAccount>
  #When I transfer <creditAmount> from my current account to my savings account
  #Then I should see the new balance of <currentBalance> in my current account
  #And a new balance of <savingsBalance> in my savings account


   # Examples:
   #   | savingsAccount     | amountOne      | currentAccount    |  amountTwo      | currentBalance | savingsBalance | creditAmount |
   #   | 548544545          | 500            | 969696             |  1000           | 700           | 800            |   300        |


  #Scenario: Two bananas scanned separately
   # Given the price of a "banana" is 40c
   # When I checkout 1 "banana" And I checkout 1 "banana"
   # Then the total price should be 80c

  #Scenario: A banana and an apple
    #Given the price of a "banana" is 40c
    #And the price of a "apple" is 25c
    #When I checkout 1 "banana"
    #And I checkout 1 "apple"
    #Then the total price should be 65c

    # the context / the set-up
    # the event
  # the outcome


 # Scenario: To cook a breakfast
 #  Given it is the morning
  #  When I cook the bacon and
  #  And butter the bread
  #  Then I make the sandwich
  #  And eat it

  #  Scenario: I can turn on the tv and watch my programme
   #   Given the tv is currently off
   #   And the tv comes on
    #  Then I turn the channel
    #  And I should be able to watch my  programmme

    #  Scenario: To go to work
     #   Given its the morning and time for work
     #   When my alarm goes off
     #   And wakes me up so I can get dressed
     #   Then I get the train
     #   And go to the office
