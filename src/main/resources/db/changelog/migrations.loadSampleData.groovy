package db.migrations

databaseChangeLog {
	changeSet( author: "teamhercules", id: "30" ) {
		
		comment( 'Add sample data to the lidar_products table' )
		
		[
			[
				ingest_date: '04/06/2020',
				bbox: [ min_x: -180, min_y: -90, max_x: 180, max_y: 90, srs: 4326 ],
				keyword: 'Luke Skywalker',
				s3_link: 'https://starwars.s3.amazonaws.com/characters/luke.txt'
			],
			
			[
				ingest_date: '01/14/2020',
				bbox: [ min_x: -180, min_y: 0, max_x: 0, max_y: 90, srs: 4326 ],
				keyword: 'Obi-Wan Kenobi',
				s3_link: 'https://starwars.s3.amazonaws.com/characters/obi-wan.txt'
			],
			
			[
				ingest_date: '11/01/2019',
				bbox: [ min_x: 0, min_y: 0, max_x: 180, max_y: 90, srs: 4326 ],
				keyword: 'Kylo Ren',
				s3_link: 'https://starwars.s3.amazonaws.com/characters/kylo.txt'
			],
			
			[
				ingest_date: '02/14/2020',
				bbox: [ min_x: -180, min_y: -90, max_x: 0, max_y: 0, srs: 4326 ],
				keyword: 'R2D2',
				s3_link: 'https://starwars.s3.amazonaws.com/characters/r2d2.txt'
			],
			
			[
				ingest_date: '12/24/2019',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'BB8',
				s3_link: 'https://starwars.s3.amazonaws.com/characters/bb8.txt'
			],
		
		].each { record ->
			insert( tableName: 'lidar_products' ) {
				column( name: "ingest_date", value: record.ingest_date )
				column( name: "keyword", value: record.keyword )
				column( name: "s3_link", value: record.s3_link )
				column( name: "bbox", value: "SRID=${record.bbox.srs};POLYGON((${record.bbox.min_x} ${record.bbox.min_y}, ${record.bbox.min_x} ${record.bbox.max_y}, ${record.bbox.max_x} ${record.bbox.min_y}, ${record.bbox.max_x} ${record.bbox.min_y}, ${record.bbox.min_x} ${record.bbox.min_y}))" )
			}
		}
	}
}