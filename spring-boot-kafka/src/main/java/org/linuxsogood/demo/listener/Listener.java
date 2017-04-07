package org.linuxsogood.demo.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;


public class Listener {

	@KafkaListener(topics = "tramy-topic", group = "tramy-group")
    public void listen(ConsumerRecord<?, ?> record) {
		System.out.println(record.value());
		System.out.println(record);
	}
 
}