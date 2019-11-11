Feature: Boost Mobile Web Site Test
Scenario Outline: Landing Page Test
Given Inializaing browser
And user enter "https://www.boostmobile.com/?intnav=TopNav:Logo"
And User cllik on login in button

When User put <phone> and <pin>
Then user access account page

Examples:
|phone			|pin|
|7573587255		|1987|
|7576601027		|1996|
