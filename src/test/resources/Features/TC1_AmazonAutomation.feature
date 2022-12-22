@Amazon
Feature: Automation Coding Challange

  Scenario: Verifing Amazon product search details
    Given User is on the Amzaon main page
    And User should click on the hamburger menu in the top left corner
    When User should Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.
    And User should click on Televisions under the Tv, Audio & Cameras sub section
    And User should scroll down and filter the results by Brand Samsung
    And User should sort the Samsung results with price High to Low
    When User should click on the second highest priced item (whatever that maybe at the time of automating)
    And User should switch the selected prodect details page
    Then User should verify success message after choosing the product "About this item"
