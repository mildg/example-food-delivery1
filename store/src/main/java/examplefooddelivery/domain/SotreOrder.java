package examplefooddelivery.domain;

import examplefooddelivery.domain.Accepted;
import examplefooddelivery.domain.Rejected;
import examplefooddelivery.domain.CookStarted;
import examplefooddelivery.domain.CookFinished;
import examplefooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="SotreOrder_table")
@Data

public class SotreOrder  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String menuId;

    @PostPersist
    public void onPostPersist(){


        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static SotreOrderRepository repository(){
        SotreOrderRepository sotreOrderRepository = StoreApplication.applicationContext.getBean(SotreOrderRepository.class);
        return sotreOrderRepository;
    }




    public static void orderInfoTransfer(Paid paid){

        /** Example 1:  new item 
        SotreOrder sotreOrder = new SotreOrder();
        repository().save(sotreOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(sotreOrder->{
            
            sotreOrder // do something
            repository().save(sotreOrder);


         });
        */

        
    }
    public static void cookCancel(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        SotreOrder sotreOrder = new SotreOrder();
        repository().save(sotreOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(sotreOrder->{
            
            sotreOrder // do something
            repository().save(sotreOrder);


         });
        */

        
    }


}
