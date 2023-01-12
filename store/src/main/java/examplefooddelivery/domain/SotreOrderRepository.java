package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="sotreOrders", path="sotreOrders")
public interface SotreOrderRepository extends PagingAndSortingRepository<SotreOrder, Long>{

}
