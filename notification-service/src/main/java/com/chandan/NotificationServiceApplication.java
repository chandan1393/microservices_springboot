package com.chandan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

import com.chandan.event.OrderPlacedEvent;

import org.springframework.kafka.support.KafkaHeaders;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	
	/*
	 * @KafkaListener(topics = "notificationTopic") public void
	 * handleNotification(OrderPlacedEvent orderPlacedEvent) { // send out an email
	 * notification log.info("Received Notification for Order - {}",
	 * orderPlacedEvent.getOrderNumber()); }
	 */
	
	
	  @KafkaListener(topics = "${spring.kafka.topic.name}",
	            concurrency = "${spring.kafka.consumer.level.concurrency:3}")
	    public void logKafkaMessages(@Payload OrderPlacedEvent orderPlacedEvent,
	                                 @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
	                                 @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Integer partition,
	                                 @Header(KafkaHeaders.OFFSET) Long offset) {
	        log.info("Received a message contains a user information with id {}, from {} topic, " +
	                "{} partition, and {} offset", orderPlacedEvent.getOrderNumber(), topic, partition, offset);
	        
	    }
	 
}
