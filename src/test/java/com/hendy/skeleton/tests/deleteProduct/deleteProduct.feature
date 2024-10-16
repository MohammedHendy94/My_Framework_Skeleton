Feature: deleting a product Functionality

  @regression
  Scenario Outline: Delete a product and verify it’s deleted successfully
    Given user open the home page
    When user search for a product with "<title>" in the home page
    And click on the delete icon in the home page
    Then product should be deleted
    And not exist anymore on the home page search with the previous title "<title>"

    Examples:
      |title               |
      |Sleek Fresh Pizza   |
