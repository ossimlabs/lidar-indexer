package mn.liquibase

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class LidarProduct {

    @Id
    @GeneratedValue
    Integer id = 999

    Date ingest_date

    String bbox // This is nullable in db, so we will come back to it later

    String keyword = "Leia Organa"

    String s3_link = "https://starwars.s3.amazonaws.com/characters/leia.txt"

}
