Feature: Checkout

    Scenario: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    Then the total price should be 40c

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
