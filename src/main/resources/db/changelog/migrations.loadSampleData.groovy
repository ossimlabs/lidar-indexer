package db.migrations

databaseChangeLog {
	changeSet( author: "teamhercules", id: "30" ) {
		
		comment( 'Add sample data to the lidar_products table' )
		
		[
			[
				ingest_date: '04/06/2020',
				bbox: [ min_x: -180, min_y: -90, max_x: 180, max_y: 90, srs: 4326 ],
				keyword: 'Damsok.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Damsok.las'
			],
			
			[
				ingest_date: '01/14/2020',
				bbox: [ min_x: -180, min_y: 0, max_x: 0, max_y: 90, srs: 4326 ],
				keyword: 'Cheoleang.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Cheoleang.las'
			],
			
			[
				ingest_date: '11/01/2019',
				bbox: [ min_x: 0, min_y: 0, max_x: 180, max_y: 90, srs: 4326 ],
				keyword: 'Siboljur.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Siboljur.las'
			],
			
			[
				ingest_date: '02/14/2020',
				bbox: [ min_x: -180, min_y: -90, max_x: 0, max_y: 0, srs: 4326 ],
				keyword: 'Salabang.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Salabang.las'
			],
			
			[
				ingest_date: '05/10/2017',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Tamjung.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Tamjung.las'
			],

			[
				ingest_date: '01/20/2016',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Nabadawan.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Nabadawan.las'
			],

			[
				ingest_date: '04/01/2018',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Okwin.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Okwin.las'
			],

			[
				ingest_date: '12/01/2020',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Thedan.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Thedan.las'
			],

			[
				ingest_date: '07/24/2020',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Cotanila.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Cotanila.las'
			],

			[
				ingest_date: '08/09/2020',
				bbox: [ min_x: -45, min_y: -45, max_x: 45, max_y: 45, srs: 4326 ],
				keyword: 'Rodiz.las',
				s3_link: 'https://lidar.s3.amazonaws.com/data/Rodiz.las'
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