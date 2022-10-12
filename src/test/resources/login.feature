Feature: User can login to an e-commerce website
  Scenario Outline: : Verify users can login to portal with valid credentials
    Given User visits e-commerce website
    When User enters valid "<username>" and "<password>"
    Then User can logged in successfully
    Examples:

    | username | | password |

    | user000@gmail.com | | 12345 |
    | testuser@y.com |    | 12345 |

