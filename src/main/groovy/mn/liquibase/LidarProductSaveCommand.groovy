package mn.liquibase

import io.micronaut.core.annotation.Introspected

import javax.validation.constraints.NotBlank

@Introspected
class LidarProductSaveCommand {

    @NotBlank
    String keyword
    @NotBlank
    String s3_link
    @NotBlank
    Date ingest_date

    LidarProductSaveCommand(String keyword, String s3_link, Date ingest_date){
        this.keyword = keyword
        this.s3_link = s3_link
        this.ingest_date = ingest_date
    }


}
