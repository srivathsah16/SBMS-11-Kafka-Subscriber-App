package com.srivath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.srivath.constants.KafkaConstants;

@SpringBootApplication
public class Sbms11KafkaSubscriberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms11KafkaSubscriberAppApplication.class, args);
	}

	@KafkaListener(topics = KafkaConstants.KAFKA_TOPIC, groupId = "TEST_GROUP_ID")
	public void SubscribeMsg(String order) {
		System.out.println("Msg received from Kafka topic" + order);
	}

}
