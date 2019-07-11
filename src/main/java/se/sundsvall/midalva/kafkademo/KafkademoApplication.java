package se.sundsvall.midalva.kafkademo;

import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class KafkademoApplication {
    
    private static final Logger LOG = LoggerFactory.getLogger(KafkademoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplication.class, args);
	}


}
