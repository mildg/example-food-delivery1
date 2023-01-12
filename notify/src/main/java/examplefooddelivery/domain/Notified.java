package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;
    private String userId;
    private String message;

    public Notified(Notification aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
