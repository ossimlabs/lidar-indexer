package mn.liquibase

import javax.validation.constraints.NotNull

interface LidarProductRepository  {

    Optional<LidarProduct> findById(@NotNull Integer id);

}
