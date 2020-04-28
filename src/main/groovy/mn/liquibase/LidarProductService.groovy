//package mn.liquibase
//
//import javax.inject.Singleton;
//
//@Singleton
//class LidarProductService {
//
//    LidarProductRepository lidarProductRepository
//
//    LidarProductService(LidarProductRepository lidarProductRepository){
//        this.lidarProductRepository = lidarProductRepository
//    }
//
//    LidarProduct getLidarProduct(Integer id){
//
//        LidarProduct lp = lidarProductRepository.findById(id).orElse(null)
//        return lp
//    }
//
//}
