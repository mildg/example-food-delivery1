package examplefooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import examplefooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import examplefooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired SotreOrderRepository sotreOrderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_OrderInfoTransfer(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener OrderInfoTransfer : " + paid + "\n\n");


        

        // Sample Logic //
        SotreOrder.orderInfoTransfer(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_CookCancel(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener CookCancel : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        SotreOrder.cookCancel(event);
        

        

    }

}


