package lidar.indexer

import groovy.transform.CompileStatic
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

import javax.validation.Valid

@CompileStatic
@Controller("/lidarProducts")
class LidarProductController {

    LidarProductRepository lidarProductRepository

    LidarProductController( LidarProductRepository lidarProductRepository )
    {
        this.lidarProductRepository = lidarProductRepository
    }

    @Get("/")
    HttpStatus index() {
        return HttpStatus.OK
    }

    // CREATE
    @Post("/createLidarProduct")
    HttpStatus createLidarProduct(@Body @Valid LidarProduct lidarProduct) {

        lidarProductRepository.save(lidarProduct)
        return HttpStatus.OK
    }

    // READ
    @Get("/findById/{id}")
    Optional<LidarProduct> findLidarProduct(Long id) {

        Optional<LidarProduct> lidarProduct = lidarProductRepository.findById(id)
        return lidarProduct
    }

    // READ (Full list)
    @Get("/findAll")
    List<LidarProduct> findAllLidarProducts() {

        List<LidarProduct> lidarProducts = lidarProductRepository.findAll()
        return lidarProducts.sort {it.id}
    }

    // UPDATE
    @Put("/updateById/{id}")
    HttpStatus updateLidarProduct(Long id, LidarProduct lidarProduct) {

        // Do a findById to get the record we want to update
        Optional<LidarProduct> result = lidarProductRepository.findById(id)
        if (result.isPresent()){
            LidarProduct current = result.get()
            lidarProduct.id = current.id

            // May need an if check here to see if the properties of the
            // incoming lidarProduct are null.  If they are we need
            // to use the 'current' one
            lidarProduct.ingest_date = current.ingest_date

            lidarProductRepository.update(lidarProduct)

            return HttpStatus.OK
        }

        return HttpStatus.NOT_FOUND
    }

    // DELETE
    @Post("/deleteById/{id}")
    HttpStatus deleteLidarProduct(Long id) {

        lidarProductRepository.deleteById(id)
        return HttpStatus.OK
    }

    // TODO: Error message if not found

}



