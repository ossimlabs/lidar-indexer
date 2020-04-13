package db

databaseChangeLog {
    include file: 'changelog/migrations.installPostgis.groovy', relativeToChangelogFile: true
    include file: 'changelog/migrations.initialSchema.groovy', relativeToChangelogFile: true
    include file: 'changelog/migrations.loadSampleData.groovy', relativeToChangelogFile: true
}