package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String address;
    private String menuId;

    public CookStarted(SotreOrder aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
