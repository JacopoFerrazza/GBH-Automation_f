Feature: GBH Automation (Test)
Description: GBH Automation for main website links 

Scenario: Navigate all main links on http://gbh.com.do
Given user is on GBH Main page 
Then user goes to Services page 
Then user goes Portfolio page  
Then user goes to About Us page
Then user goes to Jobs page 
Then user goes to Blog page 
And goes back to main page  

