Feature: Editing a product Functionality

  @regression
  Scenario Outline: Edit a product and verify it’s edited successfully
    Given user open the home page
    When user search for a product with "<title>" in the home page
    And click on the edit icon for product title "<title>" in product page
    And edit the title "<newTitle>" in the product page
    And edit the description "<description>" in the product page
    And edit the price "<price>" in the product page
    And click on save product button in the product page
    Then app should redirect the user to the home page with the new title "<newTitle>" and "<description>" and "<price>"

    Examples:
      |title               |newTitle         | description                                                       |price   |
      |honey money   |gooo daddy | new product for tesing edit product |150     |