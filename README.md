LIDAR-Indexer
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

 
 