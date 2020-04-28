package mn.liquibase

import io.micronaut.data.annotation.Repository

import io.micronaut.data.repository.CrudRepository

// Using JPA here
@Repository
interface LidarProductRepository extends CrudRepository <LidarProduct, Long>
{

    Optional<LidarProduct> findById(Long id);

}
