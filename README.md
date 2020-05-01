lidar-indexer
---
This application utilizes Micronaut data, the groovy liquibase dsl plugin, and  the liquibase spatial plugin. It
 installs the Postgis geospatial extension for PostgreSQL in the database, creates the table schema, and adds sample
  data
  including sample geospatial bbox data. 

### Requirements
- PostgreSQL must be installed
- The Postgis spatial extension must be installed

### Running the app
1. From the command line create a database named "lidar_db": `createdb -U postgres lidar_db`
2. Run the project from Intellij, or from the command line: `gradle run`

### API Examples
##### Create:
curl -X "POST" "http://localhost:8080/lidarProducts/createLidarProduct" -H 'Content-Type: application/json; charset=utf-8' -d '{  "keyword": "Phasma", "s3_link": "https://starwars.s3.amazonaws.com/characters/phasma.txt" }'\n

##### Read:
curl -X "GET" http://localhost:8080/lidarProducts/findById/4

##### Update:
curl -X "PUT" "http://localhost:8080/lidarProducts/updateById/4" -H 'Content-Type: application/json; charset=utf-8' -d '{ "keyword": "Jango", "s3_link": "https://starwars.s3.amazonaws.com/characters/jango.txt" }'

##### Delete:
curl -X "POST" http://localhost:8080/lidarProducts/deleteById/3
 
 
