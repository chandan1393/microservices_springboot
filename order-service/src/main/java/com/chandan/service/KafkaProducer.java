/*
 * package com.chandan.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.kafka.core.KafkaTemplate; import
 * org.springframework.stereotype.Service;
 * 
 * import com.chandan.event.OrderPlacedEvent;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * @Service
 * 
 * @Slf4j public class KafkaProducer {
 * 
 * 
 * @Autowired private KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;
 * 
 * public String sendMessage(OrderPlacedEvent orderPlacedEvent){
 * log.info(String.format("Message sent -> %s"));
 * kafkaTemplate.send("notificationTopic", orderPlacedEvent); return "done"; } }
 */