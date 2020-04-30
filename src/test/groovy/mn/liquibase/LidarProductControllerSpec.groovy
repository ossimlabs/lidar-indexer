package mn.liquibase

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Shared

import javax.inject.Inject

@MicronautTest
class LidarProductControllerSpec extends Specification {

    @Shared @Inject
    EmbeddedServer embeddedServer

    @Shared @AutoCleanup @Inject @Client("/")
    RxHttpClient client

    void "test index"() {
        given:
        HttpResponse response = client.toBlocking().exchange("/lidarProducts")

        expect:
        response.status == HttpStatus.OK
    }

    // Test Create
    void "Should create a lidar product with keyword 'IG-88'"() {
        when:
            HttpRequest request = HttpRequest.POST("/lidarProducts/createLidarProduct", '{"keyword": "IG-88", ' +
                    '"s3_link": "https://starwars.s3.amazonaws.com/characters/ig-88.txt", "ingest_date": ' +
                    '"2008-06-17"}')
            HttpResponse response = client.toBlocking().exchange(request)

        then: 'The lidar product was successfully created'
            response.status == HttpStatus.OK

    }

    // Test Read
    void "Should retrieve a lidar product with id = 4"() {
        when:
        HttpRequest request = HttpRequest.GET("/lidarProducts/findById/4")
        HttpResponse response = client.toBlocking().exchange(request)

        then: 'The lidar product record was successfully deleted'
        response.status == HttpStatus.OK

    }

    // Test Update
    void "Should update a lidar product with id = 4"() {
        when:
        HttpRequest request = HttpRequest.PUT("/lidarProducts/updateById/4", '{"keyword": "Darth Vader", ' +
                '"s3_link": "https://starwars.s3.amazonaws.com/characters/darth.txt", "ingest_date": ' +
                '"1977-06-17"}')
        HttpResponse response = client.toBlocking().exchange(request)

        then: 'The lidar product was successfully updated'
        response.status == HttpStatus.OK

    }

    // Test Delete
    void "Should delete a lidar product with id = 6 "() {
        when:
        HttpRequest request = HttpRequest.POST("/lidarProducts/deleteById/7", "")
        HttpResponse response = client.toBlocking().exchange(request)

        then: 'The lidar product record was successfully deleted'
        response.status == HttpStatus.OK

    }
}
