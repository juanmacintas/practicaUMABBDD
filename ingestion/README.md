# Getting Started

## Overview
Simple ingestion project

### Starting instructions

1. Create a MongoDB instance using docker: 

> docker run -p 27017:27017 --name some-mongo -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=test -d mongo

2. Create a Redis instance using docker:

> docker run --name my-redis -p 6379:6379 -d redis

2. Start the service running: 

> mvn spring-boot:run

3. Check the service, four endpoints are available:

    1. /insert: you can insert a raw element as below:

    > http://localhost:8080/insert
    >
    > {"datasetId":1, "client": "acme", "vendor": "air america", "invoiceCode": "AA343234321", "description": "DALAS - MIAMI Flight", "fiscalYear": "2021", "currency": "dollar", "spend": 121.45, "userName": "jsmith", "defaultCategory": "Travel", "timestamp": "20210612"}

    2. /findAll: you can retrieve all data in database as below:
    
    > http://localhost:8080/findAll
    >
    > [
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
    > ]

    3. /clean: clean the raw data:

    > http://localhost:8080/clean

    4. /getAllClean: retrieve all cleaned data

    >
    > [
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
    > ]