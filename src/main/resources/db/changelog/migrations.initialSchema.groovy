package db.migrations

databaseChangeLog {
    changeSet(author: "teamhercules", id: "20") {

        comment('Create intial table and schema')
        createTable(tableName: "lidar_products") {

            column(name: "id", autoIncrement: "true", type: "INT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "pk_entity")
            }

            column(name: "ingest_date", type: "DATETIME") {
                constraints(nullable: "true", unique: "false")
            }

            column(name: "bbox", type: "GEOMETRY(POLYGON, 4326)") {
                constraints(nullable: "true", unique: "false")
            }

            column(name: "keyword", type: "VARCHAR(255)") {
                constraints(nullable: "true", unique: "false")
            }

            column(name: "s3_link", type: "VARCHAR(255)") {
                constraints(nullable: "true", unique: "false")
            }

        }
    }
}