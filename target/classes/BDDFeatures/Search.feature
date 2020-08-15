Feature: Search and place order for Vegitable

@Seleniumtest
Scenario: Search for iterms and validate results
Given User is on Greencart Landing Page 
When User Searched for "Brocolli - 1 Kg" Vagitables
Then "Brocoli" should be displayed

@Seleniumtest
Scenario Outline: Search for iterms and then move to checkout page
Given User is on Greencart Landing Page 
When User Searched for <Name> Vagitable
Then added items to cart
And User proceed to checkout page for purchase
Then <Name> should be displayed in check out page

Examples:
|Name           |
|Brocolli - 1 Kg|
|Brocolli - 1 Kg|