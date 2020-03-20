#Author: Giovanni Gómez Restrepo
# giovannyg32@gmail.com


Feature: Register in advantage online shopping
				 as a user i want to register into platform
				 for buy stuffs that i need

  Scenario: Register Advantage
    Given User enter in create new account
    When User enter data test
    |Username |Password|Confirm |Email            |Firstname|Lastname|Phonenumber|
    |giovanni1|Giova123|Giova123|giova@yopmail.com|Giovanni |Gómez R |31111111   |
    Then User click on register
