package lidar.indexer

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import org.locationtech.jts.geom.Polygon

@Entity
@Table(name = "lidar_products")
class LidarProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    Date ingest_date

    String keyword

    String s3_link

    String status

    @JsonSerialize(using = WktGeometrySerializer)
    @JsonDeserialize(using = WktGeometryDeserializer)
    @Column(columnDefinition = 'geometry(Polygon, 4326)')
    Polygon bbox    

}
