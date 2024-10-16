Feature: Adding a product Functionality

  @regression
  Scenario Outline: Add a new product and verify it’s added successfully
    Given user open the home page
    When user click on add new product in the home page
    And enter the title "<title>" in the add product page
    And enter the description "<description>" in the add product page
    And enter the price "<price>" in the add product page
    And click on create product button in the add product page
    Then app should redirect the user to the home page with product with title "<title>" added

    Examples:
      |title                 |description                                                        |price   |
      |ipohone11 pro max     |The Apple iPhone 11 Pro Max will be available for about EGP 19400  |194     |




  Scenario Outline: Add many products
    Given user open the home page
    When user click on add new product in the home page
    And enter the title "<title>" in the add product page
    And enter the description "<description>" in the add product page
    And enter the price "<price>" in the add product page
    And click on create product button in the add product page
    Then app should redirect the user to the home page with product with title "<title>" added

    Examples:
      |title                 |description                                                        |price   |
      |ipohone11 pro max     |The Apple iPhone 11 Pro Max will be available for about EGP 19400  |194     |
      |ipohone12 pro max     |The Apple iPhone 12 Pro Max will be available for about EGP 20000  |200     |
      |ipohone13 pro max     |The Apple iPhone 13 Pro Max will be available for about EGP 30000  |300     |