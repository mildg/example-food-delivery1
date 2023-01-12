package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class SotreOrderHateoasProcessor implements RepresentationModelProcessor<EntityModel<SotreOrder>>  {

    @Override
    public EntityModel<SotreOrder> process(EntityModel<SotreOrder> model) {

        
        return model;
    }
    
}
