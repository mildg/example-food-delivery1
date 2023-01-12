package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String address;
    private String menuId;

    public DeliveryFinished(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryFinished(){
        super();
    }
}
