Feature: Validating the adactin hotel page

  Scenario: Validating the cancel booking with user credentials
    Given User is on login page
    When User enter a valid login details "<username>","<password>"
      | jackiechan |
      | vasudev123 |
    Then User should enrty all search hotel fields   "<location>","<hotels>","<roomType>","<roomNumber>","<checkInDate>","<checkOutDate>","<aRoom>","<cRoom>"
      | location | hotels         | roomType | roomNumber | checkInDate | checkOutDate | aRoom   | cRoom    |
      | London   | Hotel Sunshine | Double   | 1 - One    | 07/12/2021  | 08/12/2021   | 1 - One | 0 - None |
    And User sholud select the hotel and continue
    And User sholud fill all the fields  "<firstName>","<lastName>","<address>","<cardNumber">,"< cardType>","< expDate >","< expYear>" ,"< cvv >"
      | firstName | lastName | address | cardNumber       | cardType | expDate | expYear | cvv |
      | raja      | ram      | chennai | 4521452145214521 | VISA     | May     |    2022 | 467 |
    Then User sholud verify the message "Booking Confirmation";
