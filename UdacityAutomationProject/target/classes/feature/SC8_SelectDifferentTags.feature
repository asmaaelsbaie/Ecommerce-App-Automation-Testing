@smoke
  Feature:
    Scenario: SC8- Logged user could select different tags
      Given click on search field
      When search with "tag" of product
      Then  select awesome tag
      Then  select computer tag
