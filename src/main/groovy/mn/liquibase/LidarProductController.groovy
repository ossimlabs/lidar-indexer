package mn.liquibase

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

import javax.validation.Valid


@CompileStatic
@Controller("/lidarProducts")
class LidarProductController {

    LidarProductRepository lidarProductRepository

    LidarProductController( LidarProductRepository lidarProductRepository )
    {
        this.lidarProductRepository = lidarProductRepository
    }



    // CREATE
    // Should return a status back here when update works
    @Post("/createLidarProduct")
    LidarProduct createLidarProduct(@Body @Valid LidarProduct lidarProduct) {

        return lidarProductRepository.save(lidarProduct)

    }

    // READ
    // Should return a status back here when delete works
    @Get("/findById/{id}")
    Optional<LidarProduct> getLidarProduct(Long id) {

        Optional<LidarProduct> lidarProduct = lidarProductRepository.findById(id)
        return lidarProduct

    }

    // DELETE
    @Post("/deleteById/{id}")
    void deleteLidarProduct(Long id) {

        lidarProductRepository.deleteById(id)

    }

    // Need an update

    // Need a full list






}


