# Getting Started

## Overview
Simple ingestion project

### Starting instructions

1. Create a PostgreSQL instance using docker: 

> docker run -p 5432:5432 --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres

2. Start the service running: 

> mvn spring-boot:run

3. Check the service, two endpoints are available:

    1. /insert: you can insert a raw element as below:

    > http://localhost:8080/insert
    >
    > {"datasetId":1, "client": "acme", "vendor": "air america", "invoiceCode": "AA343234321", "description": "DALAS - MIAMI Flight", "fiscalYear": "2021", "currency": "dollar", "spend": 121.45, "userName": "jsmith", "defaultCategory": "Travel", "timestamp": "20210612"}

    2. /findAll: you can retrieve all data in database as below:
    
    > http://localhost:8080/findAll
    >
    >     {
    >         "id": 1,
    >         "datasetId": 1,
    >         "client": "acme",
    >         "vendor": "air america",
    >         "invoiceCode": "AA343234321",
    >         "description": "DALAS - MIAMI Flight",
    >         "fiscalYear": "2021",
    >         "currency": "dollar",
    >         "spend": 121.45,
    >         "timestamp": "1970-01-01T05:36:50.612+00:00",
    >         "userName": "jsmith",
    >         "defaultCategory": "Travel"
    >     }
