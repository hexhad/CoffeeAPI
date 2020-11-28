# CoffeeAPI
Daddy's Coffee

# Step01
Clone this code and Open it With a Proper IDE

# Step02
RUN the server

# Step03
Open Postman
ViewAllData URL (GET)
http://localhost:8088/api


# Step04
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

      ![image](https://github.com/hexhad/CoffeeAPI/imgs/blob/master/get.png?raw=true)

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

       ![image](https://github.com/hexhad/CoffeeAPI/imgs/blob/master/post.png?raw=true)
      
# Assumption
1. only one user uses this app and api
2. useing only one table and there is a column for orders
      
