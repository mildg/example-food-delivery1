package examplefooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private String orderId;
    private String menuId;
    private String userId;
}


