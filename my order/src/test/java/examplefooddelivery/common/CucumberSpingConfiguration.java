package examplefooddelivery.common;


import examplefooddelivery.MyOrderApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MyOrderApplication.class })
public class CucumberSpingConfiguration {
    
}
