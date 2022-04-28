@smoke
  Feature:
    Scenario:  Logged user could filter with color
      Given selects Category and hover to open sub-Category
      When  filter sub-Category with color
      Then  find product with the selected color
