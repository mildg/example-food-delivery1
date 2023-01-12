package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Accepted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String address;
    private String menuId;
}
