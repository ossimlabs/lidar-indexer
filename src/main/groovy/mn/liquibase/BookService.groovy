package mn.liquibase

import javax.inject.Singleton
import javax.sql.DataSource

@Singleton
class BookService
{
	DataSource dataSource
	BookService(DataSource dataSource) {
		println "dataSource: ${dataSource}"
		this.dataSource = dataSource
	}
}