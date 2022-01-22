Feature: functionalTest

Background: 
    * url 'http://localhost:8080'

Scenario: load data into database

Given path '/insert'
And request {"datasetId":1, "client": "acme", "vendor": "air america", "invoiceCode": "AA343234321", "description": "DALAS - MIAMI Flight", "fiscalYear": "2021", "currency": "dollar", "spend": 121.45, "userName": "jsmith", "defaultCategory": "Travel", "timestamp": "20210612"} 
When method post
Then status 200