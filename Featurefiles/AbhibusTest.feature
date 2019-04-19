Feature: AbhiBus

  Scenario: Abhi Bus Ticket booking
    Given open the abhibus website
    And enter the current city and destination city
    And enter the date of journey
    And click on search
    Then select the bus and choose the seat
    And enter the boarding point and book the return ticket
    And chose the bus and select the seat
    And enter the boarding point and click on paymant
