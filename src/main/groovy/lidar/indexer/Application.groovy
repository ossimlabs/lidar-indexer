package lidar.indexer

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
        info = @Info(
                title = "LIDAR Indexer",
                version = "0.1",
                description = "Indexes the output of LIDAR Converter Server so that it can be viewed from LIDAR UI",
                license = @License(name = "Apache 2.0", url = "https://foo.bar"),
                contact = @Contact(url = "https://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        )
)
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}
