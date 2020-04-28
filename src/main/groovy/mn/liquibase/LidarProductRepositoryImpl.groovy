//package mn.liquibase
//
//import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
//import io.micronaut.spring.tx.annotation.Transactional
//
//import javax.inject.Singleton
//import javax.persistence.EntityManager
//import javax.persistence.PersistenceContext
//import javax.validation.constraints.NotNull

//@Singleton
/*class LidarProductRepositoryImpl implements LidarProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    LidarProductRepositoryImpl(@CurrentSession EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    Optional<LidarProduct> findById(@NotNull Integer id) {
        return Optional.ofNullable(entityManager.find(LidarProduct.class, id))
    }
}*/
