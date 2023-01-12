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
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_KakaoNotify(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener KakaoNotify : " + picked + "\n\n");


        

        // Sample Logic //
        Notification.kakaoNotify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_KakaoNotify(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener KakaoNotify : " + accepted + "\n\n");


        

        // Sample Logic //
        Notification.kakaoNotify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_KakaoNotify(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener KakaoNotify : " + rejected + "\n\n");


        

        // Sample Logic //
        Notification.kakaoNotify(event);
        

        

    }

}


