package db.migrations

databaseChangeLog {
    changeSet(author: "teamhercules", id: "30") {

        comment('Add sample data to the metadata table')
        insert(tableName:'metadata') {
            //column(name: "id", valueNumeric: "1")
            column(name: "ingest_date", value: "04/06/2020")
            column(name: "keyword", value: "Luke Skywalker")
            column(name: "s3_link", value: "https://starwars.s3.amazonaws.com/characters/luke.txt")
        }

        insert(tableName:'metadata') {
            //column(name: "id", valueNumeric: "2")
            column(name: "ingest_date", value: "01/14/2020")
            column(name: "keyword", value: "Obi-Wan Kenobi")
            column(name: "s3_link", value: "https://starwars.s3.amazonaws.com/characters/obi-wan.txt")
        }

        insert(tableName:'metadata') {
            //column(name: "id", valueNumeric: "3")
            column(name: "ingest_date", value: "11/01/2019")
            column(name: "keyword", value: "Kylo Ren")
            column(name: "s3_link", value: "https://starwars.s3.amazonaws.com/characters/kylo.txt")
        }

        insert(tableName:'metadata') {
            //column(name: "id", valueNumeric: "4")
            column(name: "ingest_date", value: "02/14/2020")
            column(name: "keyword", value: "R2D2")
            column(name: "s3_link", value: "https://starwars.s3.amazonaws.com/characters/r2d2.txt")
        }

        insert(tableName:'metadata') {
            //column(name: "id", valueNumeric: "5")
            column(name: "ingest_date", value: "12/24/2019")
            column(name: "keyword", value: "BB8")
            column(name: "s3_link", value: "https://starwars.s3.amazonaws.com/characters/bb8.txt")
        }

    }
}