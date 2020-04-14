package mn.liquibase

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
        println "FOOBAR!!!"
        Micronaut.run(Application)
    }
}