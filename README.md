# CoffeeAPI
Daddy's Coffee
http://localhost:8088/api

## Step 1
Clone this code and Open it With a Proper IDE

## Step 2
1. Import database to MySql [/Database/Coffee.sql]
2. RUN the server

## Step 3
Open Postman
ViewAllData URL (GET)
http://localhost:8088/api


## Step 4
Open Postman
ViewAllData URL (PUT)
(this will update only "Order" Value)
### concept if user touches one of product in the "order" should be incerased by one ( order++ ) 
http://localhost:8088/api/{id}

Ex:
###### INPUT
      PUT : http://localhost:8088/api/5

      {
          "order": "2"
      }
      
###### GET

![](imgs/get.png)

###### OUTPUT

      {
          "id": 5,
          "name": "Americano",
          "desc": "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Fuga quae expedita",
          "order": "2",
          "price": "400",
          "img": "https://images.hdqwalls.com/download/morning-coffee-cg-240x320.jpg"
      }
      
###### PUT

![](imgs/put.png)
      
      
# Assumptions
1. only one user uses this app and api
2. user already logged in
3. using only one table and there is a column for orders
      
