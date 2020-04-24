package mn.liquibase

import groovy.transform.CompileStatic
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import com.fasterxml.jackson.databind.ObjectMapper;

@CompileStatic
@Controller("/lidarProduct")
class LidarProductController {

    LidarProductService lidarProductService

    LidarProductController(LidarProductService lidarProductService){
        this.lidarProductService = lidarProductService
    }

    @Get("/")
    HttpStatus index(){
        return HttpStatus.OK
    }

    @Get(uri = "/get/{id}")
    LidarProduct lidarProduct(Integer id) {

        LidarProduct lp = lidarProductService.getLidarProduct(id)
        return lp

    }


}


