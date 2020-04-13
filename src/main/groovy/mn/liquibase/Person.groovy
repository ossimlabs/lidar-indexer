package mn.liquibase

import groovy.transform.CompileStatic
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@CompileStatic
class Person {
    @Id
    //@AutoPopulated
    UUID id
}
