package db

databaseChangeLog {
    include file: 'changelog/migrations.installPostgis.groovy', relativeToChangelogFile: true
    include file: 'changelog/migrations.initialSchema.groovy', relativeToChangelogFile: true
    // Uncomment the line below to seed the database with test data
    // include file: 'changelog/migrations.loadSampleData.groovy', relativeToChangelogFile: true
}