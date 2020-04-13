package db.migrations

databaseChangeLog {

    changeSet(author: "teamhercules", id: "10") {

        sql {
            comment('Install Postgis geospatial extension')
            'CREATE EXTENSION IF NOT EXISTS postgis;'
        }

    }
}